package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.mowang.pojo.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Spring-MVC-Demo
 * mvc请求
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/06 21:18
 **/
@Controller
@RequestMapping("param")
public class ParamController {

    /**
     * @description: servletAPi方式获取参数
     * @author: Xuan Li
     * @date: 2021/10/6 22:53
    */
    @RequestMapping("/servletAPi")
    public String servletAPi(HttpServletRequest httpServletRequest){
        String user = httpServletRequest.getParameter("user");
        Object sex = httpServletRequest.getParameter("sex");
        System.out.println(user);
        System.out.println(sex);
        return "target";
    }

    @RequestMapping("/testParam")
    public String testParam(@RequestParam(value = "username",required = false,defaultValue = "李煊") String user, String sex, String[] hobby){
        System.out.println(user);
        System.out.println(sex);
        System.out.println(Arrays.toString(hobby));
        return "target";
    }

    @RequestMapping("/testHeader")
    public String testHeader(@RequestHeader(value = "host") String host,@CookieValue("Idea-c928d5a5") String cookie){
        System.out.println(host);
        System.out.println(cookie);
        return "target";
    }

    @RequestMapping("/testBean")
    public String testHeader(User user){
        System.out.println(user);
        return "target";
    }

}
