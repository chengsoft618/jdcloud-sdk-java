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

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 创建缓存Redis实例时，用户指定的参数
 */
public class CacheInstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 缓存Redis实例所属的私有网络ID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 缓存Redis实例在私有网络下所属的子网ID
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 缓存Redis实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符
     * Required:true
     */
    @Required
    private String cacheInstanceName;

    /**
     * 缓存Redis实例的规格代码（可调用describeInstanceClass接口获取），或者自定义分片实例的单分片规格代码（可调用describeSpecConfig接口获取）
     * Required:true
     */
    @Required
    private String cacheInstanceClass;

    /**
     * 缓存Redis实例的连接密码，为空即为免密，包含且只支持字母及数字，不少于8字符不超过16字符
     */
    private String password;

    /**
     * 缓存Redis实例所在区域的可用区ID
     * Required:true
     */
    @Required
    private AzIdSpec azId;

    /**
     * 缓存Redis实例的描述，不能超过256个字符
     */
    private String cacheInstanceDescription;

    /**
     * 缓存Redis引擎主次版本号：目前支持2.8和4.0，默认为2.8
     */
    private String redisVersion;

    /**
     * 是否支持IPv6，0或空表示不支持，1表示支持IPv6，注意不是所有区域都支持IPv6，且必须保证VPC支持IPv6
     */
    private Integer ipv6On;

    /**
     * 分片数，只对自定义分片规格实例有效，主从版固定为1，集群版大于1。每种分片规格支持的分片数可调用describeSpecConfig接口获取
     */
    private Integer shardNumber;


    /**
     * get 缓存Redis实例所属的私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 缓存Redis实例所属的私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 缓存Redis实例在私有网络下所属的子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 缓存Redis实例在私有网络下所属的子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 缓存Redis实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符
     *
     * @return
     */
    public String getCacheInstanceName() {
        return cacheInstanceName;
    }

    /**
     * set 缓存Redis实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符
     *
     * @param cacheInstanceName
     */
    public void setCacheInstanceName(String cacheInstanceName) {
        this.cacheInstanceName = cacheInstanceName;
    }

    /**
     * get 缓存Redis实例的规格代码（可调用describeInstanceClass接口获取），或者自定义分片实例的单分片规格代码（可调用describeSpecConfig接口获取）
     *
     * @return
     */
    public String getCacheInstanceClass() {
        return cacheInstanceClass;
    }

    /**
     * set 缓存Redis实例的规格代码（可调用describeInstanceClass接口获取），或者自定义分片实例的单分片规格代码（可调用describeSpecConfig接口获取）
     *
     * @param cacheInstanceClass
     */
    public void setCacheInstanceClass(String cacheInstanceClass) {
        this.cacheInstanceClass = cacheInstanceClass;
    }

    /**
     * get 缓存Redis实例的连接密码，为空即为免密，包含且只支持字母及数字，不少于8字符不超过16字符
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 缓存Redis实例的连接密码，为空即为免密，包含且只支持字母及数字，不少于8字符不超过16字符
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 缓存Redis实例所在区域的可用区ID
     *
     * @return
     */
    public AzIdSpec getAzId() {
        return azId;
    }

    /**
     * set 缓存Redis实例所在区域的可用区ID
     *
     * @param azId
     */
    public void setAzId(AzIdSpec azId) {
        this.azId = azId;
    }

    /**
     * get 缓存Redis实例的描述，不能超过256个字符
     *
     * @return
     */
    public String getCacheInstanceDescription() {
        return cacheInstanceDescription;
    }

    /**
     * set 缓存Redis实例的描述，不能超过256个字符
     *
     * @param cacheInstanceDescription
     */
    public void setCacheInstanceDescription(String cacheInstanceDescription) {
        this.cacheInstanceDescription = cacheInstanceDescription;
    }

    /**
     * get 缓存Redis引擎主次版本号：目前支持2.8和4.0，默认为2.8
     *
     * @return
     */
    public String getRedisVersion() {
        return redisVersion;
    }

    /**
     * set 缓存Redis引擎主次版本号：目前支持2.8和4.0，默认为2.8
     *
     * @param redisVersion
     */
    public void setRedisVersion(String redisVersion) {
        this.redisVersion = redisVersion;
    }

    /**
     * get 是否支持IPv6，0或空表示不支持，1表示支持IPv6，注意不是所有区域都支持IPv6，且必须保证VPC支持IPv6
     *
     * @return
     */
    public Integer getIpv6On() {
        return ipv6On;
    }

    /**
     * set 是否支持IPv6，0或空表示不支持，1表示支持IPv6，注意不是所有区域都支持IPv6，且必须保证VPC支持IPv6
     *
     * @param ipv6On
     */
    public void setIpv6On(Integer ipv6On) {
        this.ipv6On = ipv6On;
    }

    /**
     * get 分片数，只对自定义分片规格实例有效，主从版固定为1，集群版大于1。每种分片规格支持的分片数可调用describeSpecConfig接口获取
     *
     * @return
     */
    public Integer getShardNumber() {
        return shardNumber;
    }

    /**
     * set 分片数，只对自定义分片规格实例有效，主从版固定为1，集群版大于1。每种分片规格支持的分片数可调用describeSpecConfig接口获取
     *
     * @param shardNumber
     */
    public void setShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
    }


    /**
     * set 缓存Redis实例所属的私有网络ID
     *
     * @param vpcId
     */
    public CacheInstanceSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 缓存Redis实例在私有网络下所属的子网ID
     *
     * @param subnetId
     */
    public CacheInstanceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 缓存Redis实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符
     *
     * @param cacheInstanceName
     */
    public CacheInstanceSpec cacheInstanceName(String cacheInstanceName) {
        this.cacheInstanceName = cacheInstanceName;
        return this;
    }

    /**
     * set 缓存Redis实例的规格代码（可调用describeInstanceClass接口获取），或者自定义分片实例的单分片规格代码（可调用describeSpecConfig接口获取）
     *
     * @param cacheInstanceClass
     */
    public CacheInstanceSpec cacheInstanceClass(String cacheInstanceClass) {
        this.cacheInstanceClass = cacheInstanceClass;
        return this;
    }

    /**
     * set 缓存Redis实例的连接密码，为空即为免密，包含且只支持字母及数字，不少于8字符不超过16字符
     *
     * @param password
     */
    public CacheInstanceSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 缓存Redis实例所在区域的可用区ID
     *
     * @param azId
     */
    public CacheInstanceSpec azId(AzIdSpec azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set 缓存Redis实例的描述，不能超过256个字符
     *
     * @param cacheInstanceDescription
     */
    public CacheInstanceSpec cacheInstanceDescription(String cacheInstanceDescription) {
        this.cacheInstanceDescription = cacheInstanceDescription;
        return this;
    }

    /**
     * set 缓存Redis引擎主次版本号：目前支持2.8和4.0，默认为2.8
     *
     * @param redisVersion
     */
    public CacheInstanceSpec redisVersion(String redisVersion) {
        this.redisVersion = redisVersion;
        return this;
    }

    /**
     * set 是否支持IPv6，0或空表示不支持，1表示支持IPv6，注意不是所有区域都支持IPv6，且必须保证VPC支持IPv6
     *
     * @param ipv6On
     */
    public CacheInstanceSpec ipv6On(Integer ipv6On) {
        this.ipv6On = ipv6On;
        return this;
    }

    /**
     * set 分片数，只对自定义分片规格实例有效，主从版固定为1，集群版大于1。每种分片规格支持的分片数可调用describeSpecConfig接口获取
     *
     * @param shardNumber
     */
    public CacheInstanceSpec shardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }


}