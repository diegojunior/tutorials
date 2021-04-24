package br.com.poc.foobah.exception;

import br.com.poc.foobah.dto.Book;

public class DuplicateBookException extends RuntimeException {

    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}