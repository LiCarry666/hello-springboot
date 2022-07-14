package com.lyc.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringbootApplication.class, args);
        System.out.println("springboot running");
        System.out.println("springboot runnable");
        System.out.println("springboot successful");
        System.out.println("springboot successful");
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(String name){
        return "hello:"+name;
    }

}
