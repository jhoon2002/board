package com.jhoon.springboard.web;

public class ListParam {

    private String boid;
    private int wrid;
    private int page = 1;
    private String word;
    private String field;
    
    public String getBoid() {
        return boid;
    }
    public void setBoid(String boid) {
        this.boid = boid;
    }
    public int getWrid() {
        return wrid;
    }
    public void setWrid(int wrid) {
        this.wrid = wrid;
    }
    public int getPage() {
        return page;
    }
    public void setPage(Integer page) {
        if (page == null) page = 1;
        this.page = page;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    @Override
    public String toString() {
        return "ListParam [boid=" + boid + ", wrid=" + wrid + ", page=" + page + ", word=" + word + ", field=" + field
                + "]";
    }
}
