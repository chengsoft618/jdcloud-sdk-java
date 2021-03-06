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
 * JCLOUD IoT Edge API
 * API related to IoT Edge
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotedge.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.iotedge.model.DelSubDeviceWithCoreRequest;
import com.jdcloud.sdk.service.iotedge.model.DelSubDeviceWithCoreResponse;
import com.jdcloud.sdk.service.iotedge.client.DelSubDeviceWithCoreExecutor;
import com.jdcloud.sdk.service.iotedge.model.UnInstallAppRequest;
import com.jdcloud.sdk.service.iotedge.model.UnInstallAppResponse;
import com.jdcloud.sdk.service.iotedge.client.UnInstallAppExecutor;
import com.jdcloud.sdk.service.iotedge.model.DescribeDeployAppRequest;
import com.jdcloud.sdk.service.iotedge.model.DescribeDeployAppResponse;
import com.jdcloud.sdk.service.iotedge.client.DescribeDeployAppExecutor;
import com.jdcloud.sdk.service.iotedge.model.DeleteEdgeWithCoreRequest;
import com.jdcloud.sdk.service.iotedge.model.DeleteEdgeWithCoreResponse;
import com.jdcloud.sdk.service.iotedge.client.DeleteEdgeWithCoreExecutor;
import com.jdcloud.sdk.service.iotedge.model.DescribeDeployDetailsRequest;
import com.jdcloud.sdk.service.iotedge.model.DescribeDeployDetailsResponse;
import com.jdcloud.sdk.service.iotedge.client.DescribeDeployDetailsExecutor;
import com.jdcloud.sdk.service.iotedge.model.SetAppStatusRequest;
import com.jdcloud.sdk.service.iotedge.model.SetAppStatusResponse;
import com.jdcloud.sdk.service.iotedge.client.SetAppStatusExecutor;
import com.jdcloud.sdk.service.iotedge.model.DescribeConfigRequest;
import com.jdcloud.sdk.service.iotedge.model.DescribeConfigResponse;
import com.jdcloud.sdk.service.iotedge.client.DescribeConfigExecutor;
import com.jdcloud.sdk.service.iotedge.model.AddSubDeviceWithCoreRequest;
import com.jdcloud.sdk.service.iotedge.model.AddSubDeviceWithCoreResponse;
import com.jdcloud.sdk.service.iotedge.client.AddSubDeviceWithCoreExecutor;
import com.jdcloud.sdk.service.iotedge.model.DeployAppRequest;
import com.jdcloud.sdk.service.iotedge.model.DeployAppResponse;
import com.jdcloud.sdk.service.iotedge.client.DeployAppExecutor;
import com.jdcloud.sdk.service.iotedge.model.AddEdgeWithCoreRequest;
import com.jdcloud.sdk.service.iotedge.model.AddEdgeWithCoreResponse;
import com.jdcloud.sdk.service.iotedge.client.AddEdgeWithCoreExecutor;

/**
 * iotedgeClient
 */
public class IotedgeClient extends JdcloudClient {

    public final static String ApiVersion = "v2";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.0";
    public final static String DefaultEndpoint = "console-be.iotedge.jdcloud.com";
    public final static String ServiceName = "iotedge";
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

    private IotedgeClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 删除子设备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DelSubDeviceWithCoreResponse delSubDeviceWithCore(DelSubDeviceWithCoreRequest request) throws JdcloudSdkException {
        return new DelSubDeviceWithCoreExecutor().client(this).execute(request);
    }

    /**
     * 卸载安装的APP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UnInstallAppResponse unInstallApp(UnInstallAppRequest request) throws JdcloudSdkException {
        return new UnInstallAppExecutor().client(this).execute(request);
    }

    /**
     * 查询已经部署的App应用
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeployAppResponse describeDeployApp(DescribeDeployAppRequest request) throws JdcloudSdkException {
        return new DescribeDeployAppExecutor().client(this).execute(request);
    }

    /**
     * 删除Edge接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteEdgeWithCoreResponse deleteEdgeWithCore(DeleteEdgeWithCoreRequest request) throws JdcloudSdkException {
        return new DeleteEdgeWithCoreExecutor().client(this).execute(request);
    }

    /**
     * 查询APP部署列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeployDetailsResponse describeDeployDetails(DescribeDeployDetailsRequest request) throws JdcloudSdkException {
        return new DescribeDeployDetailsExecutor().client(this).execute(request);
    }

    /**
     * APP启动/停止服务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetAppStatusResponse setAppStatus(SetAppStatusRequest request) throws JdcloudSdkException {
        return new SetAppStatusExecutor().client(this).execute(request);
    }

    /**
     * 部署内容查询
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeConfigResponse describeConfig(DescribeConfigRequest request) throws JdcloudSdkException {
        return new DescribeConfigExecutor().client(this).execute(request);
    }

    /**
     * 添加子设备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddSubDeviceWithCoreResponse addSubDeviceWithCore(AddSubDeviceWithCoreRequest request) throws JdcloudSdkException {
        return new AddSubDeviceWithCoreExecutor().client(this).execute(request);
    }

    /**
     * 部署APP应用
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeployAppResponse deployApp(DeployAppRequest request) throws JdcloudSdkException {
        return new DeployAppExecutor().client(this).execute(request);
    }

    /**
     * 添加Edge设备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddEdgeWithCoreResponse addEdgeWithCore(AddEdgeWithCoreRequest request) throws JdcloudSdkException {
        return new AddEdgeWithCoreExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public IotedgeClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private IotedgeClient iotedgeClient;

        public DefaultBuilder() {
            iotedgeClient = new IotedgeClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            iotedgeClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            iotedgeClient.httpRequestConfig = config;
            return this;
        }

        public IotedgeClient build() throws JdcloudSdkException {

            if (iotedgeClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                iotedgeClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (iotedgeClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("IotedgeClient build error: jdcloud credentials provider not set");
                }
            }
            if (iotedgeClient.httpRequestConfig == null) {
                iotedgeClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (iotedgeClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("IotedgeClient build error: http request config not set");
                }
            }
            return iotedgeClient;
        }

        public Builder environment(Environment environment) {
            iotedgeClient.environment = environment;
            return this;
        }
    }
}
