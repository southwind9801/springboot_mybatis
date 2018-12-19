package com.southwind.dao;

import com.southwind.entity.Book;

import java.util.List;

public interface BookDAO {
    public List<Book> getAll();
    public int getCount();
}
