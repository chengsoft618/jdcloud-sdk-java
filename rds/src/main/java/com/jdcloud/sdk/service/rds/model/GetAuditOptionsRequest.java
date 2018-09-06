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
 * 审计管理
 * 审计管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取当前系统所支持的各种数据库版本的审计选项及相应的推荐选项&lt;br&gt;- 仅支持SQL Server
 */
public class GetAuditOptionsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 审计选项类别，**大小写敏感**，目前支持两种类型：&lt;br&gt;（1）AuditOptions开头：在disalbed参数中返回SQL Server各个版本支持的所有选项，支持的名称为&lt;br&gt;AuditOptions2008R2&lt;br&gt;AuditOptions2012&lt;br&gt;AuditOptions2014&lt;br&gt;AuditOptions2016&lt;br&gt;例如输入参数为&quot;AuditOptions2016&quot;，则在disabled字段中返回SQL Server 2016 版本所支持的所有的审计选项&lt;br&gt;（2）AuditDefault开头：京东云建议的默认选项,在enabled参数中返回建议开启的选项，在disabled参数中返回不开启的选项，支持的名称为：&lt;br&gt;AuditDefault2008R2&lt;br&gt;AuditDefault2012&lt;br&gt;AuditDefault2014&lt;br&gt;AuditDefault2016&lt;br&gt;例如输入参数为&quot;AuditDefault2016&quot;，则在enabled字段返回SQL Server 2016 版本中京东云建议开启的审计选项，在disabled字段中返回建议不开启的选项
     * Required:true
     */
    @Required
    private String name;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 审计选项类别，**大小写敏感**，目前支持两种类型：&lt;br&gt;（1）AuditOptions开头：在disalbed参数中返回SQL Server各个版本支持的所有选项，支持的名称为&lt;br&gt;AuditOptions2008R2&lt;br&gt;AuditOptions2012&lt;br&gt;AuditOptions2014&lt;br&gt;AuditOptions2016&lt;br&gt;例如输入参数为&quot;AuditOptions2016&quot;，则在disabled字段中返回SQL Server 2016 版本所支持的所有的审计选项&lt;br&gt;（2）AuditDefault开头：京东云建议的默认选项,在enabled参数中返回建议开启的选项，在disabled参数中返回不开启的选项，支持的名称为：&lt;br&gt;AuditDefault2008R2&lt;br&gt;AuditDefault2012&lt;br&gt;AuditDefault2014&lt;br&gt;AuditDefault2016&lt;br&gt;例如输入参数为&quot;AuditDefault2016&quot;，则在enabled字段返回SQL Server 2016 版本中京东云建议开启的审计选项，在disabled字段中返回建议不开启的选项
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 审计选项类别，**大小写敏感**，目前支持两种类型：&lt;br&gt;（1）AuditOptions开头：在disalbed参数中返回SQL Server各个版本支持的所有选项，支持的名称为&lt;br&gt;AuditOptions2008R2&lt;br&gt;AuditOptions2012&lt;br&gt;AuditOptions2014&lt;br&gt;AuditOptions2016&lt;br&gt;例如输入参数为&quot;AuditOptions2016&quot;，则在disabled字段中返回SQL Server 2016 版本所支持的所有的审计选项&lt;br&gt;（2）AuditDefault开头：京东云建议的默认选项,在enabled参数中返回建议开启的选项，在disabled参数中返回不开启的选项，支持的名称为：&lt;br&gt;AuditDefault2008R2&lt;br&gt;AuditDefault2012&lt;br&gt;AuditDefault2014&lt;br&gt;AuditDefault2016&lt;br&gt;例如输入参数为&quot;AuditDefault2016&quot;，则在enabled字段返回SQL Server 2016 版本中京东云建议开启的审计选项，在disabled字段中返回建议不开启的选项
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 审计选项类别，**大小写敏感**，目前支持两种类型：&lt;br&gt;（1）AuditOptions开头：在disalbed参数中返回SQL Server各个版本支持的所有选项，支持的名称为&lt;br&gt;AuditOptions2008R2&lt;br&gt;AuditOptions2012&lt;br&gt;AuditOptions2014&lt;br&gt;AuditOptions2016&lt;br&gt;例如输入参数为&quot;AuditOptions2016&quot;，则在disabled字段中返回SQL Server 2016 版本所支持的所有的审计选项&lt;br&gt;（2）AuditDefault开头：京东云建议的默认选项,在enabled参数中返回建议开启的选项，在disabled参数中返回不开启的选项，支持的名称为：&lt;br&gt;AuditDefault2008R2&lt;br&gt;AuditDefault2012&lt;br&gt;AuditDefault2014&lt;br&gt;AuditDefault2016&lt;br&gt;例如输入参数为&quot;AuditDefault2016&quot;，则在enabled字段返回SQL Server 2016 版本中京东云建议开启的审计选项，在disabled字段中返回建议不开启的选项
     *
     * @param name
     */
    public GetAuditOptionsRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public GetAuditOptionsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public GetAuditOptionsRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}