package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${app.page-size}")
    String name;
    @Value("${sampleint}")
    int sint;

    @RequestMapping("/")
    public String sample2() {
        System.out.println("sample2 called");
        return "fine.html";
    }

    @RequestMapping("/home")
    public String sample() {

        System.out.println(name);
        return "index.html";
    }

}
