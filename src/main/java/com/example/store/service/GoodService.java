package com.example.store.service;

import com.example.store.model.Good;
import com.example.store.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class GoodService {

    @Autowired
    private GoodRepository repository;

    public List<Good> allGoods(){
        return repository.findAll();
    }

    public Optional<Good> findGood(String id){
        Optional<Good> good=repository.findById(id);
        return  good;
    }



}
