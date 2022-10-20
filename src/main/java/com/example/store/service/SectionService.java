package com.example.store.service;


import com.example.store.exception.SectionNotFoundException;
import com.example.store.model.Good;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SectionService {



    public Optional<Good> findSectionById(String id);
    public List<Good> sectionList() throws SectionNotFoundException;

}
