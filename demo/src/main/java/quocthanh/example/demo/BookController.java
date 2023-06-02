package quocthanh.example.demo.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import quocthanh.example.demo.entity.Book;
import quocthanh.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quocthanh.example.demo.services.CategoryService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showAllbooks(Model model){
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books",books);
        return "book/list";
    }
    @GetMapping("/add")
    public String addBookForm(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "book/add";
    }

    @PostMapping("/add")
    public String addBookForm(@ModelAttribute("book") Book book){
        bookService.addBook(book);
        return "redirect:/books";
    }
}