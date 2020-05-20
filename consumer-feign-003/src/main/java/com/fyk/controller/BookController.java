package com.fyk.controller;

import com.fyk.model.Book;
import com.fyk.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @Resource
    private BookService bookService;

    @PostMapping("/hello")
    public String hello(){

        return bookService.hello();
    }

    @GetMapping("/hi")
    public Map<String, Object> hi(){

        return bookService.hi();
    }


    @RequestMapping("/toMain")
    public String toMain(){

        return "main";
    }

    @PostMapping("/selectBookList")
    @ResponseBody
    public List<Book> selectBookList(){

        return bookService.selectBookList();
    }

    @GetMapping("/addBook")
    public String addBook(){

        return "addBook";
    }

    @PostMapping("/deleteBook")
    @ResponseBody
    public void deleteBook(Integer id){

        bookService.deleteBook(id);
    }
}
