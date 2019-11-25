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

package com.jdcloud.sdk.service.apigateway.model;


/**
 * domainInfo
 */
public class DomainInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * api分组id
     */
    private String apiGroupId;

    /**
     * 域名id
     */
    private String domainId;

    /**
     * 域名
     */
    private String domain;

    /**
     * 解析的cname
     */
    private String cname;

    /**
     * 域名使用的协议
     */
    private String protocol;

    /**
     * 域名创建时间
     */
    private String createTime;

    /**
     * 域名状态
     */
    private String status;


    /**
     * get api分组id
     *
     * @return
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    /**
     * set api分组id
     *
     * @param apiGroupId
     */
    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }

    /**
     * get 域名id
     *
     * @return
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * set 域名id
     *
     * @param domainId
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 解析的cname
     *
     * @return
     */
    public String getCname() {
        return cname;
    }

    /**
     * set 解析的cname
     *
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * get 域名使用的协议
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 域名使用的协议
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * get 域名创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 域名创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 域名状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 域名状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set api分组id
     *
     * @param apiGroupId
     */
    public DomainInfo apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * set 域名id
     *
     * @param domainId
     */
    public DomainInfo domainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public DomainInfo domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 解析的cname
     *
     * @param cname
     */
    public DomainInfo cname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * set 域名使用的协议
     *
     * @param protocol
     */
    public DomainInfo protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set 域名创建时间
     *
     * @param createTime
     */
    public DomainInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 域名状态
     *
     * @param status
     */
    public DomainInfo status(String status) {
        this.status = status;
        return this;
    }


}