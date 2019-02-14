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
 * Live API
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加直播截图模板
 */
public class AddCustomLiveStreamSnapshotTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片格式
     * Required:true
     */
    @Required
    private String format;

    /**
     * 图片宽度
     * Required:true
     */
    @Required
    private Integer width;

    /**
     * 范围
     * Required:true
     */
    @Required
    private Integer height;

    /**
     * 截图与设定的宽高不匹配时的处理规则
     * Required:true
     */
    @Required
    private Integer fillType;

    /**
     * 截图周期
     * Required:true
     */
    @Required
    private Integer snapshotInterval;

    /**
     * 存储模式
     * Required:true
     */
    @Required
    private Integer saveMode;

    /**
     * 保存bucket
     * Required:true
     */
    @Required
    private String saveBucket;

    /**
     * 保存endPoint
     * Required:true
     */
    @Required
    private String saveEndpoint;

    /**
     * 录制模板自定义名称
     * Required:true
     */
    @Required
    private String template;


    /**
     * get 图片格式
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set 图片格式
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * get 图片宽度
     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 图片宽度
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 范围
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 范围
     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 截图与设定的宽高不匹配时的处理规则
     *
     * @return
     */
    public Integer getFillType() {
        return fillType;
    }

    /**
     * set 截图与设定的宽高不匹配时的处理规则
     *
     * @param fillType
     */
    public void setFillType(Integer fillType) {
        this.fillType = fillType;
    }

    /**
     * get 截图周期
     *
     * @return
     */
    public Integer getSnapshotInterval() {
        return snapshotInterval;
    }

    /**
     * set 截图周期
     *
     * @param snapshotInterval
     */
    public void setSnapshotInterval(Integer snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
    }

    /**
     * get 存储模式
     *
     * @return
     */
    public Integer getSaveMode() {
        return saveMode;
    }

    /**
     * set 存储模式
     *
     * @param saveMode
     */
    public void setSaveMode(Integer saveMode) {
        this.saveMode = saveMode;
    }

    /**
     * get 保存bucket
     *
     * @return
     */
    public String getSaveBucket() {
        return saveBucket;
    }

    /**
     * set 保存bucket
     *
     * @param saveBucket
     */
    public void setSaveBucket(String saveBucket) {
        this.saveBucket = saveBucket;
    }

    /**
     * get 保存endPoint
     *
     * @return
     */
    public String getSaveEndpoint() {
        return saveEndpoint;
    }

    /**
     * set 保存endPoint
     *
     * @param saveEndpoint
     */
    public void setSaveEndpoint(String saveEndpoint) {
        this.saveEndpoint = saveEndpoint;
    }

    /**
     * get 录制模板自定义名称
     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 录制模板自定义名称
     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 图片格式
     *
     * @param format
     */
    public AddCustomLiveStreamSnapshotTemplateRequest format(String format) {
        this.format = format;
        return this;
    }

    /**
     * set 图片宽度
     *
     * @param width
     */
    public AddCustomLiveStreamSnapshotTemplateRequest width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 范围
     *
     * @param height
     */
    public AddCustomLiveStreamSnapshotTemplateRequest height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 截图与设定的宽高不匹配时的处理规则
     *
     * @param fillType
     */
    public AddCustomLiveStreamSnapshotTemplateRequest fillType(Integer fillType) {
        this.fillType = fillType;
        return this;
    }

    /**
     * set 截图周期
     *
     * @param snapshotInterval
     */
    public AddCustomLiveStreamSnapshotTemplateRequest snapshotInterval(Integer snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
        return this;
    }

    /**
     * set 存储模式
     *
     * @param saveMode
     */
    public AddCustomLiveStreamSnapshotTemplateRequest saveMode(Integer saveMode) {
        this.saveMode = saveMode;
        return this;
    }

    /**
     * set 保存bucket
     *
     * @param saveBucket
     */
    public AddCustomLiveStreamSnapshotTemplateRequest saveBucket(String saveBucket) {
        this.saveBucket = saveBucket;
        return this;
    }

    /**
     * set 保存endPoint
     *
     * @param saveEndpoint
     */
    public AddCustomLiveStreamSnapshotTemplateRequest saveEndpoint(String saveEndpoint) {
        this.saveEndpoint = saveEndpoint;
        return this;
    }

    /**
     * set 录制模板自定义名称
     *
     * @param template
     */
    public AddCustomLiveStreamSnapshotTemplateRequest template(String template) {
        this.template = template;
        return this;
    }


}