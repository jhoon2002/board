package com.jhoon.springboard.model;

public class OnePage {

    private int number;
    private boolean begin;
    private boolean end;
    private boolean prev;
    private boolean next;
    private boolean now;
    
    public OnePage(int number, boolean now, boolean begin, boolean end, 
            boolean prev, boolean next) {
        this.number = number;
        this.now = now;
        this.begin = begin;
        this.end = end;
        this.prev = prev;
        this.next = next;
    }
    public int getNumber() {
        return number;
    }
    public boolean isBegin() {
        return begin;
    }
    public boolean isEnd() {
        return end;
    }
    public boolean isPrev() {
        return prev;
    }
    public boolean isNext() {
        return next;
    }
    public boolean isNow() {
        return now;
    }
    @Override
    public String toString() {
        return "OnePage [number=" + number + ", begin=" + begin + ", end=" + end + ", prev=" + prev + ", next=" + next
                + ", now=" + now + "]";
    }
}
