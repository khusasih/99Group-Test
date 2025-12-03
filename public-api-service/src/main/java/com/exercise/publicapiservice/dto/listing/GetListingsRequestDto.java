package com.exercise.publicapiservice.dto.listing;

public class GetListingsRequestDto {
    private Integer pageNum;
    private Integer pageSize;
    private Integer userId;

    public Integer getPageNum() { return pageNum; }
    public void setPageNum(Integer pageNum) { this.pageNum = pageNum; }

    public Integer getPageSize() { return pageSize; }
    public void setPageSize(Integer pageSize) { this.pageSize = pageSize; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }
}