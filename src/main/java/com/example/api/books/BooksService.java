package com.example.api.books;

import com.example.api.books.dto.BooksDTO;
import com.example.api.interfaces.IBooks;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api.schemas.Books;

import javax.swing.*;
import java.util.List;

@Service
public class BooksService {
    @Autowired
    private IBooks books;

    public List<Books> getAll(){
        return books.findAll();
    }

    public Books createBook(BooksDTO booksDTO){
        ModelMapper modelMapper = new ModelMapper();
        Books bookToSave = modelMapper.map(booksDTO,Books.class);
        return books.save(bookToSave);
    }

    public String deleteBook(String id) {
        System.out.println("---->"+ id +"<-- eliminado");
        books.deleteById(id);
        return id;
    }

    public Books updateBook(BooksDTO booksDTO){
        ModelMapper update = new ModelMapper();
        Books updateData = update.map(books, Books.class);
        return books.save(updateData);
    }


}

