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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateEventIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the event integration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the event integration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The event filter.
     * </p>
     */
    private EventFilter eventFilter;
    /**
     * <p>
     * The Eventbridge bus.
     * </p>
     */
    private String eventBridgeBus;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @param name
     *        The name of the event integration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @return The name of the event integration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @param name
     *        The name of the event integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the event integration.
     * </p>
     * 
     * @param description
     *        The description of the event integration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the event integration.
     * </p>
     * 
     * @return The description of the event integration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the event integration.
     * </p>
     * 
     * @param description
     *        The description of the event integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The event filter.
     * </p>
     * 
     * @param eventFilter
     *        The event filter.
     */

    public void setEventFilter(EventFilter eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * <p>
     * The event filter.
     * </p>
     * 
     * @return The event filter.
     */

    public EventFilter getEventFilter() {
        return this.eventFilter;
    }

    /**
     * <p>
     * The event filter.
     * </p>
     * 
     * @param eventFilter
     *        The event filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationRequest withEventFilter(EventFilter eventFilter) {
        setEventFilter(eventFilter);
        return this;
    }

    /**
     * <p>
     * The Eventbridge bus.
     * </p>
     * 
     * @param eventBridgeBus
     *        The Eventbridge bus.
     */

    public void setEventBridgeBus(String eventBridgeBus) {
        this.eventBridgeBus = eventBridgeBus;
    }

    /**
     * <p>
     * The Eventbridge bus.
     * </p>
     * 
     * @return The Eventbridge bus.
     */

    public String getEventBridgeBus() {
        return this.eventBridgeBus;
    }

    /**
     * <p>
     * The Eventbridge bus.
     * </p>
     * 
     * @param eventBridgeBus
     *        The Eventbridge bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationRequest withEventBridgeBus(String eventBridgeBus) {
        setEventBridgeBus(eventBridgeBus);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEventIntegrationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventIntegrationRequest clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventFilter() != null)
            sb.append("EventFilter: ").append(getEventFilter()).append(",");
        if (getEventBridgeBus() != null)
            sb.append("EventBridgeBus: ").append(getEventBridgeBus()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventIntegrationRequest == false)
            return false;
        CreateEventIntegrationRequest other = (CreateEventIntegrationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventFilter() == null ^ this.getEventFilter() == null)
            return false;
        if (other.getEventFilter() != null && other.getEventFilter().equals(this.getEventFilter()) == false)
            return false;
        if (other.getEventBridgeBus() == null ^ this.getEventBridgeBus() == null)
            return false;
        if (other.getEventBridgeBus() != null && other.getEventBridgeBus().equals(this.getEventBridgeBus()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventFilter() == null) ? 0 : getEventFilter().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeBus() == null) ? 0 : getEventBridgeBus().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventIntegrationRequest clone() {
        return (CreateEventIntegrationRequest) super.clone();
    }

}
