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
 * 虚机规格
 */
public class InstanceTypeInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类型
     */
    private String instanceType;

    /**
     * 处理器核数，单位为C
     */
    private Integer cpu;

    /**
     * 内存大小，单位为M
     */
    private Integer memory;

    /**
     * GPU 数量
     */
    private Integer gpuAmount;

    /**
     * GPU 类型
     */
    private String gpuSpec;

    /**
     * 本地存储的单盘容量
     */
    private Integer localStorageSize;

    /**
     * 本地存储的类型
     */
    private String localStorageType;

    /**
     * 本地存储的数量
     */
    private Integer localStorageAmount;

    /**
     * 支持弹性网卡的数量
     */
    private Integer nicLimit;


    /**
     * get 类型
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 类型
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 处理器核数，单位为C
     *
     * @return
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * set 处理器核数，单位为C
     *
     * @param cpu
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * get 内存大小，单位为M
     *
     * @return
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * set 内存大小，单位为M
     *
     * @param memory
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * get GPU 数量
     *
     * @return
     */
    public Integer getGpuAmount() {
        return gpuAmount;
    }

    /**
     * set GPU 数量
     *
     * @param gpuAmount
     */
    public void setGpuAmount(Integer gpuAmount) {
        this.gpuAmount = gpuAmount;
    }

    /**
     * get GPU 类型
     *
     * @return
     */
    public String getGpuSpec() {
        return gpuSpec;
    }

    /**
     * set GPU 类型
     *
     * @param gpuSpec
     */
    public void setGpuSpec(String gpuSpec) {
        this.gpuSpec = gpuSpec;
    }

    /**
     * get 本地存储的单盘容量
     *
     * @return
     */
    public Integer getLocalStorageSize() {
        return localStorageSize;
    }

    /**
     * set 本地存储的单盘容量
     *
     * @param localStorageSize
     */
    public void setLocalStorageSize(Integer localStorageSize) {
        this.localStorageSize = localStorageSize;
    }

    /**
     * get 本地存储的类型
     *
     * @return
     */
    public String getLocalStorageType() {
        return localStorageType;
    }

    /**
     * set 本地存储的类型
     *
     * @param localStorageType
     */
    public void setLocalStorageType(String localStorageType) {
        this.localStorageType = localStorageType;
    }

    /**
     * get 本地存储的数量
     *
     * @return
     */
    public Integer getLocalStorageAmount() {
        return localStorageAmount;
    }

    /**
     * set 本地存储的数量
     *
     * @param localStorageAmount
     */
    public void setLocalStorageAmount(Integer localStorageAmount) {
        this.localStorageAmount = localStorageAmount;
    }

    /**
     * get 支持弹性网卡的数量
     *
     * @return
     */
    public Integer getNicLimit() {
        return nicLimit;
    }

    /**
     * set 支持弹性网卡的数量
     *
     * @param nicLimit
     */
    public void setNicLimit(Integer nicLimit) {
        this.nicLimit = nicLimit;
    }


    /**
     * set 类型
     *
     * @param instanceType
     */
    public InstanceTypeInfo instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 处理器核数，单位为C
     *
     * @param cpu
     */
    public InstanceTypeInfo cpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * set 内存大小，单位为M
     *
     * @param memory
     */
    public InstanceTypeInfo memory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * set GPU 数量
     *
     * @param gpuAmount
     */
    public InstanceTypeInfo gpuAmount(Integer gpuAmount) {
        this.gpuAmount = gpuAmount;
        return this;
    }

    /**
     * set GPU 类型
     *
     * @param gpuSpec
     */
    public InstanceTypeInfo gpuSpec(String gpuSpec) {
        this.gpuSpec = gpuSpec;
        return this;
    }

    /**
     * set 本地存储的单盘容量
     *
     * @param localStorageSize
     */
    public InstanceTypeInfo localStorageSize(Integer localStorageSize) {
        this.localStorageSize = localStorageSize;
        return this;
    }

    /**
     * set 本地存储的类型
     *
     * @param localStorageType
     */
    public InstanceTypeInfo localStorageType(String localStorageType) {
        this.localStorageType = localStorageType;
        return this;
    }

    /**
     * set 本地存储的数量
     *
     * @param localStorageAmount
     */
    public InstanceTypeInfo localStorageAmount(Integer localStorageAmount) {
        this.localStorageAmount = localStorageAmount;
        return this;
    }

    /**
     * set 支持弹性网卡的数量
     *
     * @param nicLimit
     */
    public InstanceTypeInfo nicLimit(Integer nicLimit) {
        this.nicLimit = nicLimit;
        return this;
    }


}