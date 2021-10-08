package top.mowang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.mowang.dao.UserDao;
import top.mowang.pojo.User;

import java.util.Collection;

/**
 * Spring-MVC-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/07 23:11
 **/
@Controller
public class RestfulController {
    /*
     * 使用restful模拟用户的增删改查
     * /user GET 查询所有用户信息
     * /user/1 GET 根据用户id查询用户信息
     * /user post 添加用户信息
     * /user/1 Delete 删除用户信息
     * /user put 修改用户信息
    */


    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(Model model){
        System.out.println("查询所有用户信息");
        Collection<User> all = userDao.getAll();
        model.addAttribute("user",all);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveAllUser(User user){
        System.out.println("保存用户信息"+user);
        userDao.save(user);
        return "redirect:/user";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateAllUser(User user){
        System.out.println("修改用户信息"+user);
        userDao.save(user);
        return "redirect:/user";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable Integer id,Model model){
        System.out.println("根据id"+id+"查询用户信息");
        model.addAttribute("user",userDao.get(id));
        return "user_update";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable Integer id){
        System.out.println("根据id"+id+"删除用户信息");
        userDao.delete(id);
        return "redirect:/user";
    }
}
