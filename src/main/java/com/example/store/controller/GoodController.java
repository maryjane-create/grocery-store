package com.example.store.controller;


import com.example.store.dto.GoodDto;
import com.example.store.model.Good;
import com.example.store.service.GoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodController {


    @RequestMapping(value = "/detail")
    public Good goodDetails(Good good, GoodService goodService){
        good.setName(good.getName());
        good.setPrice(good.getPrice());
        return good ;
    }

    public List<Good> getAllGoods(){

    }



//    @RequestMapping(value = "/update-list", method = RequestMethod.POST)
//    public  String updateGoodList(){
//
//
//    }

}
