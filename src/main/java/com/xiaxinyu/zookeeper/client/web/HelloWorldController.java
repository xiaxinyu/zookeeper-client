package com.xiaxinyu.zookeeper.client.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public String HelloWorld() {
        return "Hello World!";
    }
}
