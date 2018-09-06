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

import java.util.List;
import java.util.ArrayList;

/**
 * backup
 */
public class Backup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备份ID
     */
    private String backupId;

    /**
     * 备份名称，最长支持64个英文字符或等长的中文字符
     */
    private String backupName;

    /**
     * 备份所属实例ID
     */
    private String instanceId;

    /**
     * 备份状态，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String backupStatus;

    /**
     * 备份开始时间，格式为：YYYY-MM-DD HH:mm:ss
     */
    private String backupStartTime;

    /**
     * 备份结束时间，格式为：YYYY-MM-DD HH:mm:ss&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     */
    private String backupEndTime;

    /**
     * 备份类型，全量备份或增量备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     */
    private String backupType;

    /**
     * 备份模式，系统自动备份或手动备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String backupMode;

    /**
     * 备份粒度，实例备份或者多库备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     */
    private String backupUnit;

    /**
     * 备份文件列表&lt;br&gt;- **SQL Server支持**,备份可以有多个文件，文件名的命名规则为:&lt;br&gt;（1）全备：数据库名+.bak&lt;br&gt;（2）增量：数据库名+.diff&lt;br&gt;- **MySQL不支持**
     */
    private List<String> backupFiles;

    /**
     * 整个备份集大小，单位：Byte
     */
    private Integer backupSizeByte;


    /**
     * get 备份ID
     *
     * @return
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * set 备份ID
     *
     * @param backupId
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * get 备份名称，最长支持64个英文字符或等长的中文字符
     *
     * @return
     */
    public String getBackupName() {
        return backupName;
    }

    /**
     * set 备份名称，最长支持64个英文字符或等长的中文字符
     *
     * @param backupName
     */
    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    /**
     * get 备份所属实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 备份所属实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 备份状态，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getBackupStatus() {
        return backupStatus;
    }

    /**
     * set 备份状态，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param backupStatus
     */
    public void setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
    }

    /**
     * get 备份开始时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @return
     */
    public String getBackupStartTime() {
        return backupStartTime;
    }

    /**
     * set 备份开始时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param backupStartTime
     */
    public void setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
    }

    /**
     * get 备份结束时间，格式为：YYYY-MM-DD HH:mm:ss&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @return
     */
    public String getBackupEndTime() {
        return backupEndTime;
    }

    /**
     * set 备份结束时间，格式为：YYYY-MM-DD HH:mm:ss&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @param backupEndTime
     */
    public void setBackupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
    }

    /**
     * get 备份类型，全量备份或增量备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @return
     */
    public String getBackupType() {
        return backupType;
    }

    /**
     * set 备份类型，全量备份或增量备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @param backupType
     */
    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    /**
     * get 备份模式，系统自动备份或手动备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getBackupMode() {
        return backupMode;
    }

    /**
     * set 备份模式，系统自动备份或手动备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param backupMode
     */
    public void setBackupMode(String backupMode) {
        this.backupMode = backupMode;
    }

    /**
     * get 备份粒度，实例备份或者多库备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @return
     */
    public String getBackupUnit() {
        return backupUnit;
    }

    /**
     * set 备份粒度，实例备份或者多库备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @param backupUnit
     */
    public void setBackupUnit(String backupUnit) {
        this.backupUnit = backupUnit;
    }

    /**
     * get 备份文件列表&lt;br&gt;- **SQL Server支持**,备份可以有多个文件，文件名的命名规则为:&lt;br&gt;（1）全备：数据库名+.bak&lt;br&gt;（2）增量：数据库名+.diff&lt;br&gt;- **MySQL不支持**
     *
     * @return
     */
    public List<String> getBackupFiles() {
        return backupFiles;
    }

    /**
     * set 备份文件列表&lt;br&gt;- **SQL Server支持**,备份可以有多个文件，文件名的命名规则为:&lt;br&gt;（1）全备：数据库名+.bak&lt;br&gt;（2）增量：数据库名+.diff&lt;br&gt;- **MySQL不支持**
     *
     * @param backupFiles
     */
    public void setBackupFiles(List<String> backupFiles) {
        this.backupFiles = backupFiles;
    }

    /**
     * get 整个备份集大小，单位：Byte
     *
     * @return
     */
    public Integer getBackupSizeByte() {
        return backupSizeByte;
    }

    /**
     * set 整个备份集大小，单位：Byte
     *
     * @param backupSizeByte
     */
    public void setBackupSizeByte(Integer backupSizeByte) {
        this.backupSizeByte = backupSizeByte;
    }


    /**
     * set 备份ID
     *
     * @param backupId
     */
    public Backup backupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * set 备份名称，最长支持64个英文字符或等长的中文字符
     *
     * @param backupName
     */
    public Backup backupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * set 备份所属实例ID
     *
     * @param instanceId
     */
    public Backup instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 备份状态，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param backupStatus
     */
    public Backup backupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    /**
     * set 备份开始时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param backupStartTime
     */
    public Backup backupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }

    /**
     * set 备份结束时间，格式为：YYYY-MM-DD HH:mm:ss&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @param backupEndTime
     */
    public Backup backupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
        return this;
    }

    /**
     * set 备份类型，全量备份或增量备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @param backupType
     */
    public Backup backupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * set 备份模式，系统自动备份或手动备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param backupMode
     */
    public Backup backupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }

    /**
     * set 备份粒度，实例备份或者多库备份，请查看[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **SQL Server支持**&lt;br&gt;- **MySQL不支持**
     *
     * @param backupUnit
     */
    public Backup backupUnit(String backupUnit) {
        this.backupUnit = backupUnit;
        return this;
    }

    /**
     * set 备份文件列表&lt;br&gt;- **SQL Server支持**,备份可以有多个文件，文件名的命名规则为:&lt;br&gt;（1）全备：数据库名+.bak&lt;br&gt;（2）增量：数据库名+.diff&lt;br&gt;- **MySQL不支持**
     *
     * @param backupFiles
     */
    public Backup backupFiles(List<String> backupFiles) {
        this.backupFiles = backupFiles;
        return this;
    }

    /**
     * set 整个备份集大小，单位：Byte
     *
     * @param backupSizeByte
     */
    public Backup backupSizeByte(Integer backupSizeByte) {
        this.backupSizeByte = backupSizeByte;
        return this;
    }


    /**
     * add item to 备份文件列表&lt;br&gt;- **SQL Server支持**,备份可以有多个文件，文件名的命名规则为:&lt;br&gt;（1）全备：数据库名+.bak&lt;br&gt;（2）增量：数据库名+.diff&lt;br&gt;- **MySQL不支持**
     *
     * @param backupFile
     */
    public void addBackupFile(String backupFile) {
        if (this.backupFiles == null) {
            this.backupFiles = new ArrayList<>();
        }
        this.backupFiles.add(backupFile);
    }

}