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

import java.util.List;
import java.util.ArrayList;

/**
 * country
 */
public class Country  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 国家或地区名称
     */
    private String label;

    /**
     * 国家或地区编码
     */
    private String value;

    /**
     * children
     */
    private List<Country> children;


    /**
     * get 国家或地区名称
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set 国家或地区名称
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * get 国家或地区编码
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 国家或地区编码
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * get children
     *
     * @return
     */
    public List<Country> getChildren() {
        return children;
    }

    /**
     * set children
     *
     * @param children
     */
    public void setChildren(List<Country> children) {
        this.children = children;
    }


    /**
     * set 国家或地区名称
     *
     * @param label
     */
    public Country label(String label) {
        this.label = label;
        return this;
    }

    /**
     * set 国家或地区编码
     *
     * @param value
     */
    public Country value(String value) {
        this.value = value;
        return this;
    }

    /**
     * set children
     *
     * @param children
     */
    public Country children(List<Country> children) {
        this.children = children;
        return this;
    }


    /**
     * add item to children
     *
     * @param children
     */
    public void addChildren(Country children) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(children);
    }

}