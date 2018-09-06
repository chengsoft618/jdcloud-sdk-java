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
 * 路由表
 * 路由表相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建路由表
 */
public class CreateRouteTableResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由表ID
     */
    private String routeTableId;


    /**
     * get 路由表ID
     *
     * @return
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * set 路由表ID
     *
     * @param routeTableId
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }


    /**
     * set 路由表ID
     *
     * @param routeTableId
     */
    public CreateRouteTableResult routeTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }


}