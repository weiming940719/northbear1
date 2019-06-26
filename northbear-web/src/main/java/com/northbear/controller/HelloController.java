package com.northbear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Auther: SJQ
 * @Date: 2019/6/26
 */
@RequestMapping("/hello/")
@Controller
public class HelloController {

    @RequestMapping("index")
    public String index(HttpServletRequest request){
        return "index";
    }
}
