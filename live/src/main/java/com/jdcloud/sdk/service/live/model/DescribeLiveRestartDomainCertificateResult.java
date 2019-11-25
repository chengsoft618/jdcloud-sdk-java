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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询直播回看播放证书
 */
public class DescribeLiveRestartDomainCertificateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 直播回看域名
     */
    private String restartDomain;

    /**
     * 直播回看播放证书状态
  on: 开启
  off: 关闭

     */
    private String certStatus;

    /**
     * 直播回看证书
     */
    private String cert;

    /**
     * 直播回看证书别名
     */
    private String title;


    /**
     * get 直播回看域名
     *
     * @return
     */
    public String getRestartDomain() {
        return restartDomain;
    }

    /**
     * set 直播回看域名
     *
     * @param restartDomain
     */
    public void setRestartDomain(String restartDomain) {
        this.restartDomain = restartDomain;
    }

    /**
     * get 直播回看播放证书状态
  on: 开启
  off: 关闭

     *
     * @return
     */
    public String getCertStatus() {
        return certStatus;
    }

    /**
     * set 直播回看播放证书状态
  on: 开启
  off: 关闭

     *
     * @param certStatus
     */
    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus;
    }

    /**
     * get 直播回看证书
     *
     * @return
     */
    public String getCert() {
        return cert;
    }

    /**
     * set 直播回看证书
     *
     * @param cert
     */
    public void setCert(String cert) {
        this.cert = cert;
    }

    /**
     * get 直播回看证书别名
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 直播回看证书别名
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * set 直播回看域名
     *
     * @param restartDomain
     */
    public DescribeLiveRestartDomainCertificateResult restartDomain(String restartDomain) {
        this.restartDomain = restartDomain;
        return this;
    }

    /**
     * set 直播回看播放证书状态
  on: 开启
  off: 关闭

     *
     * @param certStatus
     */
    public DescribeLiveRestartDomainCertificateResult certStatus(String certStatus) {
        this.certStatus = certStatus;
        return this;
    }

    /**
     * set 直播回看证书
     *
     * @param cert
     */
    public DescribeLiveRestartDomainCertificateResult cert(String cert) {
        this.cert = cert;
        return this;
    }

    /**
     * set 直播回看证书别名
     *
     * @param title
     */
    public DescribeLiveRestartDomainCertificateResult title(String title) {
        this.title = title;
        return this;
    }


}