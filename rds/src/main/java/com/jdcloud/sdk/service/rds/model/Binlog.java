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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;


/**
 * binlog
 */
public class Binlog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * binlog日志备份ID
     */
    private String binlogBackupId;

    /**
     * binlog日志名称
     */
    private String binlogName;

    /**
     * binlog日志大小，单位KB
     */
    private Long binlogSizeKB;

    /**
     * binlog开始时间,格式为：YYYY-MM-DD HH:mm:ss
     */
    private String binlogStartTime;

    /**
     * binlog结束时间,格式为：YYYY-MM-DD HH:mm:ss
     */
    private String binlogEndTime;


    /**
     * get binlog日志备份ID
     *
     * @return
     */
    public String getBinlogBackupId() {
        return binlogBackupId;
    }

    /**
     * set binlog日志备份ID
     *
     * @param binlogBackupId
     */
    public void setBinlogBackupId(String binlogBackupId) {
        this.binlogBackupId = binlogBackupId;
    }

    /**
     * get binlog日志名称
     *
     * @return
     */
    public String getBinlogName() {
        return binlogName;
    }

    /**
     * set binlog日志名称
     *
     * @param binlogName
     */
    public void setBinlogName(String binlogName) {
        this.binlogName = binlogName;
    }

    /**
     * get binlog日志大小，单位KB
     *
     * @return
     */
    public Long getBinlogSizeKB() {
        return binlogSizeKB;
    }

    /**
     * set binlog日志大小，单位KB
     *
     * @param binlogSizeKB
     */
    public void setBinlogSizeKB(Long binlogSizeKB) {
        this.binlogSizeKB = binlogSizeKB;
    }

    /**
     * get binlog开始时间,格式为：YYYY-MM-DD HH:mm:ss
     *
     * @return
     */
    public String getBinlogStartTime() {
        return binlogStartTime;
    }

    /**
     * set binlog开始时间,格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param binlogStartTime
     */
    public void setBinlogStartTime(String binlogStartTime) {
        this.binlogStartTime = binlogStartTime;
    }

    /**
     * get binlog结束时间,格式为：YYYY-MM-DD HH:mm:ss
     *
     * @return
     */
    public String getBinlogEndTime() {
        return binlogEndTime;
    }

    /**
     * set binlog结束时间,格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param binlogEndTime
     */
    public void setBinlogEndTime(String binlogEndTime) {
        this.binlogEndTime = binlogEndTime;
    }


    /**
     * set binlog日志备份ID
     *
     * @param binlogBackupId
     */
    public Binlog binlogBackupId(String binlogBackupId) {
        this.binlogBackupId = binlogBackupId;
        return this;
    }

    /**
     * set binlog日志名称
     *
     * @param binlogName
     */
    public Binlog binlogName(String binlogName) {
        this.binlogName = binlogName;
        return this;
    }

    /**
     * set binlog日志大小，单位KB
     *
     * @param binlogSizeKB
     */
    public Binlog binlogSizeKB(Long binlogSizeKB) {
        this.binlogSizeKB = binlogSizeKB;
        return this;
    }

    /**
     * set binlog开始时间,格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param binlogStartTime
     */
    public Binlog binlogStartTime(String binlogStartTime) {
        this.binlogStartTime = binlogStartTime;
        return this;
    }

    /**
     * set binlog结束时间,格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param binlogEndTime
     */
    public Binlog binlogEndTime(String binlogEndTime) {
        this.binlogEndTime = binlogEndTime;
        return this;
    }


}