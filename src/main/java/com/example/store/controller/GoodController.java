package com.example.store.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {


    @RequestMapping(value = "/detail")
    public String allGoodDetails(){
        return "";
    }
}
