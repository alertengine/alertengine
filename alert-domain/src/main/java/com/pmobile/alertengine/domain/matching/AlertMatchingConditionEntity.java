package com.pmobile.alertengine.domain.matching;

import com.pmobile.alertengine.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ALERT_MATCHING_CONDITION")
public class AlertMatchingConditionEntity extends BaseEntity {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<BodyMatchingConditionEntity> bodyConditions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<DetailMatchingConditionEntity> detailConditions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<PriorityMatchingConditionEntity> priorityConditions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<ProducedDateMatchingConditionEntity> producedDateConditions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<SeeAlsoMatchingConditionEntity> seeAlsoConditions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<SourceMatchingConditionEntity> sourceConditions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<TagMatchingConditionEntity> tagConditions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<TitleMatchingConditionEntity> titleConditions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alertMatchingCondition")
    private List<ValidUntilMatchingConditionEntity> validUntilConditions = new ArrayList<>();

    public List<BodyMatchingConditionEntity> getBodyConditions() {
        return bodyConditions;
    }

    public void setBodyConditions(List<BodyMatchingConditionEntity> bodyConditions) {
        this.bodyConditions = bodyConditions;
    }

    public List<DetailMatchingConditionEntity> getDetailConditions() {
        return detailConditions;
    }

    public void setDetailConditions(List<DetailMatchingConditionEntity> detailConditions) {
        this.detailConditions = detailConditions;
    }

    public List<PriorityMatchingConditionEntity> getPriorityConditions() {
        return priorityConditions;
    }

    public void setPriorityConditions(List<PriorityMatchingConditionEntity> priorityConditions) {
        this.priorityConditions = priorityConditions;
    }

    public List<ProducedDateMatchingConditionEntity> getProducedDateConditions() {
        return producedDateConditions;
    }

    public void setProducedDateConditions(List<ProducedDateMatchingConditionEntity> producedDateConditions) {
        this.producedDateConditions = producedDateConditions;
    }

    public List<SeeAlsoMatchingConditionEntity> getSeeAlsoConditions() {
        return seeAlsoConditions;
    }

    public void setSeeAlsoConditions(List<SeeAlsoMatchingConditionEntity> seeAlsoConditions) {
        this.seeAlsoConditions = seeAlsoConditions;
    }

    public List<SourceMatchingConditionEntity> getSourceConditions() {
        return sourceConditions;
    }

    public void setSourceConditions(List<SourceMatchingConditionEntity> sourceConditions) {
        this.sourceConditions = sourceConditions;
    }

    public List<TagMatchingConditionEntity> getTagConditions() {
        return tagConditions;
    }

    public void setTagConditions(List<TagMatchingConditionEntity> tagConditions) {
        this.tagConditions = tagConditions;
    }

    public List<TitleMatchingConditionEntity> getTitleConditions() {
        return titleConditions;
    }

    public void setTitleConditions(List<TitleMatchingConditionEntity> titleConditions) {
        this.titleConditions = titleConditions;
    }

    public List<ValidUntilMatchingConditionEntity> getValidUntilConditions() {
        return validUntilConditions;
    }

    public void setValidUntilConditions(List<ValidUntilMatchingConditionEntity> validUntilConditions) {
        this.validUntilConditions = validUntilConditions;
    }
}
