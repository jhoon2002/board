package com.jhoon.springboard.dto;

import java.util.Arrays;

public class PgDto {
    
    private int page;
    private String [] words;
    private String [] fields;
    private String andor;
    public int getPage() {
        return page;
    }
    public String[] getWords() {
        return words;
    }
    public String[] getFields() {
        return fields;
    }
    public String getAndor() {
        return andor;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public void setWords(String[] words) {
        this.words = words;
    }
    public void setFields(String[] fields) {
        this.fields = fields;
    }
    public void setAndor(String andor) {
        this.andor = andor;
    }
    @Override
    public String toString() {
        return "PgDto [page=" + page + ", words=" + Arrays.toString(words)
                + ", fields=" + Arrays.toString(fields) + ", andor=" + andor
                + "]";
    }
}
