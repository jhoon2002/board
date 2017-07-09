package com.jhoon.springboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jhoon.springboard.dto.Page;

public class PageTest {
    
    @Test
    public void test() {
        Page page = new Page(124, 625);
        System.out.println(page.toString());
        assertEquals(1, 1);
    }
}
