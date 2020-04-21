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
 * 快照相关接口
 * 快照相关接口，提供创建快照，查询快照信息，删除快照，修改快照信息等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.DelSnapshot;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * -   删除云硬盘快照:快照状态必须为 available 或 error 状态。
-   快照独立于云硬盘生命周期，删除快照不会对创建快照的云硬盘有任何影响。
-   快照删除后不可恢复，请谨慎操作。

 */
public class DeleteSnapshotsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * snapshots
     */
    private List<DelSnapshot> snapshots;

    /**
     * 删除快照成功的数量
     */
    private Integer successCount;

    /**
     * 删除快照成功的数量
     */
    private Integer failedCount;


    /**
     * get snapshots
     *
     * @return
     */
    public List<DelSnapshot> getSnapshots() {
        return snapshots;
    }

    /**
     * set snapshots
     *
     * @param snapshots
     */
    public void setSnapshots(List<DelSnapshot> snapshots) {
        this.snapshots = snapshots;
    }

    /**
     * get 删除快照成功的数量
     *
     * @return
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * set 删除快照成功的数量
     *
     * @param successCount
     */
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    /**
     * get 删除快照成功的数量
     *
     * @return
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    /**
     * set 删除快照成功的数量
     *
     * @param failedCount
     */
    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }


    /**
     * set snapshots
     *
     * @param snapshots
     */
    public DeleteSnapshotsResult snapshots(List<DelSnapshot> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    /**
     * set 删除快照成功的数量
     *
     * @param successCount
     */
    public DeleteSnapshotsResult successCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * set 删除快照成功的数量
     *
     * @param failedCount
     */
    public DeleteSnapshotsResult failedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }


    /**
     * add item to snapshots
     *
     * @param snapshot
     */
    public void addSnapshot(DelSnapshot snapshot) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshot);
    }

}