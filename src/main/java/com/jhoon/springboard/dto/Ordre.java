package com.jhoon.springboard.dto;

public class Ordre {
    private String field;
    private String order = "asc";
    
    public Ordre(String field, String order) {
        super();
        this.field = field;
        this.order = order;
    }
    public String getField() {
        return field;
    }
    public String getOrder() {
        return order;
    }
    public void setField(String field) {
        this.field = field;
    }
    public void setOrder(String order) {
        this.order = order;
    }
    @Override
    public String toString() {
        return "Ordre [field=" + field + ", order=" + order + "]";
    }
}
