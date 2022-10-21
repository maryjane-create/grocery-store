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



    public  String toString(){
        return String.format("");
    }

    @Test
    public void  testThatBookIsAdded(){
      Good good = new Good();
      Good good1= new Good();
      good.setName("rice");
      good.setPrice("900");
      good.setId("5");
      good1.setId("9");
        System.out.println(good.toString());
        System.out.println(good1.toString());



    }

}