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
 * Availability-Monitoring-APIs
 * 可用性监控相关接口，提供创建、查询、修改、删除可用性监控任务等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建可用性监控任务
 */
public class CreateProbeTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否创建成功
     */
    private Boolean suc;

    /**
     * 创建成功的规则id列表
     */
    private String taskId;


    /**
     * get 是否创建成功
     *
     * @return
     */
    public Boolean getSuc() {
        return suc;
    }

    /**
     * set 是否创建成功
     *
     * @param suc
     */
    public void setSuc(Boolean suc) {
        this.suc = suc;
    }

    /**
     * get 创建成功的规则id列表
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 创建成功的规则id列表
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * set 是否创建成功
     *
     * @param suc
     */
    public CreateProbeTaskResult suc(Boolean suc) {
        this.suc = suc;
        return this;
    }

    /**
     * set 创建成功的规则id列表
     *
     * @param taskId
     */
    public CreateProbeTaskResult taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


}