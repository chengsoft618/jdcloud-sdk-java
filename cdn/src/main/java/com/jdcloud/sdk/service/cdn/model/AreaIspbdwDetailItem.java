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

package com.jdcloud.sdk.service.cdn.model;


/**
 * areaIspbdwDetailItem
 */
public class AreaIspbdwDetailItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * area
     */
    private String area;

    /**
     * isp
     */
    private String isp;

    /**
     * flowPercent
     */
    private String flowPercent;

    /**
     * pvPercent
     */
    private String pvPercent;

    /**
     * avgbandwidth
     */
    private Double avgbandwidth;

    /**
     * flow
     */
    private Double flow;

    /**
     * pv
     */
    private Long pv;

    /**
     * topTimeStamp
     */
    private Long topTimeStamp;


    /**
     * get area
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * set area
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * get isp
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * set isp
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * get flowPercent
     *
     * @return
     */
    public String getFlowPercent() {
        return flowPercent;
    }

    /**
     * set flowPercent
     *
     * @param flowPercent
     */
    public void setFlowPercent(String flowPercent) {
        this.flowPercent = flowPercent;
    }

    /**
     * get pvPercent
     *
     * @return
     */
    public String getPvPercent() {
        return pvPercent;
    }

    /**
     * set pvPercent
     *
     * @param pvPercent
     */
    public void setPvPercent(String pvPercent) {
        this.pvPercent = pvPercent;
    }

    /**
     * get avgbandwidth
     *
     * @return
     */
    public Double getAvgbandwidth() {
        return avgbandwidth;
    }

    /**
     * set avgbandwidth
     *
     * @param avgbandwidth
     */
    public void setAvgbandwidth(Double avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
    }

    /**
     * get flow
     *
     * @return
     */
    public Double getFlow() {
        return flow;
    }

    /**
     * set flow
     *
     * @param flow
     */
    public void setFlow(Double flow) {
        this.flow = flow;
    }

    /**
     * get pv
     *
     * @return
     */
    public Long getPv() {
        return pv;
    }

    /**
     * set pv
     *
     * @param pv
     */
    public void setPv(Long pv) {
        this.pv = pv;
    }

    /**
     * get topTimeStamp
     *
     * @return
     */
    public Long getTopTimeStamp() {
        return topTimeStamp;
    }

    /**
     * set topTimeStamp
     *
     * @param topTimeStamp
     */
    public void setTopTimeStamp(Long topTimeStamp) {
        this.topTimeStamp = topTimeStamp;
    }


    /**
     * set area
     *
     * @param area
     */
    public AreaIspbdwDetailItem area(String area) {
        this.area = area;
        return this;
    }

    /**
     * set isp
     *
     * @param isp
     */
    public AreaIspbdwDetailItem isp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * set flowPercent
     *
     * @param flowPercent
     */
    public AreaIspbdwDetailItem flowPercent(String flowPercent) {
        this.flowPercent = flowPercent;
        return this;
    }

    /**
     * set pvPercent
     *
     * @param pvPercent
     */
    public AreaIspbdwDetailItem pvPercent(String pvPercent) {
        this.pvPercent = pvPercent;
        return this;
    }

    /**
     * set avgbandwidth
     *
     * @param avgbandwidth
     */
    public AreaIspbdwDetailItem avgbandwidth(Double avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
        return this;
    }

    /**
     * set flow
     *
     * @param flow
     */
    public AreaIspbdwDetailItem flow(Double flow) {
        this.flow = flow;
        return this;
    }

    /**
     * set pv
     *
     * @param pv
     */
    public AreaIspbdwDetailItem pv(Long pv) {
        this.pv = pv;
        return this;
    }

    /**
     * set topTimeStamp
     *
     * @param topTimeStamp
     */
    public AreaIspbdwDetailItem topTimeStamp(Long topTimeStamp) {
        this.topTimeStamp = topTimeStamp;
        return this;
    }


}