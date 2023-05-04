package com.fxs.jenkins.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FANGXS
 */
@RestController
public class HelloController {


    @GetMapping("/helloTest")
    public String helloTest(){
        return "hello jenkins";
    }
}
