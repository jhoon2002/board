package com.jhoon.test;

public class MainTest {

    public static void main(String[] args) {
        
        char beginChar = 'A';
        char endChar = 'Z';
        String begin = "AAAA";
        String end = "Z";
        
        System.out.println(endChar - beginChar);
        
        char[] charArray = begin.toCharArray();
        System.out.println(charArray);
         
        for (int i = 0; i < 50; i++) {
            //System.out.println(++beginChar);
        }
        
    }

}
