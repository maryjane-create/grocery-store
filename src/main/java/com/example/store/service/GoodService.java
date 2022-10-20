package com.example.store.service;

import com.example.store.model.Good;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface GoodService {

public List<Good> findAllBooks();

public Good saveGood(Good good, String id);

public  Good findGoodById(String id);

public  void  deleteGood(Good good);

}
