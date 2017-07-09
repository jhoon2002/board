package com.jhoon.springboard.entity;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

public class WriteSpec {
    
    public static Specification<Write> wrSubjectLike(final String keyword) {
        return new Specification<Write>() {
            @Override
            public Predicate toPredicate(Root<Write> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like( root.<String>get("wrSubject"), "%" + keyword + "%");
            }
        };
    }
    public static Specification<Write> wrContentLike(final String keyword) {
        return new Specification<Write>() {
            @Override
            public Predicate toPredicate(Root<Write> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like( root.<String>get("wrContent"), "%" + keyword + "%");
            }
        };
    }

}
