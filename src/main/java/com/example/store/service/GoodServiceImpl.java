package com.example.store.service;

import com.example.store.model.Good;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class GoodServiceImpl implements  GoodService{

    private Map<String, Good> goods= new HashMap<String, Good>();

    @Override
    public List<Good> findAllBooks() {
        return null;
    }

    @Override
    public Good saveGood(Good good, String id) {
        String newId=id;
        good.setId(id);
        good.setName(good.getName());
        good.setPrice(good.getPrice());
        goods.put(newId, good);
        return good;
    }

    @Override
    public Good findGoodById(String id) {
        for (Map.Entry<String, Good> good :
                goods.entrySet()){
            if (good.getKey().equals(id)){
                return (Good) good;
            }
        }
        return null;
    }

    @Override
    public void deleteGood(Good good) {

    }

    @Override
    public void add(Good good) {

    }
}
