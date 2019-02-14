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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * OSS文件信息
 */
public class OssFileInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 存储桶名称
     */
    private String bucketName;

    /**
     * 文件存储Key值
     */
    private String key;

    /**
     * 文件大小（字节）
     */
    private Double size;

    /**
     * 上次修改时间
     */
    private String lastModifiedTime;

    /**
     * 存储类型
     */
    private String storageClass;


    /**
     * get 存储桶名称
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set 存储桶名称
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * get 文件存储Key值
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 文件存储Key值
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * get 文件大小（字节）
     *
     * @return
     */
    public Double getSize() {
        return size;
    }

    /**
     * set 文件大小（字节）
     *
     * @param size
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * get 上次修改时间
     *
     * @return
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * set 上次修改时间
     *
     * @param lastModifiedTime
     */
    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * get 存储类型
     *
     * @return
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * set 存储类型
     *
     * @param storageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }


    /**
     * set 存储桶名称
     *
     * @param bucketName
     */
    public OssFileInfo bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * set 文件存储Key值
     *
     * @param key
     */
    public OssFileInfo key(String key) {
        this.key = key;
        return this;
    }

    /**
     * set 文件大小（字节）
     *
     * @param size
     */
    public OssFileInfo size(Double size) {
        this.size = size;
        return this;
    }

    /**
     * set 上次修改时间
     *
     * @param lastModifiedTime
     */
    public OssFileInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * set 存储类型
     *
     * @param storageClass
     */
    public OssFileInfo storageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }


}