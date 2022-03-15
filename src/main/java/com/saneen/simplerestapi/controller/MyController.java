package com.saneen.simplerestapi.controller;

import java.util.List;

import com.saneen.simplerestapi.entities.LoadDetails;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/load")
    public String load(){
        return "this is load";
    }

    public List<LoadDetails> getLoadDetails(){
        
    }

    
}
