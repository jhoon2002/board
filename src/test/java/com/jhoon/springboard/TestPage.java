package com.jhoon.springboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jhoon.springboard.model.PageFrag;
import com.jhoon.springboard.model.PageSet;

public class TestPage {

    @Test
    public void test() {
        PageSet pages = new PageSet(3, 10, 10, 2000);
        // nowPageNumber, rowsPerPage, pagesPerDistrict, totalPage  
        
        for (PageFrag page : pages.getList()) {
            if (page.isBegin() && page.isPrev()) System.out.print("<");
            System.out.print(" ");
            if (page.isNow()) System.out.print("(");
            System.out.print(page.getNumber());
            if (page.isNow()) System.out.print(")");
            System.out.print(" ");
            if (page.isEnd() && page.isNext()) System.out.print(">");
        }
        System.out.println("");
        for (PageFrag page : pages.getList()) {
            if (page.isNow()) {
                if (page.isPrev()) System.out.print("< ");
                System.out.print(page.getNumber());
                if (page.isNext()) System.out.println(" >");
            }
        }
        
        
        
        assertEquals(pages.count(),5);
    }
}
