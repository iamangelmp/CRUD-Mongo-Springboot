package com.example.api.books;

import com.example.api.books.dto.BooksDTO;
import com.example.api.schemas.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.util.BsonUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/books/")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("")
    public ResponseEntity<List<Books>> findAll(){
        return ResponseEntity.ok(booksService.getAll());
    }

    @PostMapping("")
    public ResponseEntity<Books> createBook(@RequestBody BooksDTO book){
        System.out.println(book.toString());
        return ResponseEntity.ok(booksService.createBook(book));
    }

   @PutMapping("{id}")
    public ResponseEntity<Books> updateBook(@RequestBody BooksDTO booksDTO, @PathVariable("id") String id){
        System.out.println("------>"+id);

        return ResponseEntity.ok(booksService.updateBook(booksDTO));
    }


    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") String id) {
        System.out.println("Delete book for id");
        System.out.println(id);
        return ResponseEntity.ok(booksService.deleteBook(id));
    }




}
