package com.saneen.simplerestapi.controller;

import java.util.List;

import com.saneen.simplerestapi.entities.LoadDetails;
import com.saneen.simplerestapi.services.LoadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private LoadService loadService;

    @GetMapping("/load")
    public List<LoadDetails> getLoadDetails(){
        return loadService.getLoadDetails();
    }

    
}
