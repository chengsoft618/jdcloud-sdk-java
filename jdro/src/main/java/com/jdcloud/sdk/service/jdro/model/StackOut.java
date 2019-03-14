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

package com.jdcloud.sdk.service.jdro.model;


/**
 * stackOut
 */
public class StackOut  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源栈运行操作
     */
    private String action;

    /**
     * 资源栈能否更新
     */
    private Boolean canUpdate;

    /**
     * 资源栈创建时间
     */
    private String createTime;

    /**
     * 资源栈是否回滚设置
     */
    private Boolean disableRollback;

    /**
     * 资源栈ID
     */
    private String id;

    /**
     * 资源栈输入信息，JSON格式，此字段只在查询资源栈详情describeStack时有值
     */
    private Object input;

    /**
     * 资源栈名称
     */
    private String name;

    /**
     * 资源栈输出信息，JSON格式, 此字段只在查询资源栈详情describeStack时有值
     */
    private Object output;

    /**
     * 资源栈所在区域
     */
    private String region;

    /**
     * 资源栈版本
     */
    private Long stackVersion;

    /**
     * 资源栈运行状态
     */
    private String status;

    /**
     * 资源栈运行状态原因
     */
    private String statusReason;

    /**
     * 资源栈使用的template ID
     */
    private String templateId;

    /**
     * 资源栈超时时间
     */
    private Long timeout;

    /**
     * 资源栈更新时间
     */
    private String updateTime;


    /**
     * get 资源栈运行操作
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 资源栈运行操作
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 资源栈能否更新
     *
     * @return
     */
    public Boolean getCanUpdate() {
        return canUpdate;
    }

    /**
     * set 资源栈能否更新
     *
     * @param canUpdate
     */
    public void setCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    /**
     * get 资源栈创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 资源栈创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 资源栈是否回滚设置
     *
     * @return
     */
    public Boolean getDisableRollback() {
        return disableRollback;
    }

    /**
     * set 资源栈是否回滚设置
     *
     * @param disableRollback
     */
    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }

    /**
     * get 资源栈ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 资源栈ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 资源栈输入信息，JSON格式，此字段只在查询资源栈详情describeStack时有值
     *
     * @return
     */
    public Object getInput() {
        return input;
    }

    /**
     * set 资源栈输入信息，JSON格式，此字段只在查询资源栈详情describeStack时有值
     *
     * @param input
     */
    public void setInput(Object input) {
        this.input = input;
    }

    /**
     * get 资源栈名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 资源栈名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 资源栈输出信息，JSON格式, 此字段只在查询资源栈详情describeStack时有值
     *
     * @return
     */
    public Object getOutput() {
        return output;
    }

    /**
     * set 资源栈输出信息，JSON格式, 此字段只在查询资源栈详情describeStack时有值
     *
     * @param output
     */
    public void setOutput(Object output) {
        this.output = output;
    }

    /**
     * get 资源栈所在区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 资源栈所在区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 资源栈版本
     *
     * @return
     */
    public Long getStackVersion() {
        return stackVersion;
    }

    /**
     * set 资源栈版本
     *
     * @param stackVersion
     */
    public void setStackVersion(Long stackVersion) {
        this.stackVersion = stackVersion;
    }

    /**
     * get 资源栈运行状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 资源栈运行状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 资源栈运行状态原因
     *
     * @return
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * set 资源栈运行状态原因
     *
     * @param statusReason
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * get 资源栈使用的template ID
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 资源栈使用的template ID
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * get 资源栈超时时间
     *
     * @return
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * set 资源栈超时时间
     *
     * @param timeout
     */
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    /**
     * get 资源栈更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 资源栈更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 资源栈运行操作
     *
     * @param action
     */
    public StackOut action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 资源栈能否更新
     *
     * @param canUpdate
     */
    public StackOut canUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
        return this;
    }

    /**
     * set 资源栈创建时间
     *
     * @param createTime
     */
    public StackOut createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 资源栈是否回滚设置
     *
     * @param disableRollback
     */
    public StackOut disableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }

    /**
     * set 资源栈ID
     *
     * @param id
     */
    public StackOut id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 资源栈输入信息，JSON格式，此字段只在查询资源栈详情describeStack时有值
     *
     * @param input
     */
    public StackOut input(Object input) {
        this.input = input;
        return this;
    }

    /**
     * set 资源栈名称
     *
     * @param name
     */
    public StackOut name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 资源栈输出信息，JSON格式, 此字段只在查询资源栈详情describeStack时有值
     *
     * @param output
     */
    public StackOut output(Object output) {
        this.output = output;
        return this;
    }

    /**
     * set 资源栈所在区域
     *
     * @param region
     */
    public StackOut region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 资源栈版本
     *
     * @param stackVersion
     */
    public StackOut stackVersion(Long stackVersion) {
        this.stackVersion = stackVersion;
        return this;
    }

    /**
     * set 资源栈运行状态
     *
     * @param status
     */
    public StackOut status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 资源栈运行状态原因
     *
     * @param statusReason
     */
    public StackOut statusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * set 资源栈使用的template ID
     *
     * @param templateId
     */
    public StackOut templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 资源栈超时时间
     *
     * @param timeout
     */
    public StackOut timeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * set 资源栈更新时间
     *
     * @param updateTime
     */
    public StackOut updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}