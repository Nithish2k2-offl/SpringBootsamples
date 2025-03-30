package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String sample2(){
        return "fine.html";
    }
    @RequestMapping("/home")
    public String sample() {
        System.out.println("hi");
        return "index.html";
    }

}
