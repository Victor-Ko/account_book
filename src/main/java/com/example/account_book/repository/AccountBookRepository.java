package com.example.account_book.respository;

import com.example.account_book.vo.RequestDTO;

public interface AccountBookRepository {
    void insertBook(RequestDTO requestDTO);

    void selectBook(String searchDate);
}
