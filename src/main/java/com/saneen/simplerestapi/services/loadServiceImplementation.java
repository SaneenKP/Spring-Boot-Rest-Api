package com.saneen.simplerestapi.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.saneen.simplerestapi.entities.LoadDetails;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Service;

@Service
public class loadServiceImplementation implements LoadService{

    
    List<LoadDetails> list;

    public loadServiceImplementation() {

        list = new ArrayList<>();
        list.add(new LoadDetails("delhi", "jaipur", "chemicals", "canter", 1, 100, "this is just a comment", UUID.randomUUID(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-mm-yyyy"))));
        list.add(new LoadDetails("kerala", "bangalore", "food", "canter", 1, 100, "this is just a comment", UUID.randomUUID(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-mm-yyyy"))));
    }



    @Override
    public List<LoadDetails> getLoadDetails() {
        return list;
    }
    
}
