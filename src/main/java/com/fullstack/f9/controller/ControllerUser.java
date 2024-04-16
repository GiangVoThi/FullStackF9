package com.fullstack.f9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerUser {

    @GetMapping("/helloUser")
    public String doGetHelloUser(@RequestParam("UserName1") String userName1,
                                 @RequestParam("UserName2") String userName2){
        System.out.println("UserName1 = "+ userName1);
        System.out.println("UserName2 = "+ userName2);
        return "user/hello-user";
    }
}
