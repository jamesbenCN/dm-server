package com.jt.dm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/helloApi")
    public String world() {
        return "helloworld1";
    }
}
