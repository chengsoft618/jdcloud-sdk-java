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
 * 云主机
 * 云主机实例、镜像、实例规格、实例模板、配额相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.vm.model.DescribeImageMembersRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImageMembersResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImageMembersExecutor;
import com.jdcloud.sdk.service.vm.model.CreateInstancesRequest;
import com.jdcloud.sdk.service.vm.model.CreateInstancesResponse;
import com.jdcloud.sdk.service.vm.client.CreateInstancesExecutor;
import com.jdcloud.sdk.service.vm.model.ShareImageRequest;
import com.jdcloud.sdk.service.vm.model.ShareImageResponse;
import com.jdcloud.sdk.service.vm.client.ShareImageExecutor;
import com.jdcloud.sdk.service.vm.model.ExportImageRequest;
import com.jdcloud.sdk.service.vm.model.ExportImageResponse;
import com.jdcloud.sdk.service.vm.client.ExportImageExecutor;
import com.jdcloud.sdk.service.vm.model.StartInstanceRequest;
import com.jdcloud.sdk.service.vm.model.StartInstanceResponse;
import com.jdcloud.sdk.service.vm.client.StartInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.UnReleaseImageRequest;
import com.jdcloud.sdk.service.vm.model.UnReleaseImageResponse;
import com.jdcloud.sdk.service.vm.client.UnReleaseImageExecutor;
import com.jdcloud.sdk.service.vm.model.UnShareImageRequest;
import com.jdcloud.sdk.service.vm.model.UnShareImageResponse;
import com.jdcloud.sdk.service.vm.client.UnShareImageExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeImageConstraintsBatchRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImageConstraintsBatchResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImageConstraintsBatchExecutor;
import com.jdcloud.sdk.service.vm.model.UpdateInstanceTemplateRequest;
import com.jdcloud.sdk.service.vm.model.UpdateInstanceTemplateResponse;
import com.jdcloud.sdk.service.vm.client.UpdateInstanceTemplateExecutor;
import com.jdcloud.sdk.service.vm.model.AttachDiskRequest;
import com.jdcloud.sdk.service.vm.model.AttachDiskResponse;
import com.jdcloud.sdk.service.vm.client.AttachDiskExecutor;
import com.jdcloud.sdk.service.vm.model.ModifyInstancePasswordRequest;
import com.jdcloud.sdk.service.vm.model.ModifyInstancePasswordResponse;
import com.jdcloud.sdk.service.vm.client.ModifyInstancePasswordExecutor;
import com.jdcloud.sdk.service.vm.model.AttachNetworkInterfaceRequest;
import com.jdcloud.sdk.service.vm.model.AttachNetworkInterfaceResponse;
import com.jdcloud.sdk.service.vm.client.AttachNetworkInterfaceExecutor;
import com.jdcloud.sdk.service.vm.model.DeleteKeypairRequest;
import com.jdcloud.sdk.service.vm.model.DeleteKeypairResponse;
import com.jdcloud.sdk.service.vm.client.DeleteKeypairExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeImageRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImageResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImageExecutor;
import com.jdcloud.sdk.service.vm.model.ImportKeypairRequest;
import com.jdcloud.sdk.service.vm.model.ImportKeypairResponse;
import com.jdcloud.sdk.service.vm.client.ImportKeypairExecutor;
import com.jdcloud.sdk.service.vm.model.CopyImagesRequest;
import com.jdcloud.sdk.service.vm.model.CopyImagesResponse;
import com.jdcloud.sdk.service.vm.client.CopyImagesExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.ModifyInstanceNetworkAttributeRequest;
import com.jdcloud.sdk.service.vm.model.ModifyInstanceNetworkAttributeResponse;
import com.jdcloud.sdk.service.vm.client.ModifyInstanceNetworkAttributeExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeQuotasRequest;
import com.jdcloud.sdk.service.vm.model.DescribeQuotasResponse;
import com.jdcloud.sdk.service.vm.client.DescribeQuotasExecutor;
import com.jdcloud.sdk.service.vm.model.ModifyImageAttributeRequest;
import com.jdcloud.sdk.service.vm.model.ModifyImageAttributeResponse;
import com.jdcloud.sdk.service.vm.client.ModifyImageAttributeExecutor;
import com.jdcloud.sdk.service.vm.model.RebootInstanceRequest;
import com.jdcloud.sdk.service.vm.model.RebootInstanceResponse;
import com.jdcloud.sdk.service.vm.client.RebootInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeKeypairsRequest;
import com.jdcloud.sdk.service.vm.model.DescribeKeypairsResponse;
import com.jdcloud.sdk.service.vm.client.DescribeKeypairsExecutor;
import com.jdcloud.sdk.service.vm.model.DetachDiskRequest;
import com.jdcloud.sdk.service.vm.model.DetachDiskResponse;
import com.jdcloud.sdk.service.vm.client.DetachDiskExecutor;
import com.jdcloud.sdk.service.vm.model.ImportImageRequest;
import com.jdcloud.sdk.service.vm.model.ImportImageResponse;
import com.jdcloud.sdk.service.vm.client.ImportImageExecutor;
import com.jdcloud.sdk.service.vm.model.CreateInstanceTemplateRequest;
import com.jdcloud.sdk.service.vm.model.CreateInstanceTemplateResponse;
import com.jdcloud.sdk.service.vm.client.CreateInstanceTemplateExecutor;
import com.jdcloud.sdk.service.vm.model.CreateImageRequest;
import com.jdcloud.sdk.service.vm.model.CreateImageResponse;
import com.jdcloud.sdk.service.vm.client.CreateImageExecutor;
import com.jdcloud.sdk.service.vm.model.AssociateElasticIpRequest;
import com.jdcloud.sdk.service.vm.model.AssociateElasticIpResponse;
import com.jdcloud.sdk.service.vm.client.AssociateElasticIpExecutor;
import com.jdcloud.sdk.service.vm.model.DisassociateElasticIpRequest;
import com.jdcloud.sdk.service.vm.model.DisassociateElasticIpResponse;
import com.jdcloud.sdk.service.vm.client.DisassociateElasticIpExecutor;
import com.jdcloud.sdk.service.vm.model.StopInstanceRequest;
import com.jdcloud.sdk.service.vm.model.StopInstanceResponse;
import com.jdcloud.sdk.service.vm.client.StopInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTemplateRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTemplateResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceTemplateExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeImagesRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImagesResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImagesExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeImageConstraintsRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImageConstraintsResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImageConstraintsExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceVncUrlRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceVncUrlResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceVncUrlExecutor;
import com.jdcloud.sdk.service.vm.model.RebuildInstanceRequest;
import com.jdcloud.sdk.service.vm.model.RebuildInstanceResponse;
import com.jdcloud.sdk.service.vm.client.RebuildInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.ReleaseImageRequest;
import com.jdcloud.sdk.service.vm.model.ReleaseImageResponse;
import com.jdcloud.sdk.service.vm.client.ReleaseImageExecutor;
import com.jdcloud.sdk.service.vm.model.ModifyInstanceAttributeRequest;
import com.jdcloud.sdk.service.vm.model.ModifyInstanceAttributeResponse;
import com.jdcloud.sdk.service.vm.client.ModifyInstanceAttributeExecutor;
import com.jdcloud.sdk.service.vm.model.ResizeInstanceRequest;
import com.jdcloud.sdk.service.vm.model.ResizeInstanceResponse;
import com.jdcloud.sdk.service.vm.client.ResizeInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.DeleteImageRequest;
import com.jdcloud.sdk.service.vm.model.DeleteImageResponse;
import com.jdcloud.sdk.service.vm.client.DeleteImageExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTypesRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTypesResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceTypesExecutor;
import com.jdcloud.sdk.service.vm.model.DetachNetworkInterfaceRequest;
import com.jdcloud.sdk.service.vm.model.DetachNetworkInterfaceResponse;
import com.jdcloud.sdk.service.vm.client.DetachNetworkInterfaceExecutor;
import com.jdcloud.sdk.service.vm.model.DeleteInstanceTemplateRequest;
import com.jdcloud.sdk.service.vm.model.DeleteInstanceTemplateResponse;
import com.jdcloud.sdk.service.vm.client.DeleteInstanceTemplateExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTemplatesRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTemplatesResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceTemplatesExecutor;
import com.jdcloud.sdk.service.vm.model.ModifyInstanceDiskAttributeRequest;
import com.jdcloud.sdk.service.vm.model.ModifyInstanceDiskAttributeResponse;
import com.jdcloud.sdk.service.vm.client.ModifyInstanceDiskAttributeExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstancePrivateIpAddressRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstancePrivateIpAddressResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstancePrivateIpAddressExecutor;
import com.jdcloud.sdk.service.vm.model.ImageTasksRequest;
import com.jdcloud.sdk.service.vm.model.ImageTasksResponse;
import com.jdcloud.sdk.service.vm.client.ImageTasksExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceStatusRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceStatusResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceStatusExecutor;
import com.jdcloud.sdk.service.vm.model.DeleteInstanceRequest;
import com.jdcloud.sdk.service.vm.model.DeleteInstanceResponse;
import com.jdcloud.sdk.service.vm.client.DeleteInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeBriefInstancesRequest;
import com.jdcloud.sdk.service.vm.model.DescribeBriefInstancesResponse;
import com.jdcloud.sdk.service.vm.client.DescribeBriefInstancesExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstancesRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstancesResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstancesExecutor;
import com.jdcloud.sdk.service.vm.model.CreateKeypairRequest;
import com.jdcloud.sdk.service.vm.model.CreateKeypairResponse;
import com.jdcloud.sdk.service.vm.client.CreateKeypairExecutor;
import com.jdcloud.sdk.service.vm.model.VerifyInstanceTemplateRequest;
import com.jdcloud.sdk.service.vm.model.VerifyInstanceTemplateResponse;
import com.jdcloud.sdk.service.vm.client.VerifyInstanceTemplateExecutor;

