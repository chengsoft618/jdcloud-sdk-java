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
 * Domain
 * 域名管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询域名访问头参数列表
 */
public class ListHeadersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名ID
     * Required:true
     */
    @Required
    private Long domainId;


    /**
     * get 域名ID
     *
     * @return
     */
    public Long getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }


    /**
     * set 域名ID
     *
     * @param domainId
     */
    public ListHeadersRequest domainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }


}