package spring5webapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring5webapp.model.Book;
import spring5webapp.repositories.BookRepository;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public ResponseEntity<Iterable<Book>> getBooks() {
        Iterable<Book> book = bookRepository.findAll();

        return new ResponseEntity(book, OK);
    }

    @RequestMapping("/allBooks")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }

}
