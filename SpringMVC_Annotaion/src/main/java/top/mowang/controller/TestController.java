package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring-MVC-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/09 22:43
 **/
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
