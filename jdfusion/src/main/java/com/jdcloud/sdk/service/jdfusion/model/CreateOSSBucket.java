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

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * createOSSBucket
 */
public class CreateOSSBucket  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 存储桶名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 创建时间
     */
    private String creationDate;

    /**
     * 云信息
     */
    private String cloudID;

    /**
     * 访问控制,private\public-read\public-read-write
     */
    private String acl;


    /**
     * get 存储桶名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 存储桶名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * set 创建时间
     *
     * @param creationDate
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * get 云信息
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 云信息
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get 访问控制,private\public-read\public-read-write
     *
     * @return
     */
    public String getAcl() {
        return acl;
    }

    /**
     * set 访问控制,private\public-read\public-read-write
     *
     * @param acl
     */
    public void setAcl(String acl) {
        this.acl = acl;
    }


    /**
     * set 存储桶名称
     *
     * @param name
     */
    public CreateOSSBucket name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param creationDate
     */
    public CreateOSSBucket creationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * set 云信息
     *
     * @param cloudID
     */
    public CreateOSSBucket cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set 访问控制,private\public-read\public-read-write
     *
     * @param acl
     */
    public CreateOSSBucket acl(String acl) {
        this.acl = acl;
        return this;
    }


}