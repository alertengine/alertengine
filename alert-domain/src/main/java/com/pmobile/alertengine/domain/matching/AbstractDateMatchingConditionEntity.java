package com.pmobile.alertengine.domain.matching;

import com.pmobile.alertengine.domain.BaseEntity;

import javax.persistence.*;
import java.time.Instant;

@MappedSuperclass
public abstract class AbstractDateMatchingConditionEntity extends BaseEntity {

    @Column(name = "start")
    private Instant start;

    @Column(name = "end")
    private Instant end;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_matching_condition_id", nullable = false)
    private AlertMatchingConditionEntity alertMatchingCondition;

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    public AlertMatchingConditionEntity getAlertMatchingCondition() {
        return alertMatchingCondition;
    }

    public void setAlertMatchingCondition(AlertMatchingConditionEntity alertMatchingCondition) {
        this.alertMatchingCondition = alertMatchingCondition;
    }
}