/**
 * vmClient
 */
public class VmClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.1";
    public final static String DefaultEndpoint = "vm.jdcloud-api.com";
    public final static String ServiceName = "vm";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private VmClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询镜像共享帐户列表，只允许操作您的个人私有镜像。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImageMembersResponse describeImageMembers(DescribeImageMembersRequest request) throws JdcloudSdkException {
        return new DescribeImageMembersExecutor().client(this).execute(request);
    }

    /**
     * 创建一台或多台指定配置的云主机，创建模式分为三种：1.普通方式、2.使用高可用组、3.使用启动模板。三种方式创建云主机时参数的必传与非必传是不同的，具体请参考&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/create_vm_sample&quot;&gt;参数详细说明&lt;/a&gt;&lt;br&gt;
- 创建云主机需要通过实名认证
- 实例规格
    - 可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
    - 不能使用已下线、或已售馨的规格ID
- 镜像
    - Windows Server所有镜像CPU不可选超过64核CPU。
    - 可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimages&quot;&gt;DescribeImages&lt;/a&gt;接口获得指定地域的镜像信息。
    - 选择的镜像必须支持选择的实例规格。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints&quot;&gt;DescribeImageConstraints&lt;/a&gt;接口获得指定镜像的实例规格限制信息。&lt;br&gt;
- 网络配置
    - 指定主网卡配置信息
        - 必须指定subnetId
        - 可以指定elasticIp规格来约束创建的弹性IP，带宽取值范围[1-200]Mbps，步进1Mbps
        - 可以指定主网卡的内网主IP(primaryIpAddress)，此时maxCount只能为1
        - 安全组securityGroup需与子网Subnet在同一个私有网络VPC内
        - 一台云主机创建时必须至少指定一个安全组，至多指定5个安全组，如果没有指定安全组，默认使用默认安全组
        - 主网卡deviceIndex设置为1
- 存储
    - 系统盘
        - 磁盘分类，系统盘支持local或cloud
        - 磁盘大小
            - local：不能指定大小，默认为40GB
            - cloud：取值范围: 40-500GB，并且不能小于镜像的最小系统盘大小，如果没有指定，默认以镜像中的系统盘大小为准
        - 自动删除
            - 如果是local类型，默认自动删除，不可修改
            - 如果是cloud类型的按配置计费的云硬盘，默认为True，可修改
            - 如果是cloud类型的包年包月的云硬盘，默认为False，不可修改
    - 数据盘
        - 磁盘分类，数据盘仅支持cloud
        - 云硬盘类型可以选择ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1
        - 磁盘大小
            - premium-hdd：范围[20,3000]GB，步长为10G
            - ssd：范围[20,1000]GB，步长为10G
            - hdd.std1、ssd.gp1、ssd.io1: 范围[20-16000]GB，步长为10GB
        - 自动删除
            - 默认自动删除，如果是包年包月的云硬盘，此参数不生效
        - 可以从快照创建磁盘
    - iops
        - 仅当云盘类型为ssd.io1时，可指定iops值，范围为【200， min（32000，size * 50 ）】，步长为10，若不指定则按此公式计算默认值
    - local类型系统的云主机可以挂载8块云硬盘
    - cloud类型系统的云主机可以挂载7块云硬盘
- 计费
    - 弹性IP的计费模式，如果选择按用量类型可以单独设置，其它计费模式都以主机为准
    - 云硬盘的计费模式以主机为准
- 其他
    - 创建完成后，主机状态为running
    - 仅Linux系统云主机可以指定密钥
    - maxCount为最大努力，不保证一定能达到maxCount
    - 虚机的az会覆盖磁盘的az属性
- 密码
    - &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstancesResponse createInstances(CreateInstancesRequest request) throws JdcloudSdkException {
        return new CreateInstancesExecutor().client(this).execute(request);
    }

    /**
     * 共享镜像，只允许操作您的个人私有镜像，单个镜像最多可共享给20个京东云帐户。&lt;br&gt;
整机镜像目前不支持共享。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ShareImageResponse shareImage(ShareImageRequest request) throws JdcloudSdkException {
        return new ShareImageExecutor().client(this).execute(request);
    }

    /**
     * 导出镜像，将京东云私有镜像导出至京东云以外环境

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExportImageResponse exportImage(ExportImageRequest request) throws JdcloudSdkException {
        return new ExportImageExecutor().client(this).execute(request);
    }

    /**
     * 启动单个云主机，只能启动&lt;b&gt;stopped&lt;/b&gt;状态的云主机，云主机没有正在进行中的任务才可启动。&lt;br&gt;
只能启动正常计费状态的云主机，若已欠费停服或到期停服则不支持启动。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws JdcloudSdkException {
        return new StartInstanceExecutor().client(this).execute(request);
    }

    /**
     * 撤销社区镜像，只允许操作您的个人私有镜像。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UnReleaseImageResponse unReleaseImage(UnReleaseImageRequest request) throws JdcloudSdkException {
        return new UnReleaseImageExecutor().client(this).execute(request);
    }

    /**
     * 取消共享镜像，只允许操作您的个人私有镜像。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UnShareImageResponse unShareImage(UnShareImageRequest request) throws JdcloudSdkException {
        return new UnShareImageExecutor().client(this).execute(request);
    }

    /**
     * 批量查询镜像的实例规格限制。&lt;br&gt;
通过此接口可以查看镜像不支持的实例规格。只有官方镜像、第三方镜像有实例规格的限制，个人的私有镜像没有此限制。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImageConstraintsBatchResponse describeImageConstraintsBatch(DescribeImageConstraintsBatchRequest request) throws JdcloudSdkException {
        return new DescribeImageConstraintsBatchExecutor().client(this).execute(request);
    }

    /**
     * 修改一个启动模板的信息，包括名称、描述

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateInstanceTemplateResponse updateInstanceTemplate(UpdateInstanceTemplateRequest request) throws JdcloudSdkException {
        return new UpdateInstanceTemplateExecutor().client(this).execute(request);
    }

    /**
     * 为一台云主机挂载一块云硬盘，云主机和云硬盘没有正在进行中的的任务时才可挂载。&lt;br&gt;
云主机状态必须是&lt;b&gt;running&lt;/b&gt;或&lt;b&gt;stopped&lt;/b&gt;状态。&lt;br&gt;
本地盘(local类型)做系统盘的云主机可挂载8块云硬盘，云硬盘(cloud类型)做系统盘的云主机可挂载除系统盘外7块云硬盘。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws JdcloudSdkException {
        return new AttachDiskExecutor().client(this).execute(request);
    }

    /**
     * 修改云主机密码，主机没有正在进行中的任务时才可操作。&lt;br&gt;
修改密码后，需要重启云主机后生效。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstancePasswordResponse modifyInstancePassword(ModifyInstancePasswordRequest request) throws JdcloudSdkException {
        return new ModifyInstancePasswordExecutor().client(this).execute(request);
    }

    /**
     * 云主机绑定一块弹性网卡。&lt;br&gt;
云主机状态必须为&lt;b&gt;running&lt;/b&gt;或&lt;b&gt;stopped&lt;/b&gt;状态，并且没有正在进行中的任务才可操作。&lt;br&gt;
弹性网卡上如果绑定了弹性公网IP，那么其所在az需要与云主机的az保持一致，或者为全可用区型弹性公网IP，才可挂载该网卡。&lt;br&gt;
云主机挂载弹性网卡的数量，不能超过实例规格的限制。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定规格可挂载弹性网卡的数量上限。&lt;br&gt;
弹性网卡与云主机必须在相同vpc下。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AttachNetworkInterfaceResponse attachNetworkInterface(AttachNetworkInterfaceRequest request) throws JdcloudSdkException {
        return new AttachNetworkInterfaceExecutor().client(this).execute(request);
    }

    /**
     * 删除ssh密钥对。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteKeypairResponse deleteKeypair(DeleteKeypairRequest request) throws JdcloudSdkException {
        return new DeleteKeypairExecutor().client(this).execute(request);
    }

    /**
     * 查询镜像详情。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImageResponse describeImage(DescribeImageRequest request) throws JdcloudSdkException {
        return new DescribeImageExecutor().client(this).execute(request);
    }

    /**
     * 导入由其他工具生成的密钥对的公钥部分。&lt;br&gt;
若传入已存在的密钥名称，会返回错误。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ImportKeypairResponse importKeypair(ImportKeypairRequest request) throws JdcloudSdkException {
        return new ImportKeypairExecutor().client(this).execute(request);
    }

    /**
     * 镜像跨区复制，将私有镜像复制到其它地域下，只允许操作您的个人私有镜像。&lt;br&gt;
只支持rootDeviceType为cloudDisk的云硬盘系统盘镜像操作。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CopyImagesResponse copyImages(CopyImagesRequest request) throws JdcloudSdkException {
        return new CopyImagesExecutor().client(this).execute(request);
    }

    /**
     * 查询一台云主机的详细信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws JdcloudSdkException {
        return new DescribeInstanceExecutor().client(this).execute(request);
    }

    /**
     * 修改虚机弹性网卡属性，包括是否随云主机一起删除。&lt;br&gt;
不能修改主网卡。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceNetworkAttributeResponse modifyInstanceNetworkAttribute(ModifyInstanceNetworkAttributeRequest request) throws JdcloudSdkException {
        return new ModifyInstanceNetworkAttributeExecutor().client(this).execute(request);
    }

    /**
     * 查询配额，支持的类型：云主机、镜像、密钥、模板、镜像共享。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotasResponse describeQuotas(DescribeQuotasRequest request) throws JdcloudSdkException {
        return new DescribeQuotasExecutor().client(this).execute(request);
    }

    /**
     * 修改镜像信息，包括名称、描述；只允许操作您的个人私有镜像。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws JdcloudSdkException {
        return new ModifyImageAttributeExecutor().client(this).execute(request);
    }

    /**
     * 重启单个云主机，只能重启&lt;b&gt;running&lt;/b&gt;状态的云主机，云主机没有正在进行中的任务才可重启。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws JdcloudSdkException {
        return new RebootInstanceExecutor().client(this).execute(request);
    }

    /**
     * 批量查询密钥对。&lt;br&gt;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeKeypairsResponse describeKeypairs(DescribeKeypairsRequest request) throws JdcloudSdkException {
        return new DescribeKeypairsExecutor().client(this).execute(request);
    }

    /**
     * 云主机缷载云硬盘，云主机和云硬盘没有正在进行中的任务时才可缷载。&lt;br&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws JdcloudSdkException {
        return new DetachDiskExecutor().client(this).execute(request);
    }

    /**
     * 导入镜像，将外部镜像导入到京东云中

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ImportImageResponse importImage(ImportImageRequest request) throws JdcloudSdkException {
        return new ImportImageExecutor().client(this).execute(request);
    }

    /**
     * 创建一个指定参数的启动模板，启动模板中包含创建云主机时的大部分配置参数，避免每次创建云主机时的重复性工作。&lt;br&gt;
如果是使用启动模板创建云主机，如果指定了某些参数与模板中的参数相冲突，那么新指定的参数会替换模板中的参数。&lt;br&gt;
如果是使用启动模板创建云主机，如果指定了镜像ID与模板中的镜像ID不一致，那么模板中的dataDisks参数会失效。&lt;br&gt;
如果使用高可用组(Ag)创建云主机，那么Ag所关联的模板中的参数都不可以被调整，只能以模板为准。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstanceTemplateResponse createInstanceTemplate(CreateInstanceTemplateRequest request) throws JdcloudSdkException {
        return new CreateInstanceTemplateExecutor().client(this).execute(request);
    }

    /**
     * 为云主机创建私有镜像。云主机状态必须为&lt;b&gt;stopped&lt;/b&gt;。&lt;br&gt;
云主机没有正在进行中的任务才可制作镜像。&lt;br&gt;
制作镜像以备份系统盘为基础，在此之上可选择全部或部分挂载数据盘制作整机镜像（如不做任何更改将默认制作整机镜像），制作镜像过程会为所挂载云硬盘创建快照并与镜像关联。&lt;br&gt;
调用接口后，需要等待镜像状态变为&lt;b&gt;ready&lt;/b&gt;后，才能正常使用镜像。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateImageResponse createImage(CreateImageRequest request) throws JdcloudSdkException {
        return new CreateImageExecutor().client(this).execute(request);
    }

    /**
     * 为云主机主网卡的主内网IP绑定弹性公网IP。&lt;br&gt;
一台云主机的主网卡的主内网IP只能绑定一个弹性公网IP，若已绑定弹性公网IP，操作绑定会返回错误。&lt;br&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateElasticIpResponse associateElasticIp(AssociateElasticIpRequest request) throws JdcloudSdkException {
        return new AssociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 云主机解绑弹性公网IP，解绑的是主网卡、内网主IP对应的弹性公网IP。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateElasticIpResponse disassociateElasticIp(DisassociateElasticIpRequest request) throws JdcloudSdkException {
        return new DisassociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 停止单个云主机，只能停止&lt;b&gt;running&lt;/b&gt;状态的云主机，云主机没有正在进行中的任务才可停止

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws JdcloudSdkException {
        return new StopInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询启动模板详情

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceTemplateResponse describeInstanceTemplate(DescribeInstanceTemplateRequest request) throws JdcloudSdkException {
        return new DescribeInstanceTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询镜像信息列表。&lt;br&gt;
通过此接口可以查询到京东云官方镜像、第三方镜像、私有镜像、或其他用户共享给您的镜像。&lt;br&gt;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws JdcloudSdkException {
        return new DescribeImagesExecutor().client(this).execute(request);
    }

    /**
     * 查询镜像的实例规格限制。&lt;br&gt;
通过此接口可以查看镜像不支持的实例规格。只有官方镜像、第三方镜像有实例规格的限制，个人的私有镜像没有此限制。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImageConstraintsResponse describeImageConstraints(DescribeImageConstraintsRequest request) throws JdcloudSdkException {
        return new DescribeImageConstraintsExecutor().client(this).execute(request);
    }

    /**
     * 获取云主机vnc，用于连接管理云主机。&lt;br&gt;
vnc地址的有效期为1个小时，调用接口获取vnc地址后如果1个小时内没有使用，vnc地址自动失效，再次使用需要重新获取。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws JdcloudSdkException {
        return new DescribeInstanceVncUrlExecutor().client(this).execute(request);
    }

    /**
     * 云主机使用指定镜像重置云主机系统&lt;br&gt;
云主机的状态必须为&lt;b&gt;stopped&lt;/b&gt;状态。&lt;br&gt;
若不指定镜像ID，默认使用当前主机的原镜像重置系统。&lt;br&gt;
云主机系统盘类型必须与待更换镜像支持的系统盘类型保持一致，若当前云主机系统盘为local类型，则更换镜像的系统盘类型必须为loaclDisk类型；同理，若当前云主机系统盘为cloud类型，则更换镜像的系统盘类型必须为cloudDisk类型。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimages&quot;&gt;DescribeImages&lt;/a&gt;接口获得指定地域的镜像信息。&lt;br&gt;
指定的镜像必须能够支持当前主机的实例规格(instanceType)，否则会返回错误。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints&quot;&gt;DescribeImageConstraints&lt;/a&gt;接口获得指定镜像支持的系统盘类型信息。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RebuildInstanceResponse rebuildInstance(RebuildInstanceRequest request) throws JdcloudSdkException {
        return new RebuildInstanceExecutor().client(this).execute(request);
    }

    /**
     * 发布社区镜像，只允许操作您的个人私有镜像。发布为社区镜像后会撤销共享关系。&lt;br&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ReleaseImageResponse releaseImage(ReleaseImageRequest request) throws JdcloudSdkException {
        return new ReleaseImageExecutor().client(this).execute(request);
    }

    /**
     * 修改云主机部分信息，包括名称、描述。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws JdcloudSdkException {
        return new ModifyInstanceAttributeExecutor().client(this).execute(request);
    }

    /**
     * 云主机变更实例规格&lt;br&gt;
云主机的状态必须为&lt;b&gt;stopped&lt;/b&gt;状态。&lt;br&gt;
以下情况的云主机，不允许在一代与二代实例规格间互相调整，例：不允许g.n1与g.n2之间互相调配&lt;br&gt;
1、16年创建的云硬盘做系统盘的云主机&lt;br&gt;
2、本地盘(local类型)做系统盘的云主机。&lt;br&gt;
3、使用高可用组(Ag)创建的云主机。&lt;br&gt;
如果当前主机中的弹性网卡数量，大于新实例规格允许的弹性网卡数量，会返回错误。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域及可用区下的实例规格信息。&lt;br&gt;
当前主机所使用的镜像，需要支持要变更的目标实例规格，否则返回错误。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints&quot;&gt;DescribeImageConstraints&lt;/a&gt;接口获得指定镜像的实例规格限制信息。&lt;br&gt;
云主机欠费或到期时，无法更改实例规格。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) throws JdcloudSdkException {
        return new ResizeInstanceExecutor().client(this).execute(request);
    }

    /**
     * 删除一个私有镜像，只允许操作您的个人私有镜像。&lt;br&gt;
若镜像已共享给其他用户，需先取消共享才可删除。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws JdcloudSdkException {
        return new DeleteImageExecutor().client(this).execute(request);
    }

    /**
     * 查询实例规格信息列表

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws JdcloudSdkException {
        return new DescribeInstanceTypesExecutor().client(this).execute(request);
    }

    /**
     * 云主机缷载一块弹性网卡。&lt;br&gt;
云主机状态必须为&lt;b&gt;running&lt;/b&gt;或&lt;b&gt;stopped&lt;/b&gt;状态，并且没有正在进行中的任务才可操作。&lt;br&gt;
不能缷载主网卡。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DetachNetworkInterfaceResponse detachNetworkInterface(DetachNetworkInterfaceRequest request) throws JdcloudSdkException {
        return new DetachNetworkInterfaceExecutor().client(this).execute(request);
    }

    /**
     * 删除一个启动模板

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteInstanceTemplateResponse deleteInstanceTemplate(DeleteInstanceTemplateRequest request) throws JdcloudSdkException {
        return new DeleteInstanceTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询启动模板列表

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceTemplatesResponse describeInstanceTemplates(DescribeInstanceTemplatesRequest request) throws JdcloudSdkException {
        return new DescribeInstanceTemplatesExecutor().client(this).execute(request);
    }

    /**
     * 修改云主机挂载的数据盘属性，包括是否随主机删除。&lt;br&gt;
仅按配置计费云硬盘支持设置随实例删除属性;包年包月计费云硬盘该属性不生效,实例删除时云硬盘将保留。&lt;br&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceDiskAttributeResponse modifyInstanceDiskAttribute(ModifyInstanceDiskAttributeRequest request) throws JdcloudSdkException {
        return new ModifyInstanceDiskAttributeExecutor().client(this).execute(request);
    }

    /**
     * 批量查询云主机内网IP地址，查询的是主网卡内网主IP地址。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstancePrivateIpAddressResponse describeInstancePrivateIpAddress(DescribeInstancePrivateIpAddressRequest request) throws JdcloudSdkException {
        return new DescribeInstancePrivateIpAddressExecutor().client(this).execute(request);
    }

    /**
     * 查询镜像导入导出任务详情

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ImageTasksResponse imageTasks(ImageTasksRequest request) throws JdcloudSdkException {
        return new ImageTasksExecutor().client(this).execute(request);
    }

    /**
     * 批量查询云主机状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceStatusResponse describeInstanceStatus(DescribeInstanceStatusRequest request) throws JdcloudSdkException {
        return new DescribeInstanceStatusExecutor().client(this).execute(request);
    }

    /**
     * 删除按配置计费、或包年包月已到期的单个云主机。不能删除没有计费信息的云主机。&lt;br&gt;
云主机状态必须为运行&lt;b&gt;running&lt;/b&gt;、停止&lt;b&gt;stopped&lt;/b&gt;、错误&lt;b&gt;error&lt;/b&gt;，同时云主机没有正在进行中的任务才可删除。&lt;br&gt;
如果主机中挂载的数据盘为按配置计费的云硬盘且AutoDelete属性为true，那么数据盘会随主机一起删除。
 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws JdcloudSdkException {
        return new DeleteInstanceExecutor().client(this).execute(request);
    }

    /**
     * 批量查询云主机信息的轻量接口，不返回云盘、网络、计费、标签等信息。如果不需要关联资源属性，尽量选择使用该接口。&lt;br&gt;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBriefInstancesResponse describeBriefInstances(DescribeBriefInstancesRequest request) throws JdcloudSdkException {
        return new DescribeBriefInstancesExecutor().client(this).execute(request);
    }

    /**
     * 批量查询云主机的详细信息&lt;br&gt;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws JdcloudSdkException {
        return new DescribeInstancesExecutor().client(this).execute(request);
    }

    /**
     * 创建ssh密钥对。公钥部分存储在京东云，并返回未加密的 PEM 编码的 PKCS#8 格式私钥，您只有一次机会保存您的私钥。请妥善保管。&lt;br&gt;
若传入已存在的密钥名称，会返回错误。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateKeypairResponse createKeypair(CreateKeypairRequest request) throws JdcloudSdkException {
        return new CreateKeypairExecutor().client(this).execute(request);
    }

    /**
     * 校验启动模板的有效性

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public VerifyInstanceTemplateResponse verifyInstanceTemplate(VerifyInstanceTemplateRequest request) throws JdcloudSdkException {
        return new VerifyInstanceTemplateExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public VmClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private VmClient vmClient;

        public DefaultBuilder() {
            vmClient = new VmClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            vmClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            vmClient.httpRequestConfig = config;
            return this;
        }

        public VmClient build() throws JdcloudSdkException {

            if (vmClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                vmClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (vmClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("VmClient build error: jdcloud credentials provider not set");
                }
            }
            if (vmClient.httpRequestConfig == null) {
                vmClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (vmClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("VmClient build error: http request config not set");
                }
            }
            return vmClient;
        }

        public Builder environment(Environment environment) {
            vmClient.environment = environment;
            return this;
        }
    }
}
