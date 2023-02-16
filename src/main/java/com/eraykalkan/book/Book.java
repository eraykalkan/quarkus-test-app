package com.eraykalkan.book;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Book {

    Integer id;
    String title;
    String author;
    Integer yearOfPublication;
    String genre;

}
