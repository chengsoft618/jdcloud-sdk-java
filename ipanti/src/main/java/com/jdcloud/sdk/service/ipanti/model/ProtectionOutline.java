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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * protectionOutline
 */
public class ProtectionOutline  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例数量
     */
    private Integer instancesCount;

    /**
     * 已防护实例数量
     */
    private Integer protectedCount;

    /**
     * 已防护天数
     */
    private Integer protectedDay;

    /**
     * 7 日攻击次数
     */
    private Integer weekAttackCount;

    /**
     * 7 日攻击流量峰值
     */
    private Double weekAttackPeak;

    /**
     * 7 日攻击流量单位
     */
    private String weekAttackUnit;

    /**
     * 30 日攻击次数
     */
    private Integer monthAttackCount;

    /**
     * 30 日攻击流量峰值
     */
    private Double monthAttackPeak;

    /**
     * 30 日攻击流量单位
     */
    private String monthAttackUnit;


    /**
     * get 实例数量
     *
     * @return
     */
    public Integer getInstancesCount() {
        return instancesCount;
    }

    /**
     * set 实例数量
     *
     * @param instancesCount
     */
    public void setInstancesCount(Integer instancesCount) {
        this.instancesCount = instancesCount;
    }

    /**
     * get 已防护实例数量
     *
     * @return
     */
    public Integer getProtectedCount() {
        return protectedCount;
    }

    /**
     * set 已防护实例数量
     *
     * @param protectedCount
     */
    public void setProtectedCount(Integer protectedCount) {
        this.protectedCount = protectedCount;
    }

    /**
     * get 已防护天数
     *
     * @return
     */
    public Integer getProtectedDay() {
        return protectedDay;
    }

    /**
     * set 已防护天数
     *
     * @param protectedDay
     */
    public void setProtectedDay(Integer protectedDay) {
        this.protectedDay = protectedDay;
    }

    /**
     * get 7 日攻击次数
     *
     * @return
     */
    public Integer getWeekAttackCount() {
        return weekAttackCount;
    }

    /**
     * set 7 日攻击次数
     *
     * @param weekAttackCount
     */
    public void setWeekAttackCount(Integer weekAttackCount) {
        this.weekAttackCount = weekAttackCount;
    }

    /**
     * get 7 日攻击流量峰值
     *
     * @return
     */
    public Double getWeekAttackPeak() {
        return weekAttackPeak;
    }

    /**
     * set 7 日攻击流量峰值
     *
     * @param weekAttackPeak
     */
    public void setWeekAttackPeak(Double weekAttackPeak) {
        this.weekAttackPeak = weekAttackPeak;
    }

    /**
     * get 7 日攻击流量单位
     *
     * @return
     */
    public String getWeekAttackUnit() {
        return weekAttackUnit;
    }

    /**
     * set 7 日攻击流量单位
     *
     * @param weekAttackUnit
     */
    public void setWeekAttackUnit(String weekAttackUnit) {
        this.weekAttackUnit = weekAttackUnit;
    }

    /**
     * get 30 日攻击次数
     *
     * @return
     */
    public Integer getMonthAttackCount() {
        return monthAttackCount;
    }

    /**
     * set 30 日攻击次数
     *
     * @param monthAttackCount
     */
    public void setMonthAttackCount(Integer monthAttackCount) {
        this.monthAttackCount = monthAttackCount;
    }

    /**
     * get 30 日攻击流量峰值
     *
     * @return
     */
    public Double getMonthAttackPeak() {
        return monthAttackPeak;
    }

    /**
     * set 30 日攻击流量峰值
     *
     * @param monthAttackPeak
     */
    public void setMonthAttackPeak(Double monthAttackPeak) {
        this.monthAttackPeak = monthAttackPeak;
    }

    /**
     * get 30 日攻击流量单位
     *
     * @return
     */
    public String getMonthAttackUnit() {
        return monthAttackUnit;
    }

    /**
     * set 30 日攻击流量单位
     *
     * @param monthAttackUnit
     */
    public void setMonthAttackUnit(String monthAttackUnit) {
        this.monthAttackUnit = monthAttackUnit;
    }


    /**
     * set 实例数量
     *
     * @param instancesCount
     */
    public ProtectionOutline instancesCount(Integer instancesCount) {
        this.instancesCount = instancesCount;
        return this;
    }

    /**
     * set 已防护实例数量
     *
     * @param protectedCount
     */
    public ProtectionOutline protectedCount(Integer protectedCount) {
        this.protectedCount = protectedCount;
        return this;
    }

    /**
     * set 已防护天数
     *
     * @param protectedDay
     */
    public ProtectionOutline protectedDay(Integer protectedDay) {
        this.protectedDay = protectedDay;
        return this;
    }

    /**
     * set 7 日攻击次数
     *
     * @param weekAttackCount
     */
    public ProtectionOutline weekAttackCount(Integer weekAttackCount) {
        this.weekAttackCount = weekAttackCount;
        return this;
    }

    /**
     * set 7 日攻击流量峰值
     *
     * @param weekAttackPeak
     */
    public ProtectionOutline weekAttackPeak(Double weekAttackPeak) {
        this.weekAttackPeak = weekAttackPeak;
        return this;
    }

    /**
     * set 7 日攻击流量单位
     *
     * @param weekAttackUnit
     */
    public ProtectionOutline weekAttackUnit(String weekAttackUnit) {
        this.weekAttackUnit = weekAttackUnit;
        return this;
    }

    /**
     * set 30 日攻击次数
     *
     * @param monthAttackCount
     */
    public ProtectionOutline monthAttackCount(Integer monthAttackCount) {
        this.monthAttackCount = monthAttackCount;
        return this;
    }

    /**
     * set 30 日攻击流量峰值
     *
     * @param monthAttackPeak
     */
    public ProtectionOutline monthAttackPeak(Double monthAttackPeak) {
        this.monthAttackPeak = monthAttackPeak;
        return this;
    }

    /**
     * set 30 日攻击流量单位
     *
     * @param monthAttackUnit
     */
    public ProtectionOutline monthAttackUnit(String monthAttackUnit) {
        this.monthAttackUnit = monthAttackUnit;
        return this;
    }


}