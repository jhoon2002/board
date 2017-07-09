package com.jhoon.springboard.dto;

public class PageOrder {
    
    private String field;
    private Ordering ordering;
    
    public enum Ordering {
        ASC, DESC
    }
    
    public PageOrder(String field, Ordering ordering) {
        this.field = field;
        this.ordering = ordering;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public Ordering getOrdering() {
        return ordering;
    }
    public void setOrdering(Ordering ordering) {
        this.ordering = ordering;
    }
    @Override
    public String toString() {
        return "PageOrder [field=" + field + ", ordering=" + ordering + "]";
    }
}
