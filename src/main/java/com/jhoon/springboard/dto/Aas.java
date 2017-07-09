package com.jhoon.springboard.dto;

public class Aas {
    private Ccs ccs;
    private String a;
    public Ccs getCcs() {
        return ccs;
    }
    public String getA() {
        return a;
    }
    public void setCcs(Ccs ccs) {
        this.ccs = ccs;
    }
    public void setA(String a) {
        this.a = a;
    }
    @Override
    public String toString() {
        return "Aas [ccs=" + ccs + ", a=" + a + "]";
    }
}
