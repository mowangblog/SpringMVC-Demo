package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.mowang.pojo.User;

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

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveAllUser(User user){
        System.out.println("保存用户信息"+user);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateAllUser(User user){
        System.out.println("修改用户信息"+user);
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable String id){
        System.out.println("根据id"+id+"查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable String id){
        System.out.println("根据id"+id+"删除用户信息");
        return "success";
    }
}
