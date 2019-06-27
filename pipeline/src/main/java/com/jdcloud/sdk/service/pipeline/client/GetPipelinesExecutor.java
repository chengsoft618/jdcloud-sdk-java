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
 * pipeline
 * API OF Pipeline Create|Update|Read|Delete|Execute
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pipeline.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.pipeline.model.GetPipelinesResponse;

/**
 * 查询获取流水线任务列表，并显示最后一次执行的状态或结果信息
/v1/regions/cn-south-1?sorts.1.name&#x3D;startedAt&amp;sorts.1.direction&#x3D;desc&amp;pageNumber&#x3D;1&amp;pageSize&#x3D;10&amp;filters.1.name&#x3D;name&amp;filters.1.values.1&#x3D;我的pipeline

 */
class GetPipelinesExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/pipeline";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return GetPipelinesResponse.class;
    }
}
