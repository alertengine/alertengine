package com.pmobile.alertengine.domain.matching;

import com.pmobile.alertengine.domain.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TAG_MATCHING_CONDITION")
public class TagMatchingConditionEntity extends BaseEntity {

    @ElementCollection
    @CollectionTable(name="tag_matching_cond_tags", joinColumns = @JoinColumn(name="tag_matching_cond_id"))
    @Column(name = "tag")
    private List<String> tags = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_matching_condition_id", nullable = false)
    private AlertMatchingConditionEntity alertMatchingCondition;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public AlertMatchingConditionEntity getAlertMatchingCondition() {
        return alertMatchingCondition;
    }

    public void setAlertMatchingCondition(AlertMatchingConditionEntity alertMatchingCondition) {
        this.alertMatchingCondition = alertMatchingCondition;
    }
}
