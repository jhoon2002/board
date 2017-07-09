package com.jhoon.springboard.dto;

import java.util.ArrayList;
import java.util.List;

public class Keywords {
    private List<String> words;
    private List<String> fields;
    private List<String []> keywords = new ArrayList<String[]>();
    private Andor andor = Andor.AND;
    
    public enum Andor {
        AND, OR
    }
    
    public Keywords() {  }
    
    public Keywords(List<String> words, List<String> fields, Andor andor) {
        this.words = words;
        this.fields = fields;
        this.andor = andor;
        for(int i=0; this.words.size() > i; i++) {
            String [] wordsAndFields = {this.words.get(i), this.fields.get(i)};
            this.keywords.add(wordsAndFields);
        }
    }
    
    public List<String> getWords() {
        return words;
    }
    public void setWords(List<String> words) {
        this.words = words;
    }
    public List<String> getFields() {
        return fields;
    }
    public void setFields(List<String> fields) {
        this.fields = fields;
    }
    public Andor getAndor() {
        return andor;
    }
    public void setAndor(Andor andor) {
        this.andor = andor;
    }
    
    public List<String []> getKeywords() {
        return keywords;
    }
    public void setKeywords(List<String []> keywords) {
        this.keywords = keywords;
    }

    public List<String> addWord(String word) {
        this.fields.add(word);
        return this.words;
    }
    public List<String> addField(String field) {
        this.fields.add(field);
        return this.fields;
    }

    @Override
    public String toString() {
        return "Keywords [words=" + words + ", fields=" + fields
                + ", keywords=" + keywords + ", andor=" + andor + "]";
    }
}
