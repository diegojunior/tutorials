package br.com.poc.foobah.repository;

import br.com.poc.foobah.repository.model.BookData;

import java.util.Collection;
import java.util.Optional;

public interface BookRepository {

    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);

}
