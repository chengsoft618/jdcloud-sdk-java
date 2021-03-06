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

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 设置CDN域名IP黑名单规则请求
 */
public class SetIPRuleRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IP黑名单规则配置对象
     * Required:true
     */
    @Required
    private IPRuleConfigObject config;

    /**
     * 是否启用该规则
     * Required:true
     */
    @Required
    private Boolean enabled;


    /**
     * get IP黑名单规则配置对象
     *
     * @return
     */
    public IPRuleConfigObject getConfig() {
        return config;
    }

    /**
     * set IP黑名单规则配置对象
     *
     * @param config
     */
    public void setConfig(IPRuleConfigObject config) {
        this.config = config;
    }

    /**
     * get 是否启用该规则
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * set IP黑名单规则配置对象
     *
     * @param config
     */
    public SetIPRuleRequestObject config(IPRuleConfigObject config) {
        this.config = config;
        return this;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public SetIPRuleRequestObject enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }


}