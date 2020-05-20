package com.fyk.service;

import com.fyk.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
/*, fallback = BookFeignError.class*/
@FeignClient(value = "provider-003" )
public interface BookService {

    @PostMapping("/hello")
    String hello();

    @GetMapping("/hi")
    Map<String, Object> hi();

    @PostMapping("/selectBookList")
    @ResponseBody
    List<Book> selectBookList();

    @PostMapping("/deleteBook")
    @ResponseBody
    void deleteBook(@RequestParam("id") Integer id);

}
