package org.zyzz.springdemo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zyzz.springdemo.domin.Book;

import java.util.List;

/**
 * Created by zyzz on 17-8-16.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long>{
    List<Book> findByReader(String reader);

}
