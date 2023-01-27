package com.hg.crud.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Books")
public class BookDTO {

    @Id
    private String _id;
    private String title;
    private String author;
    private String genre;
    private Integer year;

    public BookDTO() {
    }

    public BookDTO(String _id, String title, String author, String genre, Integer year) {
        this._id = _id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
