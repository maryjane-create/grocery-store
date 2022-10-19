package com.example.store.service;

import com.example.store.model.Good;
import com.example.store.repository.GoodRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodServiceTest {

    private  GoodService goodService;
    private GoodRepository goodRepo;



    @Test
    public void  testThatBookIsAdded(){
        Good good = new Good();
        good.setName("milk");
        good.setPrice("56");
//        Assertions.assertEquals("5",good.getId() );
        Assertions.assertEquals("56", good.getPrice());
        Assertions.assertEquals(1, goodRepo.findAll().size());
    }

}