package org.example.bugisolation.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBES_EVENT")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Idempotence idempotence;

    public Event() {
    }

    public Event(Long id, Idempotence idempotence) {
        this.id = id;
        this.idempotence = idempotence;
    }

    public Long getId() {
        return id;
    }

    public Event setId(Long id) {
        this.id = id;
        return this;
    }

    public Idempotence getIdempotence() {
        return idempotence;
    }

    public Event setIdempotence(Idempotence idempotence) {
        this.idempotence = idempotence;
        return this;
    }
}
