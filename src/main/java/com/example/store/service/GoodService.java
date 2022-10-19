package com.example.store.service;

import com.example.store.model.Good;
import com.example.store.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;


@Service
public class GoodService {

    @Autowired
    private GoodRepository repository;

    @ResponseBody
    public List<Good> allGoods(){
        return repository.findAll();
    }
    

    @ResponseBody
    public Optional<Good> findGood(String id){
        Optional<Good> good=repository.findById(id);
        return  good;
    }


    public Good add(Good good) {
       Good newGood= repository.insert(good);
       repository.save(newGood);
       return newGood;
    }
}
