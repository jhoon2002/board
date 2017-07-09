package com.jhoon.springboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.jhoon.springboard.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>,
        JpaSpecificationExecutor<Member>, QueryDslPredicateExecutor<Member> {

}
