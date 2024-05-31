package com.example.tdd;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class BookService {
    private IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    public List<Book> getBooksByAuthor(String author) {
//        return bookRepository.findAllBooks().stream()
//                .filter(book -> book.getAuthor().equals(author))
//                .collect(Collectors.toList());
//    }

    public List<Book> getBooksByAuthor(String author, String message,List<Book> books) {
        List<Book> allBooks = bookRepository.findAllBooks();
        if (allBooks == null) {
            return Collections.emptyList();
        }
        return bookRepository.findAllBooks().stream()
             .filter(book -> author.equals(book.getAuthor()))
                .collect(Collectors.toList());
    }

}
