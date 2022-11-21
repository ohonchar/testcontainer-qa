package org.example.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.example.entity.Book;
import org.example.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    @NonNull
    public BookRepository repository;

    public Book saveBook(Book book) {
        return this.repository.save(book);
    }

    public List<Book> getBooks() {
        return this.repository.findAll();
    }
}
