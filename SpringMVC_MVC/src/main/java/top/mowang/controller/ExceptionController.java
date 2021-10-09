package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Spring-MVC-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/09 22:13
 **/
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {ArithmeticException.class})
    public String testException(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
