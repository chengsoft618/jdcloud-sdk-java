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
 * JCloud Openapi For CDN
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询url鉴权
 */
public class QueryAccesskeyConfigResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 鉴权类型，0表示无鉴权，1表示参数鉴权，2表示路径鉴权
     */
    private Integer accesskeyType;

    /**
     * 密码，长度为8到32
     */
    private String accesskeyKey;

    /**
     * 是否是回源鉴权 0表示是 1表示否
     */
    private Integer accesskeyKeep;


    /**
     * get 鉴权类型，0表示无鉴权，1表示参数鉴权，2表示路径鉴权
     *
     * @return
     */
    public Integer getAccesskeyType() {
        return accesskeyType;
    }

    /**
     * set 鉴权类型，0表示无鉴权，1表示参数鉴权，2表示路径鉴权
     *
     * @param accesskeyType
     */
    public void setAccesskeyType(Integer accesskeyType) {
        this.accesskeyType = accesskeyType;
    }

    /**
     * get 密码，长度为8到32
     *
     * @return
     */
    public String getAccesskeyKey() {
        return accesskeyKey;
    }

    /**
     * set 密码，长度为8到32
     *
     * @param accesskeyKey
     */
    public void setAccesskeyKey(String accesskeyKey) {
        this.accesskeyKey = accesskeyKey;
    }

    /**
     * get 是否是回源鉴权 0表示是 1表示否
     *
     * @return
     */
    public Integer getAccesskeyKeep() {
        return accesskeyKeep;
    }

    /**
     * set 是否是回源鉴权 0表示是 1表示否
     *
     * @param accesskeyKeep
     */
    public void setAccesskeyKeep(Integer accesskeyKeep) {
        this.accesskeyKeep = accesskeyKeep;
    }


    /**
     * set 鉴权类型，0表示无鉴权，1表示参数鉴权，2表示路径鉴权
     *
     * @param accesskeyType
     */
    public QueryAccesskeyConfigResult accesskeyType(Integer accesskeyType) {
        this.accesskeyType = accesskeyType;
        return this;
    }

    /**
     * set 密码，长度为8到32
     *
     * @param accesskeyKey
     */
    public QueryAccesskeyConfigResult accesskeyKey(String accesskeyKey) {
        this.accesskeyKey = accesskeyKey;
        return this;
    }

    /**
     * set 是否是回源鉴权 0表示是 1表示否
     *
     * @param accesskeyKeep
     */
    public QueryAccesskeyConfigResult accesskeyKeep(Integer accesskeyKeep) {
        this.accesskeyKeep = accesskeyKeep;
        return this;
    }


}