package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring-MVC-Demo
 * hello mvc
 *
 * @author : Xuan Li
 * @website : https://mowangblg.top
 * @date : 2021/10/06 19:51
 **/
@Controller
@SuppressWarnings("all")
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/target")
    public String target(){
        return "target";
    }

}
