package org.example.bugisolation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBES_IDEMPOTENCE")
@IdClass(IdempotenceId.class)
public class Idempotence {
    @Id
    @Column(name = "request_id")
    private String requestId;

    @Id
    @Column(name = "created_by", nullable = false, updatable = false)
    private String createdBy;

    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public Idempotence() {
    }

    public Idempotence(String requestId, String createdBy, Event event) {
        this.requestId = requestId;
        this.createdBy = createdBy;
        this.event = event;
    }

    public String getRequestId() {
        return requestId;
    }

    public Idempotence setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Idempotence setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Event getEvent() {
        return event;
    }

    public Idempotence setEvent(Event event) {
        this.event = event;
        return this;
    }
}
