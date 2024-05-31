package com.example.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import java.util.*;

public class BookServiceTest {

    private BookService bookService;

    @BeforeEach
    public void setUp() {

        IBookRepository bookRepository = new FakeRepositoryForTest();
        bookService = new BookService(bookRepository);


    }

    @Test
    public void testGetBooksByAuthor() {
        FakeRepositoryForTest.booksList = List.of(
                new Book("1","Test Driven Development","Kent Beck")
        );
         List<Book> books = bookService.getBooksByAuthor("Kent Beck","No books found",FakeRepositoryForTest.booksList);
        Assertions.assertEquals(1, books.size());
        Assertions.assertEquals("Test Driven Development", books.get(0).getTitle());
    }

    @Test
    public void testGetBooksByAuthor_NoBooksFound() {
        List<Book> books = bookService.getBooksByAuthor("Unknown Author","No books found",FakeRepositoryForTest.booksList);
        Assertions.assertEquals(0, books.size());
    }
}
