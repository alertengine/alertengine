package com.pmobile.alertengine.domain.matching;

import com.pmobile.alertengine.constants.AlertPriorityEnum;
import com.pmobile.alertengine.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "PRIORITY_MATCHING_CONDITION")
public class PriorityMatchingConditionEntity extends BaseEntity {

    @Column(name = "minimum")
    private AlertPriorityEnum minimum = AlertPriorityEnum.LOW;

    @Column(name = "maximum")
    private AlertPriorityEnum maximum = AlertPriorityEnum.CRITICAL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_matching_condition_id", nullable = false)
    private AlertMatchingConditionEntity alertMatchingCondition;

    public AlertPriorityEnum getMinimum() {
        return minimum;
    }

    public void setMinimum(AlertPriorityEnum minimum) {
        this.minimum = minimum;
    }

    public AlertPriorityEnum getMaximum() {
        return maximum;
    }

    public void setMaximum(AlertPriorityEnum maximum) {
        this.maximum = maximum;
    }

    public AlertMatchingConditionEntity getAlertMatchingCondition() {
        return alertMatchingCondition;
    }

    public void setAlertMatchingCondition(AlertMatchingConditionEntity alertMatchingCondition) {
        this.alertMatchingCondition = alertMatchingCondition;
    }
}
