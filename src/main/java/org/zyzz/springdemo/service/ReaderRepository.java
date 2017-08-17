package org.zyzz.springdemo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zyzz.springdemo.domin.Reader;

/**
 * Created by Tanjie on 2017/8/17.
 */
public interface ReaderRepository extends JpaRepository<Reader,String> {
}
