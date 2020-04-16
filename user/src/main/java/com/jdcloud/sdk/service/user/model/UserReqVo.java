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

package com.jdcloud.sdk.service.user.model;


/**
 * userReqVo
 */
public class UserReqVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 用户手机号
     */
    private String cscPhone;

    /**
     * 用户邮箱
     */
    private String cscEmail;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 公司名
     */
    private String companyName;

    /**
     * 起始时间
     */
    private String createTimeStart;

    /**
     * 结束时间
     */
    private String createTimeEnd;

    /**
     * 欠费状态：
     */
    private Integer arrearageStatus;

    /**
     * 用户分组，多个逗号分隔:1-自然流量，2-内部测试，3-内部重点，4-渠道用户
     */
    private String groups;

    /**
     * 用户分组:1-自然流量，2-内部测试，3-内部重点，4-渠道用户
     */
    private Integer group;

    /**
     * 计费白名单：1、在白名单  2、不在白名单
     */
    private Integer billingWhite;

    /**
     * 渠道等级;1普通用户2测试用户4VIP用户8其他VIP用户16boss迁移账户
     */
    private Integer tag;

    /**
     * 页大小(必传)
     */
    private Integer pageSize;

    /**
     * 当前页(必传)
     */
    private Integer currentPage;


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 用户手机号
     *
     * @return
     */
    public String getCscPhone() {
        return cscPhone;
    }

    /**
     * set 用户手机号
     *
     * @param cscPhone
     */
    public void setCscPhone(String cscPhone) {
        this.cscPhone = cscPhone;
    }

    /**
     * get 用户邮箱
     *
     * @return
     */
    public String getCscEmail() {
        return cscEmail;
    }

    /**
     * set 用户邮箱
     *
     * @param cscEmail
     */
    public void setCscEmail(String cscEmail) {
        this.cscEmail = cscEmail;
    }

    /**
     * get 用户名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 用户名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 用户类型
     *
     * @return
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * set 用户类型
     *
     * @param userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * get 公司名
     *
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * set 公司名
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * get 起始时间
     *
     * @return
     */
    public String getCreateTimeStart() {
        return createTimeStart;
    }

    /**
     * set 起始时间
     *
     * @param createTimeStart
     */
    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    /**
     * set 结束时间
     *
     * @param createTimeEnd
     */
    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    /**
     * get 欠费状态：
     *
     * @return
     */
    public Integer getArrearageStatus() {
        return arrearageStatus;
    }

    /**
     * set 欠费状态：
     *
     * @param arrearageStatus
     */
    public void setArrearageStatus(Integer arrearageStatus) {
        this.arrearageStatus = arrearageStatus;
    }

    /**
     * get 用户分组，多个逗号分隔:1-自然流量，2-内部测试，3-内部重点，4-渠道用户
     *
     * @return
     */
    public String getGroups() {
        return groups;
    }

    /**
     * set 用户分组，多个逗号分隔:1-自然流量，2-内部测试，3-内部重点，4-渠道用户
     *
     * @param groups
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * get 用户分组:1-自然流量，2-内部测试，3-内部重点，4-渠道用户
     *
     * @return
     */
    public Integer getGroup() {
        return group;
    }

    /**
     * set 用户分组:1-自然流量，2-内部测试，3-内部重点，4-渠道用户
     *
     * @param group
     */
    public void setGroup(Integer group) {
        this.group = group;
    }

    /**
     * get 计费白名单：1、在白名单  2、不在白名单
     *
     * @return
     */
    public Integer getBillingWhite() {
        return billingWhite;
    }

    /**
     * set 计费白名单：1、在白名单  2、不在白名单
     *
     * @param billingWhite
     */
    public void setBillingWhite(Integer billingWhite) {
        this.billingWhite = billingWhite;
    }

    /**
     * get 渠道等级;1普通用户2测试用户4VIP用户8其他VIP用户16boss迁移账户
     *
     * @return
     */
    public Integer getTag() {
        return tag;
    }

    /**
     * set 渠道等级;1普通用户2测试用户4VIP用户8其他VIP用户16boss迁移账户
     *
     * @param tag
     */
    public void setTag(Integer tag) {
        this.tag = tag;
    }

    /**
     * get 页大小(必传)
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小(必传)
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 当前页(必传)
     *
     * @return
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * set 当前页(必传)
     *
     * @param currentPage
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public UserReqVo pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 用户手机号
     *
     * @param cscPhone
     */
    public UserReqVo cscPhone(String cscPhone) {
        this.cscPhone = cscPhone;
        return this;
    }

    /**
     * set 用户邮箱
     *
     * @param cscEmail
     */
    public UserReqVo cscEmail(String cscEmail) {
        this.cscEmail = cscEmail;
        return this;
    }

    /**
     * set 用户名
     *
     * @param name
     */
    public UserReqVo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 用户类型
     *
     * @param userType
     */
    public UserReqVo userType(Integer userType) {
        this.userType = userType;
        return this;
    }

    /**
     * set 公司名
     *
     * @param companyName
     */
    public UserReqVo companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * set 起始时间
     *
     * @param createTimeStart
     */
    public UserReqVo createTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param createTimeEnd
     */
    public UserReqVo createTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }

    /**
     * set 欠费状态：
     *
     * @param arrearageStatus
     */
    public UserReqVo arrearageStatus(Integer arrearageStatus) {
        this.arrearageStatus = arrearageStatus;
        return this;
    }

    /**
     * set 用户分组，多个逗号分隔:1-自然流量，2-内部测试，3-内部重点，4-渠道用户
     *
     * @param groups
     */
    public UserReqVo groups(String groups) {
        this.groups = groups;
        return this;
    }

    /**
     * set 用户分组:1-自然流量，2-内部测试，3-内部重点，4-渠道用户
     *
     * @param group
     */
    public UserReqVo group(Integer group) {
        this.group = group;
        return this;
    }

    /**
     * set 计费白名单：1、在白名单  2、不在白名单
     *
     * @param billingWhite
     */
    public UserReqVo billingWhite(Integer billingWhite) {
        this.billingWhite = billingWhite;
        return this;
    }

    /**
     * set 渠道等级;1普通用户2测试用户4VIP用户8其他VIP用户16boss迁移账户
     *
     * @param tag
     */
    public UserReqVo tag(Integer tag) {
        this.tag = tag;
        return this;
    }

    /**
     * set 页大小(必传)
     *
     * @param pageSize
     */
    public UserReqVo pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 当前页(必传)
     *
     * @param currentPage
     */
    public UserReqVo currentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }


}