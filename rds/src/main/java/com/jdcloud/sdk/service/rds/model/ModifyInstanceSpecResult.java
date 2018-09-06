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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 实例扩容，支持升级实例的CPU，内存及磁盘。目前暂不支持实例降配&lt;br&gt;- 仅支持MySQL
 */
public class ModifyInstanceSpecResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 生成的订单号
     */
    private String orderId;


    /**
     * get 生成的订单号
     *
     * @return
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * set 生成的订单号
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * set 生成的订单号
     *
     * @param orderId
     */
    public ModifyInstanceSpecResult orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }


}