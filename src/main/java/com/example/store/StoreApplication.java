package com.example.store;

import com.example.store.model.Good;
import com.example.store.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StoreApplication {

    @Autowired
    private  GoodRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }



    public  void run(String ...args) throws  Exception{
        Good customer1= new Good("1", "sugar", "4000");
        Good customer2= new Good("2", "bread", "400");
        Good customer3= new Good("3", "rice", "3500");
        Good customer4= new Good("4", "chocolate", "900");

        repo.save(customer1);
        repo.save(customer2);
        repo.save(customer3);
        repo.save(customer4);

        List<Good>customers= repo.findAll();

        for (Good c:customers){
            System.out.println(c.toString());
        }




    }

}
