package org.example.bugisolation.entity;

import java.io.Serializable;
import java.util.Objects;

public class IdempotenceId implements Serializable {
    private String requestId;
    private String createdBy;

    public IdempotenceId() {
    }

    public IdempotenceId(String requestId, String createdBy) {
        this.requestId = requestId;
        this.createdBy = createdBy;
    }

    public String getRequestId() {
        return requestId;
    }

    public IdempotenceId setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public IdempotenceId setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdempotenceId that)) return false;
        return Objects.equals(requestId, that.requestId) && Objects.equals(createdBy, that.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, createdBy);
    }
}
