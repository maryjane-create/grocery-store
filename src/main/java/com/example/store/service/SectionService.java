package com.example.store.service;


import com.example.store.exception.SectionNotFoundException;
import com.example.store.model.Good;
import com.example.store.repository.SectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectionService {

    @Autowired
    private SectionRepo repo;

    public Optional<Good> findSectionById(String id){
        Optional<Good> section= repo.findById(id);
        return section;
    }

    public List<Good> sectionList() throws SectionNotFoundException {
        return  repo.findAll();
    }

}
