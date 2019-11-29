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
 * attackTypeCount
 */
public class AttackTypeCount  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * attackCount
     */
    private Long attackCount;

    /**
     * attackType
     */
    private String attackType;


    /**
     * get attackCount
     *
     * @return
     */
    public Long getAttackCount() {
        return attackCount;
    }

    /**
     * set attackCount
     *
     * @param attackCount
     */
    public void setAttackCount(Long attackCount) {
        this.attackCount = attackCount;
    }

    /**
     * get attackType
     *
     * @return
     */
    public String getAttackType() {
        return attackType;
    }

    /**
     * set attackType
     *
     * @param attackType
     */
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }


    /**
     * set attackCount
     *
     * @param attackCount
     */
    public AttackTypeCount attackCount(Long attackCount) {
        this.attackCount = attackCount;
        return this;
    }

    /**
     * set attackType
     *
     * @param attackType
     */
    public AttackTypeCount attackType(String attackType) {
        this.attackType = attackType;
        return this;
    }


}