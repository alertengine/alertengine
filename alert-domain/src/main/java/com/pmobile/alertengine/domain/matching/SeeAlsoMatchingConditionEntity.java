package com.pmobile.alertengine.domain.matching;

import com.pmobile.alertengine.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "SEE_ALSO_MATCHING_CONDITION")
public class SeeAlsoMatchingConditionEntity extends BaseEntity {

    @Column(name = "see_also_url")
    private String seeAlsoUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_matching_condition_id", nullable = false)
    private AlertMatchingConditionEntity alertMatchingCondition;

    public String getSeeAlsoUrl() {
        return seeAlsoUrl;
    }

    public void setSeeAlsoUrl(String seeAlsoUrl) {
        this.seeAlsoUrl = seeAlsoUrl;
    }

    public AlertMatchingConditionEntity getAlertMatchingCondition() {
        return alertMatchingCondition;
    }

    public void setAlertMatchingCondition(AlertMatchingConditionEntity alertMatchingCondition) {
        this.alertMatchingCondition = alertMatchingCondition;
    }
}
