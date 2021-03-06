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

package com.jdcloud.sdk.service.iotcore.model;


/**
 * serviceUser
 */
public class ServiceUser  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     */
    private String uuid;

    /**
     * 用户Pin
     */
    private String userPin;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户公司
     */
    private String company;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 用户描述
     */
    private String desc;

    /**
     * 注册时间
     */
    private String createTime;


    /**
     * get 用户唯一标识
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 用户唯一标识
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get 用户Pin
     *
     * @return
     */
    public String getUserPin() {
        return userPin;
    }

    /**
     * set 用户Pin
     *
     * @param userPin
     */
    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    /**
     * get 用户名称
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 用户名称
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get 用户电话
     *
     * @return
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * set 用户电话
     *
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * get 用户公司
     *
     * @return
     */
    public String getCompany() {
        return company;
    }

    /**
     * set 用户公司
     *
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * get 用户地址
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set 用户地址
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get 用户描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 用户描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * get 注册时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 注册时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 用户唯一标识
     *
     * @param uuid
     */
    public ServiceUser uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 用户Pin
     *
     * @param userPin
     */
    public ServiceUser userPin(String userPin) {
        this.userPin = userPin;
        return this;
    }

    /**
     * set 用户名称
     *
     * @param userName
     */
    public ServiceUser userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * set 用户电话
     *
     * @param userPhone
     */
    public ServiceUser userPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    /**
     * set 用户公司
     *
     * @param company
     */
    public ServiceUser company(String company) {
        this.company = company;
        return this;
    }

    /**
     * set 用户地址
     *
     * @param address
     */
    public ServiceUser address(String address) {
        this.address = address;
        return this;
    }

    /**
     * set 用户描述
     *
     * @param desc
     */
    public ServiceUser desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * set 注册时间
     *
     * @param createTime
     */
    public ServiceUser createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}