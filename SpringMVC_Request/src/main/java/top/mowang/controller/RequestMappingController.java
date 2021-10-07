package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Spring-MVC-Demo
 * mvc请求
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/06 21:18
 **/
@Controller
@RequestMapping("request")
public class RequestMappingController {

    /**
     * value可以设置一个请求对应多个请求地址
     * method设置请求方式
     * @author: Xuan Li
     * @date: 2021/10/6 21:30
    */
    @RequestMapping(value = {"/target","test"},method = RequestMethod.POST)
    public String target(){
        return "target";
    }

    /**
     * @description: GetMapping表示get请求
     * @author: Xuan Li
     * @date: 2021/10/6 21:46
    */
    @GetMapping("testGet")
    public String test(){
        return "target";
    }

    /**
     * @description: params表示必须携带的参数 ！params表示不能携带的参数,headers请求头信息
     * @author: Xuan Li
     * @date: 2021/10/6 21:53
    */
    @GetMapping(value = "testParams",params = "password",headers = "host=localhost:8080")
    public String params(){
        return "target";
    }

    /**
     * ?匹配任意一个字符
     * *匹配0或多个字符
     * **表示任意一层或多层目录
     * @author: Xuan Li
     * @date: 2021/10/6 22:12
    */
    @SuppressWarnings("all")
//    @GetMapping(value = "testAnt?")
//    @GetMapping(value = "testAnt*")
    @GetMapping(value = "/**/testAnt")
    public String testAnt(){
        return "target";
    }

    /**
     * @description: restful风格
     * @author: Xuan Li
     * @date: 2021/10/6 22:38
    */
    @RequestMapping("/testPath/{id}/{name}")
    public String testPath(@PathVariable("id")Integer id,@PathVariable String name){
        System.out.println(id+" "+name);
        return "target";
    }

}
