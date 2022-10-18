package com.example.store.repository;

import com.example.store.model.Good;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GoodRepository extends MongoRepository<Good, String> {
}
