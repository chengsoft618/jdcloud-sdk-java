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
 * 数据库管理
 * 数据库管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.rds.model.RestoreDatabaseFromFileResponse;

/**
 * 从用户通过单库上云工具上传到云上的备份文件中恢复单个数据库&lt;br&gt;- 仅支持SQL Server
 */
class RestoreDatabaseFromFileExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}/databases/{dbName}:restoreDatabaseFromFile";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return RestoreDatabaseFromFileResponse.class;
    }
}
