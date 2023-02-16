package com.eraykalkan.book;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @GET
    public List<Book> getAll() {
        return bookRepository.getAllBooks();
    }

    @GET
    @Path("{id}")
    public Optional<Book> getById(@PathParam("id") Integer id) {
        return bookRepository.getById(id);
    }

}