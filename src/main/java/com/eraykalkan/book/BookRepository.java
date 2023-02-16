package com.eraykalkan.book;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    @ConfigProperty(name = "books.genre", defaultValue = "Sci-Fi")
    String genre;

    public List<Book> getAllBooks() {
        return List.of(
                Book
                        .builder()
                        .id(1)
                        .title("Some Book")
                        .author("Somebody")
                        .yearOfPublication(2020)
                        .genre(genre)
                        .build(),
                Book
                        .builder()
                        .id(2)
                        .title("Some Other  Book")
                        .author("Somebody Else")
                        .yearOfPublication(2020)
                        .genre(genre)
                        .build());
    }

    public Optional<Book> getById(Integer id) {
        return getAllBooks().stream().filter(book -> book.getId().equals(id)).findFirst();
    }


}
