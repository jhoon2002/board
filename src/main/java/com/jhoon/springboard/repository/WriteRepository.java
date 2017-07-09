package com.jhoon.springboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.jhoon.springboard.entity.Write;

public interface WriteRepository extends JpaRepository<Write, Long>,
        JpaSpecificationExecutor<Write>, QueryDslPredicateExecutor<Write>, WriteRepositoryCustom {

}
