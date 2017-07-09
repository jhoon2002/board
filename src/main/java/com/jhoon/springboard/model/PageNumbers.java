package com.jhoon.springboard.model;

import java.util.ArrayList;
import java.util.List;

public class PageNumbers {
    List<OnePage> list = new ArrayList<OnePage>();
    int nowPageNumber = 1;
    int rowsPerPage = 10;
    int pagesPerDistrict = 5;
    long totalRows;
    
    public PageNumbers(int nowPageNumber, int rowsPerPage, int pagesPerDistrict, long totalRows) {
        this.nowPageNumber = nowPageNumber;
        this.rowsPerPage = rowsPerPage;
        this.pagesPerDistrict = pagesPerDistrict;
        this.totalRows = totalRows;
        
        for (int pageNumber = getBeginPage(); pageNumber <= getEndPage(); pageNumber++) {

            boolean now   =   isNow(pageNumber) ? true : false;
            boolean begin = isBegin(pageNumber) ? true : false;
            boolean end   =   isEnd(pageNumber) ? true : false;
            boolean prev  = hasPrev(pageNumber) ? true : false;
            boolean next  = hasNext(pageNumber) ? true : false;

            OnePage onePage = new OnePage(pageNumber, now, begin, end, prev, next);
            
            addPage(onePage);
        }
    }

    public List<OnePage> getList() {
        return list;
    }
    private boolean isBegin(int page) {
        if (page == getBeginPage()) return true;
        return false;
    }
    private boolean isEnd(int page) {
        if (page == getEndPage()) return true;
        return false;
    }
    private boolean hasPrev(int page) {
        if (page > 1) return true;  //isBegin(page) && 
        return false;
    }
    private boolean hasNext(int page) {
        if (page < getTotalPage()) return true; //isEnd(page) && 
        return false;
    }
    private boolean isNow(int page) {
        if (page == getNowPageNumber()) return true;
        return false;
    }
    
    private int getBeginPage() {
        return (getDistrict() * pagesPerDistrict) - pagesPerDistrict + 1;
    }
    private int getEndPage() {
        int endPage = getDistrict() * pagesPerDistrict; 
        if (endPage > getTotalPage()) endPage = getTotalPage();
        if (endPage < 1) endPage = 1;
        return endPage;
    }
    private int getTotalPage() {
        return (int) Math.ceil( (double) totalRows / rowsPerPage );
    }
    private int getDistrict() {
        return (int) Math.ceil( (double) getNowPageNumber() / pagesPerDistrict );
    }
    private int getNowPageNumber() {
        if (nowPageNumber > getTotalPage()) nowPageNumber = getTotalPage();
        if (nowPageNumber < 1) nowPageNumber = 1;
        return nowPageNumber;
    }

    //API
    public void addPage(OnePage page) {
        this.list.add(page);
    }
    public int count() {
        return list.size();
    }
    
    //setter
    public void setPages(List<OnePage> pages) {
        this.list = pages;
    }
    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }
    public void setPagesPerDistrict(int pagesPerDistrict) {
        this.pagesPerDistrict = pagesPerDistrict;
    }
    public void setNowPageNumber(int nowPageNumber) {
        this.nowPageNumber = nowPageNumber;
    }

    @Override
    public String toString() {
        return "AllPages [list=" + list + ", nowPageNumber=" + nowPageNumber + ", rowsPerPage=" + rowsPerPage
                + ", pagesPerDistrict=" + pagesPerDistrict + ", totalRows=" + totalRows + "]";
    }
}
