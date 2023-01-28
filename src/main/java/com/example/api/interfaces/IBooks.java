package com.example.api.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.api.schemas.Books;
public interface IBooks extends MongoRepository<Books,String> {

}
