package com.vikas.docker_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class WebController {
    @GetMapping("/hello")
    public String getMessege(){
        return "hello";
    }
}
