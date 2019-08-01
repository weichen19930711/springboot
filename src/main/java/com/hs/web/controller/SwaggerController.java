package com.hs.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class SwaggerController {

    @RequestMapping(value = "/api/v1", method = RequestMethod.GET)
    public String api() {
        System.out.println("test");
        return "swagger/index";
    }

}
