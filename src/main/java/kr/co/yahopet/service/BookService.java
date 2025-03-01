package kr.co.yahopet.service;

import java.util.List;
import kr.co.yahopet.entity.Book;

public interface BookService {

    public static final int PAGE_SIAE = 10;

    Book findByBid(long bid);

    List<Book> getBooksByPage(int page);

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(long bid);

}
