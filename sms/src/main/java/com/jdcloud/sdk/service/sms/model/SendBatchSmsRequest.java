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
 * 短信发送接口
 * 短信发送相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.sms.model.SendBatchSmsSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 指定模板群发短信
 */
public class SendBatchSmsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指定模板群发短信请求参数
     * Required:true
     */
    @Required
    private SendBatchSmsSpec sendBatchSmsSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 指定模板群发短信请求参数
     *
     * @return
     */
    public SendBatchSmsSpec getSendBatchSmsSpec() {
        return sendBatchSmsSpec;
    }

    /**
     * set 指定模板群发短信请求参数
     *
     * @param sendBatchSmsSpec
     */
    public void setSendBatchSmsSpec(SendBatchSmsSpec sendBatchSmsSpec) {
        this.sendBatchSmsSpec = sendBatchSmsSpec;
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
     * set 指定模板群发短信请求参数
     *
     * @param sendBatchSmsSpec
     */
    public SendBatchSmsRequest sendBatchSmsSpec(SendBatchSmsSpec sendBatchSmsSpec) {
        this.sendBatchSmsSpec = sendBatchSmsSpec;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public SendBatchSmsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}