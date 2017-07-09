package com.jhoon.springboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jhoon.springboard.entity.Write;
import com.mysema.query.types.Predicate;

public interface WriteRepositoryCustom {
    
    Page<Write> findAllWithoutWrContent(Predicate predicate, Pageable pageable);
    long findMinWrNum(String id);
    String findMaxWrReply(long id);
    int updateWrNum(Write wrtie, long newWrNum); 
    int update(Write write);
}
