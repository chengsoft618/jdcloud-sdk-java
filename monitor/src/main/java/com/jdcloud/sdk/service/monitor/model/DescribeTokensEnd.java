/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * describeTokensEnd
 */
public class DescribeTokensEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总页数
     */
    private Long numberPages;

    /**
     * 总记录数
     */
    private Long numberRecords;

    /**
     * 当前页码
     */
    private Long pageNumber;

    /**
     * 分页大小
     */
    private Long pageSize;

    /**
     * tokens
     */
    private List<DescribeTokenEnd> tokens;


    /**
     * get 总页数
     *
     * @return
     */
    public Long getNumberPages() {
        return numberPages;
    }

    /**
     * set 总页数
     *
     * @param numberPages
     */
    public void setNumberPages(Long numberPages) {
        this.numberPages = numberPages;
    }

    /**
     * get 总记录数
     *
     * @return
     */
    public Long getNumberRecords() {
        return numberRecords;
    }

    /**
     * set 总记录数
     *
     * @param numberRecords
     */
    public void setNumberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
    }

    /**
     * get 当前页码
     *
     * @return
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get tokens
     *
     * @return
     */
    public List<DescribeTokenEnd> getTokens() {
        return tokens;
    }

    /**
     * set tokens
     *
     * @param tokens
     */
    public void setTokens(List<DescribeTokenEnd> tokens) {
        this.tokens = tokens;
    }


    /**
     * set 总页数
     *
     * @param numberPages
     */
    public DescribeTokensEnd numberPages(Long numberPages) {
        this.numberPages = numberPages;
        return this;
    }

    /**
     * set 总记录数
     *
     * @param numberRecords
     */
    public DescribeTokensEnd numberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
        return this;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public DescribeTokensEnd pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeTokensEnd pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set tokens
     *
     * @param tokens
     */
    public DescribeTokensEnd tokens(List<DescribeTokenEnd> tokens) {
        this.tokens = tokens;
        return this;
    }


    /**
     * add item to tokens
     *
     * @param token
     */
    public void addToken(DescribeTokenEnd token) {
        if (this.tokens == null) {
            this.tokens = new ArrayList<>();
        }
        this.tokens.add(token);
    }

}