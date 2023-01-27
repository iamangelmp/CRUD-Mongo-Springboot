package com.hg.crud.controllers;

//import com.hg.crud.models.ProductDTO;
import com.hg.crud.repositories.BookDAO;
//import com.hg.crud.repositories.IProductDAO;

import com.hg.crud.models.BookDTO;
//import com.hg.crud.repositories.IProductDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
        RequestMethod.DELETE })
@RequestMapping("/api/books")
public class BookController {


    @Autowired
    private BookDAO repository;

    @PostMapping("/book")
    public BookDTO create(@Validated @RequestBody BookDTO p) {
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<BookDTO> readAll() {
        return repository.findAll();
    }

    @PutMapping("/book/{id}")
    public BookDTO update(@PathVariable String id, @Validated @RequestBody BookDTO p) {
        return repository.save(p);
    }

    @DeleteMapping("/book/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }


}
