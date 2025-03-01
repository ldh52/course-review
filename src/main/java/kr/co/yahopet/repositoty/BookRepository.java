package kr.co.yahopet.repositoty;

import kr.co.yahopet.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Page<Book> finDaLL(Pageable pageable);

}
