package com.naukri.login;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @GetMapping("/hello")
    public String greeting(){
        return "Hello World";
    }
}
