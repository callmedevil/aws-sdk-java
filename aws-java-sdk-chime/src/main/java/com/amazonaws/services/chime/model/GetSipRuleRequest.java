/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetSipRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSipRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     */
    private String sipRuleId;

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @param sipRuleId
     *        The SIP rule ID.
     */

    public void setSipRuleId(String sipRuleId) {
        this.sipRuleId = sipRuleId;
    }

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @return The SIP rule ID.
     */

    public String getSipRuleId() {
        return this.sipRuleId;
    }

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @param sipRuleId
     *        The SIP rule ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSipRuleRequest withSipRuleId(String sipRuleId) {
        setSipRuleId(sipRuleId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSipRuleId() != null)
            sb.append("SipRuleId: ").append(getSipRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSipRuleRequest == false)
            return false;
        GetSipRuleRequest other = (GetSipRuleRequest) obj;
        if (other.getSipRuleId() == null ^ this.getSipRuleId() == null)
            return false;
        if (other.getSipRuleId() != null && other.getSipRuleId().equals(this.getSipRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipRuleId() == null) ? 0 : getSipRuleId().hashCode());
        return hashCode;
    }

    @Override
    public GetSipRuleRequest clone() {
        return (GetSipRuleRequest) super.clone();
    }

}
