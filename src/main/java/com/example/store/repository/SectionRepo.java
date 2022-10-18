package com.example.store.repository;

import com.example.store.model.Good;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SectionRepo extends MongoRepository<Good, String> {
}
