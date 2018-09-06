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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rds.model.DBInstance;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取当前账号下所有RDS实例及MySQL只读实例的概要信息，例如实例类型，版本，计费信息等
 */
public class DescribeInstancesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dbInstances
     */
    private List<DBInstance> dbInstances;

    /**
     * totalCount
     */
    private Integer totalCount;


    /**
     * get dbInstances
     *
     * @return
     */
    public List<DBInstance> getDbInstances() {
        return dbInstances;
    }

    /**
     * set dbInstances
     *
     * @param dbInstances
     */
    public void setDbInstances(List<DBInstance> dbInstances) {
        this.dbInstances = dbInstances;
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
     * set dbInstances
     *
     * @param dbInstances
     */
    public DescribeInstancesResult dbInstances(List<DBInstance> dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeInstancesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to dbInstances
     *
     * @param dbInstance
     */
    public void addDbInstance(DBInstance dbInstance) {
        if (this.dbInstances == null) {
            this.dbInstances = new ArrayList<>();
        }
        this.dbInstances.add(dbInstance);
    }

}