package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring-MVC-Demo
 * 主页控制器
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/06 21:24
 **/
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
