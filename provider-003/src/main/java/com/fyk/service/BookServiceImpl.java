package com.fyk.service;

import com.fyk.mapper.BookMapper;
import com.fyk.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    @PostMapping("/hello")
    @Override
    public String hello() {

        return "asd";
    }

    @GetMapping("/hi")
    @Override
    public Map<String, Object> hi() {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("value", "1");
        map.put("message", "请求成功。");

        return map;
    }

    @PostMapping("/selectBookList")
    @ResponseBody
    @Override
    public List<Book> selectBookList() {

        return bookMapper.selectBookList();
    }

    @PostMapping("/deleteBook")
    @ResponseBody
    @Override
    public void deleteBook(@RequestParam("id") Integer id) {

        bookMapper.deleteBook(id);
    }


}
