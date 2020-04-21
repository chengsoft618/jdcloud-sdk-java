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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.mongodb.model.BackupSynchronicity;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询跨区域备份同步服务
 */
public class DescribeBackupSynchronicitiesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * backupSynchronicities
     */
    private List<BackupSynchronicity> backupSynchronicities;

    /**
     * totalCount
     */
    private Integer totalCount;

    /**
     * pageNumber
     */
    private Integer pageNumber;


    /**
     * get backupSynchronicities
     *
     * @return
     */
    public List<BackupSynchronicity> getBackupSynchronicities() {
        return backupSynchronicities;
    }

    /**
     * set backupSynchronicities
     *
     * @param backupSynchronicities
     */
    public void setBackupSynchronicities(List<BackupSynchronicity> backupSynchronicities) {
        this.backupSynchronicities = backupSynchronicities;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get pageNumber
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set pageNumber
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * set backupSynchronicities
     *
     * @param backupSynchronicities
     */
    public DescribeBackupSynchronicitiesResult backupSynchronicities(List<BackupSynchronicity> backupSynchronicities) {
        this.backupSynchronicities = backupSynchronicities;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeBackupSynchronicitiesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set pageNumber
     *
     * @param pageNumber
     */
    public DescribeBackupSynchronicitiesResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * add item to backupSynchronicities
     *
     * @param backupSynchronicitie
     */
    public void addBackupSynchronicitie(BackupSynchronicity backupSynchronicitie) {
        if (this.backupSynchronicities == null) {
            this.backupSynchronicities = new ArrayList<>();
        }
        this.backupSynchronicities.add(backupSynchronicitie);
    }

}