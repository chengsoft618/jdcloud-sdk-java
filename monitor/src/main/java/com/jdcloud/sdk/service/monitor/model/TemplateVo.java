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

import java.util.List;
import java.util.ArrayList;

/**
 * templateVo
 */
public class TemplateVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * createTime
     */
    private String createTime;

    /**
     * 模板描述
     */
    private String description;

    /**
     * 用户
     */
    private String pin;

    /**
     * 模板内包含的规则数量
     */
    private Long rulesCount;

    /**
     * 模板所属资源类型
     */
    private String serviceCode;

    /**
     * 模板id
     */
    private Long templateId;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 模板内包含的规则
     */
    private List<AlarmVo> templateRules;

    /**
     * 模板内包含的提供给前端的拼接好的规则
     */
    private List<String> templateRulesString;

    /**
     * 模板类型，区分默认模板和用户自定义模板：1表示默认模板，2表示用户自定义模板
     */
    private Long templateType;

    /**
     * updateTime
     */
    private String updateTime;


    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 模板描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 模板描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 用户
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 模板内包含的规则数量
     *
     * @return
     */
    public Long getRulesCount() {
        return rulesCount;
    }

    /**
     * set 模板内包含的规则数量
     *
     * @param rulesCount
     */
    public void setRulesCount(Long rulesCount) {
        this.rulesCount = rulesCount;
    }

    /**
     * get 模板所属资源类型
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 模板所属资源类型
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 模板id
     *
     * @return
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * set 模板id
     *
     * @param templateId
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /**
     * get 模板名称
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板名称
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 模板内包含的规则
     *
     * @return
     */
    public List<AlarmVo> getTemplateRules() {
        return templateRules;
    }

    /**
     * set 模板内包含的规则
     *
     * @param templateRules
     */
    public void setTemplateRules(List<AlarmVo> templateRules) {
        this.templateRules = templateRules;
    }

    /**
     * get 模板内包含的提供给前端的拼接好的规则
     *
     * @return
     */
    public List<String> getTemplateRulesString() {
        return templateRulesString;
    }

    /**
     * set 模板内包含的提供给前端的拼接好的规则
     *
     * @param templateRulesString
     */
    public void setTemplateRulesString(List<String> templateRulesString) {
        this.templateRulesString = templateRulesString;
    }

    /**
     * get 模板类型，区分默认模板和用户自定义模板：1表示默认模板，2表示用户自定义模板
     *
     * @return
     */
    public Long getTemplateType() {
        return templateType;
    }

    /**
     * set 模板类型，区分默认模板和用户自定义模板：1表示默认模板，2表示用户自定义模板
     *
     * @param templateType
     */
    public void setTemplateType(Long templateType) {
        this.templateType = templateType;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set createTime
     *
     * @param createTime
     */
    public TemplateVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 模板描述
     *
     * @param description
     */
    public TemplateVo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 用户
     *
     * @param pin
     */
    public TemplateVo pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 模板内包含的规则数量
     *
     * @param rulesCount
     */
    public TemplateVo rulesCount(Long rulesCount) {
        this.rulesCount = rulesCount;
        return this;
    }

    /**
     * set 模板所属资源类型
     *
     * @param serviceCode
     */
    public TemplateVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 模板id
     *
     * @param templateId
     */
    public TemplateVo templateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param templateName
     */
    public TemplateVo templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 模板内包含的规则
     *
     * @param templateRules
     */
    public TemplateVo templateRules(List<AlarmVo> templateRules) {
        this.templateRules = templateRules;
        return this;
    }

    /**
     * set 模板内包含的提供给前端的拼接好的规则
     *
     * @param templateRulesString
     */
    public TemplateVo templateRulesString(List<String> templateRulesString) {
        this.templateRulesString = templateRulesString;
        return this;
    }

    /**
     * set 模板类型，区分默认模板和用户自定义模板：1表示默认模板，2表示用户自定义模板
     *
     * @param templateType
     */
    public TemplateVo templateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public TemplateVo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to 模板内包含的规则
     *
     * @param templateRule
     */
    public void addTemplateRule(AlarmVo templateRule) {
        if (this.templateRules == null) {
            this.templateRules = new ArrayList<>();
        }
        this.templateRules.add(templateRule);
    }

    /**
     * add item to 模板内包含的提供给前端的拼接好的规则
     *
     * @param templateRulesString
     */
    public void addTemplateRulesString(String templateRulesString) {
        if (this.templateRulesString == null) {
            this.templateRulesString = new ArrayList<>();
        }
        this.templateRulesString.add(templateRulesString);
    }

}