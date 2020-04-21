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
 * 合同管理接口
 * 电子签章-合同管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 合同签章四种方式：
1. 合同文件 + 印章文件：contractContent + stampContent
2. 合同文件 + 印章ID：contractContent + stampId
3. 模板ID + 印章文件：templateId + stampContent
4. 模板ID + 印章ID：templateId + stampId

 */
public class SignContractResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新签的合同ID
     */
    private String contractId;

    /**
     * 新签的合同文件（base64）
     */
    private String contractContent;


    /**
     * get 新签的合同ID
     *
     * @return
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * set 新签的合同ID
     *
     * @param contractId
     */
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * get 新签的合同文件（base64）
     *
     * @return
     */
    public String getContractContent() {
        return contractContent;
    }

    /**
     * set 新签的合同文件（base64）
     *
     * @param contractContent
     */
    public void setContractContent(String contractContent) {
        this.contractContent = contractContent;
    }


    /**
     * set 新签的合同ID
     *
     * @param contractId
     */
    public SignContractResult contractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    /**
     * set 新签的合同文件（base64）
     *
     * @param contractContent
     */
    public SignContractResult contractContent(String contractContent) {
        this.contractContent = contractContent;
        return this;
    }


}