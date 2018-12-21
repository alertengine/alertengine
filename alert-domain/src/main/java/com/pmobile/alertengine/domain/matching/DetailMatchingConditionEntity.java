package com.pmobile.alertengine.domain.matching;

import com.pmobile.alertengine.domain.BaseEntity;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "DETAIL_MATCHING_CONDITION")
public class DetailMatchingConditionEntity extends BaseEntity {

    @ElementCollection
    @CollectionTable(name="detail_matching_cond_details", joinColumns = @JoinColumn(name="detail_matching_cond_id"))
    @MapKeyColumn(name = "detailKey")
    @Column(name = "detailValue")
    private Map<String, String> details = new HashMap<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_matching_condition_id", nullable = false)
    private AlertMatchingConditionEntity alertMatchingCondition;

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }

    public AlertMatchingConditionEntity getAlertMatchingCondition() {
        return alertMatchingCondition;
    }

    public void setAlertMatchingCondition(AlertMatchingConditionEntity alertMatchingCondition) {
        this.alertMatchingCondition = alertMatchingCondition;
    }
}
