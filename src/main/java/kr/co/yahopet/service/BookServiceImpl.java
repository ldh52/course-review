package kr.co.yahopet.service;

import java.util.List;
import kr.co.yahopet.entity.Book;
import kr.co.yahopet.repositoty.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book findByBid(long bid) {
        return bookRepository.findById(bid).orElse(null);
    }

    @Override
    public List<Book> getBooksByPage(int page) {
        Pageable pageable = PageRequest.of(page - 1, PAGE_SIAE);
        Page<Book> bookPage = bookRepository.findAll(pageable);
        return bookPage.getContent();
    }

    @Override
    public void insertBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);

    }

    @Override
    public void deleteBook(long bid) {
        bookRepository.deleteById(bid);
    }

}
