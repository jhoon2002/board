package com.jhoon.springboard.dto;

public class Bbs {
    private String ba;
    private String bb;
    public String getBa() {
        return ba;
    }
    public String getBb() {
        return bb;
    }
    public void setBa(String ba) {
        this.ba = ba;
    }
    public void setBb(String bb) {
        this.bb = bb;
    }
    @Override
    public String toString() {
        return "Bbs [ba=" + ba + ", bb=" + bb + "]";
    }
}
