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

package com.jdcloud.sdk.service.httpdns.model;


/**
 * dataplan
 */
public class Dataplan  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流量包索引ID
     */
    private Integer id;

    /**
     * 账户ID
     */
    private String accountId;

    /**
     * 这个流量包的总数
     */
    private Double number;

    /**
     * 这个流量包的单位
     */
    private Integer unit;

    /**
     * 这个流量包的起始时间
     */
    private Long startTime;

    /**
     * 这个流量包的过期时间
     */
    private Long expireTime;

    /**
     * 这个流量包使用过了的数量
     */
    private Double usedNumber;

    /**
     * 流量包的类型，1:免费流量包 2:收费包
     */
    private Integer type;

    /**
     * 是否过期，0:未过期 1:过期了
     */
    private Integer isExpired;


    /**
     * get 流量包索引ID
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 流量包索引ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 账户ID
     *
     * @return
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * set 账户ID
     *
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * get 这个流量包的总数
     *
     * @return
     */
    public Double getNumber() {
        return number;
    }

    /**
     * set 这个流量包的总数
     *
     * @param number
     */
    public void setNumber(Double number) {
        this.number = number;
    }

    /**
     * get 这个流量包的单位
     *
     * @return
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * set 这个流量包的单位
     *
     * @param unit
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * get 这个流量包的起始时间
     *
     * @return
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * set 这个流量包的起始时间
     *
     * @param startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * get 这个流量包的过期时间
     *
     * @return
     */
    public Long getExpireTime() {
        return expireTime;
    }

    /**
     * set 这个流量包的过期时间
     *
     * @param expireTime
     */
    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * get 这个流量包使用过了的数量
     *
     * @return
     */
    public Double getUsedNumber() {
        return usedNumber;
    }

    /**
     * set 这个流量包使用过了的数量
     *
     * @param usedNumber
     */
    public void setUsedNumber(Double usedNumber) {
        this.usedNumber = usedNumber;
    }

    /**
     * get 流量包的类型，1:免费流量包 2:收费包
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 流量包的类型，1:免费流量包 2:收费包
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 是否过期，0:未过期 1:过期了
     *
     * @return
     */
    public Integer getIsExpired() {
        return isExpired;
    }

    /**
     * set 是否过期，0:未过期 1:过期了
     *
     * @param isExpired
     */
    public void setIsExpired(Integer isExpired) {
        this.isExpired = isExpired;
    }


    /**
     * set 流量包索引ID
     *
     * @param id
     */
    public Dataplan id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 账户ID
     *
     * @param accountId
     */
    public Dataplan accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * set 这个流量包的总数
     *
     * @param number
     */
    public Dataplan number(Double number) {
        this.number = number;
        return this;
    }

    /**
     * set 这个流量包的单位
     *
     * @param unit
     */
    public Dataplan unit(Integer unit) {
        this.unit = unit;
        return this;
    }

    /**
     * set 这个流量包的起始时间
     *
     * @param startTime
     */
    public Dataplan startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 这个流量包的过期时间
     *
     * @param expireTime
     */
    public Dataplan expireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * set 这个流量包使用过了的数量
     *
     * @param usedNumber
     */
    public Dataplan usedNumber(Double usedNumber) {
        this.usedNumber = usedNumber;
        return this;
    }

    /**
     * set 流量包的类型，1:免费流量包 2:收费包
     *
     * @param type
     */
    public Dataplan type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 是否过期，0:未过期 1:过期了
     *
     * @param isExpired
     */
    public Dataplan isExpired(Integer isExpired) {
        this.isExpired = isExpired;
        return this;
    }


}