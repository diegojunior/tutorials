package br.com.poc.foobah.service;

import br.com.poc.foobah.dto.Book;

import java.util.Collection;

public interface BookService {
    Collection<Book> getBooks();

    Book addBook(Book book);
}
