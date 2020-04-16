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
 * organizationInfo
 */
public class OrganizationInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 组织机构编码
     */
    private String organizationCode;

    /**
     * 组织机构名称
     */
    private String organizationName;

    /**
     * 组织机构全路径
     */
    private String organizationFullPath;

    /**
     * 组织机构全名
     */
    private String organizationFullname;

    /**
     * 组织机构级别
     */
    private String organizationLevel;


    /**
     * get 组织机构编码
     *
     * @return
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * set 组织机构编码
     *
     * @param organizationCode
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    /**
     * get 组织机构名称
     *
     * @return
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * set 组织机构名称
     *
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * get 组织机构全路径
     *
     * @return
     */
    public String getOrganizationFullPath() {
        return organizationFullPath;
    }

    /**
     * set 组织机构全路径
     *
     * @param organizationFullPath
     */
    public void setOrganizationFullPath(String organizationFullPath) {
        this.organizationFullPath = organizationFullPath;
    }

    /**
     * get 组织机构全名
     *
     * @return
     */
    public String getOrganizationFullname() {
        return organizationFullname;
    }

    /**
     * set 组织机构全名
     *
     * @param organizationFullname
     */
    public void setOrganizationFullname(String organizationFullname) {
        this.organizationFullname = organizationFullname;
    }

    /**
     * get 组织机构级别
     *
     * @return
     */
    public String getOrganizationLevel() {
        return organizationLevel;
    }

    /**
     * set 组织机构级别
     *
     * @param organizationLevel
     */
    public void setOrganizationLevel(String organizationLevel) {
        this.organizationLevel = organizationLevel;
    }


    /**
     * set 组织机构编码
     *
     * @param organizationCode
     */
    public OrganizationInfo organizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }

    /**
     * set 组织机构名称
     *
     * @param organizationName
     */
    public OrganizationInfo organizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * set 组织机构全路径
     *
     * @param organizationFullPath
     */
    public OrganizationInfo organizationFullPath(String organizationFullPath) {
        this.organizationFullPath = organizationFullPath;
        return this;
    }

    /**
     * set 组织机构全名
     *
     * @param organizationFullname
     */
    public OrganizationInfo organizationFullname(String organizationFullname) {
        this.organizationFullname = organizationFullname;
        return this;
    }

    /**
     * set 组织机构级别
     *
     * @param organizationLevel
     */
    public OrganizationInfo organizationLevel(String organizationLevel) {
        this.organizationLevel = organizationLevel;
        return this;
    }


}