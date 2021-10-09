package top.mowang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring-MVC-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/09 21:44
 **/
@RestController
public class InterceptorController {

    @RequestMapping("testInterceptor")
    public String testInterceptor() {

        return "success";
    }

    @RequestMapping("testExceptionHandler")
    public String testExceptionHandler() {
        int i = 1 / 0;
        return "success";
    }

}
