package com.jhoon.springboard.dto;

import org.springframework.data.jpa.domain.Specification;

import com.mysema.query.types.Predicate;

public interface Search<T> {
    public Specification<T> depictSpec();
    public Predicate getPredicate();
    public boolean isSearch();
}
