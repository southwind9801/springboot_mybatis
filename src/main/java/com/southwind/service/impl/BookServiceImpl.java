package com.southwind.service.impl;

import com.southwind.dao.BookDAO;
import com.southwind.entity.Book;
import com.southwind.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    public List<Book> getAll() {
        return bookDAO.getAll();
    }
}
