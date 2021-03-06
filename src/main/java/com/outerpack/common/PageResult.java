package com.outerpack.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: PageResult
 * @Description: TODO
 * @author: datealive
 * @date: 2021/4/12  10:57
 */
@Data
public class PageResult<T> implements Serializable {

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 当前页
     */
    private Integer currentPage;
    /**
     * 当前页数据
     */
    private List<T> data;

    public PageResult(Integer code,Integer totalPage, Integer currentPage, List<T> data) {
        this.code=code;
        this.totalPage = totalPage;
        this.currentPage = currentPage;
        this.data = data;
    }
}