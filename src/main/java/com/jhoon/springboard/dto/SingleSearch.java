package com.jhoon.springboard.dto;

import static com.jhoon.springboard.entity.Write.memberLike;
import static com.jhoon.springboard.entity.Write.wrContentLike;
import static com.jhoon.springboard.entity.Write.wrNameLike;
import static com.jhoon.springboard.entity.Write.wrSubjectLike;
import static org.springframework.data.jpa.domain.Specifications.where;

import org.springframework.data.jpa.domain.Specification;

import com.jhoon.springboard.entity.QWrite;
import com.mysema.query.types.Predicate;

public class SingleSearch<Write> implements Search<Write> {
    private String word;
    private String field;
    private String andor;

    
    public SingleSearch() {
    }
    public SingleSearch(String word, String field) {
        this(word, field, "and");
    }
    public SingleSearch(String word, String field, String andor) {
        this.word = word;
        this.field = field;
        if (andor.toLowerCase().equals("or")) {
            this.andor = "or";
        } else {
            this.andor = "and";
        }
    }
    
    public String getword() {
        return word;
    }
    public void setword(String word) {
        this.word = word;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getAndor() {
        return andor;
    }
    public void setAndor(String andor) {
        this.andor = andor;
    }
    @Override
    public boolean isSearch() {
        if (word == null || field == null) return false;
        if (word.equals("") || field.equals("")) return false;
        return true;
    }
    @Override
    public Specification<Write> depictSpec() {
        
        if (!isSearch()) return null;

        //Specification<Write> spec = null;
        if (field.equals("wrSubject")) return (Specification<Write>) where(wrSubjectLike(word));
        if (field.equals("wrContent")) return (Specification<Write>) where(wrContentLike(word));
        if (field.equals("wrName")) return (Specification<Write>) where(wrNameLike(word));
        if (field.equals("member")) return (Specification<Write>) where(memberLike(word));
        
        return null;
    }
    @Override
    public Predicate getPredicate() {
        
        QWrite qWrite = QWrite.write;
        
        if (!isSearch()) return null;
        
        if (field.equals("wrSubject")) return qWrite.wrSubject.like("%"+ word +"%");
        if (field.equals("wrContent")) return qWrite.wrContent.like("%"+ word +"%");
        if (field.equals("wrName")) return qWrite.wrName.like("%"+ word +"%");
        if (field.equals("member")) return qWrite.member.id.eq(word);
        
        return null;
    }
    @Override
    public String toString() {
        return "SingleSearch [word=" + word + ", field=" + field + ", andor=" + andor + "]";
    }
    
}
