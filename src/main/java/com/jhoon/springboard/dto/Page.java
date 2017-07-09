package com.jhoon.springboard.dto;

public class Page {
    
    private int page = 1;
    private int totalRows;
    private int rowsPerPage = 10;
    private int pagePerDistrict = 10;
    
    public Page() {
    }
    public Page(int num, int totalRows) {
        this(num, totalRows, 0, 0);
    }
    public Page(int page, int totalRows, int rowsPerPage, int pagePerDistrict) {
        if (page > 0) this.page = page;
        this.totalRows = totalRows;
        if (rowsPerPage > 0) this.rowsPerPage = rowsPerPage;
        if (pagePerDistrict > 0) this.pagePerDistrict = pagePerDistrict;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }
    public void setPagePerDistrict(int pagePerDistrict) {
        this.pagePerDistrict = pagePerDistrict;
    }
    public int getPage() {
        if (page > getTotalPage()) page = getTotalPage();
        if (page < 1) page = 1;
        return page;
    }
    public int getTotalRows() {
        return totalRows;
    }
    public int getRowsPerPage() {
        return rowsPerPage;
    }
    public int getPagePerDistrict() {
        return pagePerDistrict;
    }
    public int getTotalPage() {
        return (int) Math.ceil( (double) getTotalRows() / getRowsPerPage() );
    }
    public int getDistrict() {
        return (int) Math.ceil( (double) getPage() / getPagePerDistrict() );
    }
    public int getTotalDistrict() {
        return (int) Math.ceil( (double) getTotalPage() / getPagePerDistrict() );
    }
    public int getBeginPage() {
        return (getDistrict() * getPagePerDistrict()) - getPagePerDistrict() + 1;
    }
    public int getEndPage() {
        int endPage = getDistrict() * getPagePerDistrict(); 
        if (endPage > getTotalPage()) endPage = getTotalPage();
        if (endPage < 1) endPage = 1;
        return endPage;
    }
    public int getFirstRow() {
        return (getPage() * getRowsPerPage()) - getRowsPerPage();
    }
    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }
    @Override
    public String toString() {
        return "Page [getPage()=" + getPage() + ", getTotalRows()="
                + getTotalRows() + ", getRowsPerPage()=" + getRowsPerPage()
                + ", getPagePerDistrict()=" + getPagePerDistrict()
                + ", getTotalPage()=" + getTotalPage() + ", getDistrict()="
                + getDistrict() + ", getTotalDistrict()=" + getTotalDistrict()
                + ", getBeginPage()=" + getBeginPage() + ", getEndPage()="
                + getEndPage() + ", getFirstRow()=" + getFirstRow() + "]";
    }
}
