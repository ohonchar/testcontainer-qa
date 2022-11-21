package org.example.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.example.entity.Book;
import org.example.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {
    @NonNull
    public BookService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create/book")
    public Book createTodo(@Valid @RequestBody Book book) {
        return this.service.saveBook(book);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/fetch/books")
    public List<Book> createTodo() {
        return this.service.getBooks();
    }
}
