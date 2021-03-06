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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateUnreferencedMergeCommit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUnreferencedMergeCommitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The full commit ID of the commit that contains your merge results.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the merge results.
     * </p>
     */
    private String treeId;

    /**
     * <p>
     * The full commit ID of the commit that contains your merge results.
     * </p>
     * 
     * @param commitId
     *        The full commit ID of the commit that contains your merge results.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains your merge results.
     * </p>
     * 
     * @return The full commit ID of the commit that contains your merge results.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains your merge results.
     * </p>
     * 
     * @param commitId
     *        The full commit ID of the commit that contains your merge results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUnreferencedMergeCommitResult withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the merge results.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains the merge results.
     */

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the merge results.
     * </p>
     * 
     * @return The full SHA-1 pointer of the tree information for the commit that contains the merge results.
     */

    public String getTreeId() {
        return this.treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the merge results.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains the merge results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUnreferencedMergeCommitResult withTreeId(String treeId) {
        setTreeId(treeId);
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
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getTreeId() != null)
            sb.append("TreeId: ").append(getTreeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUnreferencedMergeCommitResult == false)
            return false;
        CreateUnreferencedMergeCommitResult other = (CreateUnreferencedMergeCommitResult) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        return hashCode;
    }

    @Override
    public CreateUnreferencedMergeCommitResult clone() {
        try {
            return (CreateUnreferencedMergeCommitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
