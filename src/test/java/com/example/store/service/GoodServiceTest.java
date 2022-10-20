package com.example.store.service;

import com.example.store.model.Good;
import com.example.store.repository.GoodRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodServiceTest {

    private  GoodService goodService;

    private GoodRepository goodRepo;

    public  void  service(){
        this.goodService=goodService;
    }

    public void serve(){
        this.goodRepo=goodRepo;
    }



    @Test
    public void  testThatBookIsAdded(){
      Good good = new Good();


    }

}