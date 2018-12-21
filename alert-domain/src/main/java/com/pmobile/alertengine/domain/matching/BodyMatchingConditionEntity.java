package com.pmobile.alertengine.domain.matching;

import com.pmobile.alertengine.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "BODY_MATCHING_CONDITION")
public class BodyMatchingConditionEntity extends BaseEntity {

    @Column(name = "body")
    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_matching_condition_id", nullable = false)
    private AlertMatchingConditionEntity alertMatchingCondition;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public AlertMatchingConditionEntity getAlertMatchingCondition() {
        return alertMatchingCondition;
    }

    public void setAlertMatchingCondition(AlertMatchingConditionEntity alertMatchingCondition) {
        this.alertMatchingCondition = alertMatchingCondition;
    }
}
