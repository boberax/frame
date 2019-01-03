package com.yscredit.common.page;


public class Page<T>  {
    private int pageNum = 1;//页码，默认是第一页
    private int pageSize = 10;//每页显示的记录数，默认是10

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
