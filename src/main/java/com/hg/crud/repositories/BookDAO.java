package com.hg.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hg.crud.models.BookDTO;

@Repository
public interface BookDAO extends MongoRepository<BookDTO, String> {
}
