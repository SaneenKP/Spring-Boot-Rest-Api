package com.saneen.simplerestapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.saneen.simplerestapi.entities.LoadDetails;
import com.saneen.simplerestapi.services.LoadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {



    @Autowired
    private LoadService loadService;

    @GetMapping("/load")
    public List<LoadDetails> getLoadDetails(){
        return this.loadService.getLoadDetails();
    }

    @GetMapping("/load/{shipperID}")
    public LoadDetails getLoad(@PathVariable UUID shipperID){
        return loadService.getLoad(shipperID);
    }

    @PostMapping(path="/load" , consumes = "application/json")
    public LoadDetails addLoad(@RequestBody LoadDetails load){
        return this.loadService.addLoad(load);
    }

    
}
