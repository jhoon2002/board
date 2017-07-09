package com.jhoon.springboard.dto;


public class PageDto {
    
    private PageOrder pageOrder;
    private Page page = new Page(1, 20);
    private Keywords keywords = new Keywords();
    
    @SuppressWarnings("unused")
    private PageDto() {  }

    public PageDto(PageOrder pageOrder) {
        this.pageOrder = pageOrder;
    }
    public PageDto(PageOrder pageOrder, Page page) {
        this.pageOrder = pageOrder;
        this.page = page;
    }
    public PageDto(PageOrder pageOrder, Page page, Keywords keywords) {
        this.pageOrder = pageOrder;
        this.page = page;
        this.keywords = keywords;
    }
    public PageOrder getPageOrder() {
        return pageOrder;
    }
    public void setPageOrder(PageOrder pageOrder) {
        this.pageOrder = pageOrder;
    }
    public Page getPage() {
        return page;
    }
    public void setPage(Page page) {
        this.page = page;
    }
    public Keywords getKeywords() {
        return keywords;
    }
    public void setKeywords(Keywords keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "PageDto [pageOrder=" + pageOrder + ", page=" + page
                + ", keywords=" + keywords + "]";
    }
}
