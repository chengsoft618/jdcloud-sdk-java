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
 * 跨区域备份管理
 * API related to Relational MONGODB Service
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mongodb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建跨区域备份同步服务
 */
public class CreateBackupSynchronicityRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 源实例所在地域
     * Required:true
     */
    @Required
    private String srcRegion;

    /**
     * 备份同步的目标地域
     * Required:true
     */
    @Required
    private String dstRegion;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 源实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 源实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 源实例所在地域
     *
     * @return
     */
    public String getSrcRegion() {
        return srcRegion;
    }

    /**
     * set 源实例所在地域
     *
     * @param srcRegion
     */
    public void setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
    }

    /**
     * get 备份同步的目标地域
     *
     * @return
     */
    public String getDstRegion() {
        return dstRegion;
    }

    /**
     * set 备份同步的目标地域
     *
     * @param dstRegion
     */
    public void setDstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 源实例ID
     *
     * @param instanceId
     */
    public CreateBackupSynchronicityRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 源实例所在地域
     *
     * @param srcRegion
     */
    public CreateBackupSynchronicityRequest srcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }

    /**
     * set 备份同步的目标地域
     *
     * @param dstRegion
     */
    public CreateBackupSynchronicityRequest dstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateBackupSynchronicityRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}