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
 * job api
 * API COMPILE CODE TO PACKAGE
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.compile.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 生成带有效期的包地址
 */
public class GetExternalLinkResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * url
     */
    private String url;

    /**
     * token
     */
    private String token;


    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get token
     *
     * @return
     */
    public String getToken() {
        return token;
    }

    /**
     * set token
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }


    /**
     * set url
     *
     * @param url
     */
    public GetExternalLinkResult url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set token
     *
     * @param token
     */
    public GetExternalLinkResult token(String token) {
        this.token = token;
        return this;
    }


}