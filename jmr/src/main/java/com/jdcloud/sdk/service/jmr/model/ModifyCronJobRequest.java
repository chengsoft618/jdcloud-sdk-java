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
 * 作业管理
 * JMR作业管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.service.jmr.model.JmrPlanViewModel;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改执行计划
 */
public class ModifyCronJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * jmrPlanViewModel
     */
    private JmrPlanViewModel jmrPlanViewModel;

    /**
     * time
     */
    private String time;

    /**
     * month
     */
    private String month;

    /**
     * week
     */
    private String week;

    /**
     * day
     */
    private String day;

    /**
     * hour
     */
    private String hour;

    /**
     * minute
     */
    private String minute;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get jmrPlanViewModel
     *
     * @return
     */
    public JmrPlanViewModel getJmrPlanViewModel() {
        return jmrPlanViewModel;
    }

    /**
     * set jmrPlanViewModel
     *
     * @param jmrPlanViewModel
     */
    public void setJmrPlanViewModel(JmrPlanViewModel jmrPlanViewModel) {
        this.jmrPlanViewModel = jmrPlanViewModel;
    }

    /**
     * get time
     *
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * set time
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * get month
     *
     * @return
     */
    public String getMonth() {
        return month;
    }

    /**
     * set month
     *
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * get week
     *
     * @return
     */
    public String getWeek() {
        return week;
    }

    /**
     * set week
     *
     * @param week
     */
    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * get day
     *
     * @return
     */
    public String getDay() {
        return day;
    }

    /**
     * set day
     *
     * @param day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * get hour
     *
     * @return
     */
    public String getHour() {
        return hour;
    }

    /**
     * set hour
     *
     * @param hour
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * get minute
     *
     * @return
     */
    public String getMinute() {
        return minute;
    }

    /**
     * set minute
     *
     * @param minute
     */
    public void setMinute(String minute) {
        this.minute = minute;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set jmrPlanViewModel
     *
     * @param jmrPlanViewModel
     */
    public ModifyCronJobRequest jmrPlanViewModel(JmrPlanViewModel jmrPlanViewModel) {
        this.jmrPlanViewModel = jmrPlanViewModel;
        return this;
    }

    /**
     * set time
     *
     * @param time
     */
    public ModifyCronJobRequest time(String time) {
        this.time = time;
        return this;
    }

    /**
     * set month
     *
     * @param month
     */
    public ModifyCronJobRequest month(String month) {
        this.month = month;
        return this;
    }

    /**
     * set week
     *
     * @param week
     */
    public ModifyCronJobRequest week(String week) {
        this.week = week;
        return this;
    }

    /**
     * set day
     *
     * @param day
     */
    public ModifyCronJobRequest day(String day) {
        this.day = day;
        return this;
    }

    /**
     * set hour
     *
     * @param hour
     */
    public ModifyCronJobRequest hour(String hour) {
        this.hour = hour;
        return this;
    }

    /**
     * set minute
     *
     * @param minute
     */
    public ModifyCronJobRequest minute(String minute) {
        this.minute = minute;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ModifyCronJobRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}