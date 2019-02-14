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

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * describeTemplateByIDSpec
 */
public class DescribeTemplateByIDSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板类型，区分默认模板和用户自定义模板：1表示默认模板，2表示用户自定义模板
in: query
     * Required:true
     */
    @Required
    private Long templateType;


    /**
     * get 模板类型，区分默认模板和用户自定义模板：1表示默认模板，2表示用户自定义模板
in: query
     *
     * @return
     */
    public Long getTemplateType() {
        return templateType;
    }

    /**
     * set 模板类型，区分默认模板和用户自定义模板：1表示默认模板，2表示用户自定义模板
in: query
     *
     * @param templateType
     */
    public void setTemplateType(Long templateType) {
        this.templateType = templateType;
    }


    /**
     * set 模板类型，区分默认模板和用户自定义模板：1表示默认模板，2表示用户自定义模板
in: query
     *
     * @param templateType
     */
    public DescribeTemplateByIDSpec templateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }


}