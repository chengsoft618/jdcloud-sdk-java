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
 * 媒体处理相关接口
 * 多媒体处理服务API，包括截图、转码、媒体处理消息通知等操作。本文档详细说明了媒体处理API及用法，适合开发人员阅读。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 视频截图源文件参数
 */
public class ThumbnailTaskSource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 输入视频信息的 bucket
     * Required:true
     */
    @Required
    private String bucket;

    /**
     * 输入视频信息的 Key
     * Required:true
     */
    @Required
    private String key;


    /**
     * get 输入视频信息的 bucket
     *
     * @return
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * set 输入视频信息的 bucket
     *
     * @param bucket
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * get 输入视频信息的 Key
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 输入视频信息的 Key
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * set 输入视频信息的 bucket
     *
     * @param bucket
     */
    public ThumbnailTaskSource bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * set 输入视频信息的 Key
     *
     * @param key
     */
    public ThumbnailTaskSource key(String key) {
        this.key = key;
        return this;
    }


}