package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring-MVC-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/07 22:23
 **/
@Controller
public class ViewController {

    @RequestMapping("/testView")
    public String testView(){
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:https://mowangblog.top";
    }
}
