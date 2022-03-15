package com.saneen.simplerestapi.services;

import java.util.List;
import java.util.UUID;

import com.saneen.simplerestapi.entities.LoadDetails;

public interface LoadService {

    public List<LoadDetails> getLoadDetails();
    public List<LoadDetails> getLoad(UUID shipperID);
    
}
