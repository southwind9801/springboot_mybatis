package com.southwind.controller;

import com.southwind.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookHandler {

    @Autowired
    private BookService bookService;

    @RequestMapping("/getAll")
    public ModelAndView getBook(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("list",bookService.getAll());
        mav.setViewName("book");
        return mav;
    }

}
