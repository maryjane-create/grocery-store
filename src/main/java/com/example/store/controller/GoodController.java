package com.example.store.controller;


import com.example.store.dto.GoodDto;
import com.example.store.model.Good;
import com.example.store.repository.GoodRepository;
import com.example.store.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodController {


   private GoodRepository repository;

   @Autowired
    public void GoodRepositoryNotNull(GoodRepository repository){
        this.repository=repository;
    }

    @RequestMapping(value = "/detail")
    public Good goodDetails(Good good, GoodService goodService){
        good.setName(good.getName());
        good.setPrice(good.getPrice());
        return good ;
    }

    public  String saveGood(Good newStock, GoodService goodService){
        newStock.setName(newStock.getName());
        newStock.setPrice(newStock.getPrice());
        newStock.setId(newStock.getId());
        goodService.add(newStock);
        return "product with id "+ newStock.getId()+"has been added";

    }

    @RequestMapping("/all-goods")
    public List<Good> getAllGoods(){
        return  null;
    }




}
