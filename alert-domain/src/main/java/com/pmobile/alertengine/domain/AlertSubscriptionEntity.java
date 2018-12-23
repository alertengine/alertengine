package com.pmobile.alertengine.domain;

import com.pmobile.alertengine.domain.matching.AlertMatchingConditionEntity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ALERT_SUBSCRIPTION")
public class AlertSubscriptionEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_matching_condition_id", nullable = false)
    private AlertMatchingConditionEntity alertMatchingCondition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_delivery_detail_id", nullable = false)
    private AlertDeliveryDetailEntity alertDeliveryDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_subscriber_id", nullable = false)
    private AlertSubscriberEntity alertSubscriber;

    @Column(name = "enabled")
    private boolean enabled = true;

    @Column(name = "active_from", nullable = false)
    private Instant activeFrom = Instant.now();

    @Column(name = "activeUntil", nullable = false)
    private Instant activeUntil = Instant.now();

    @Column(name = "name")
    private String name;


    public AlertMatchingConditionEntity getAlertMatchingCondition() {
        return alertMatchingCondition;
    }

    public void setAlertMatchingCondition(AlertMatchingConditionEntity alertMatchingCondition) {
        this.alertMatchingCondition = alertMatchingCondition;
    }

    public AlertDeliveryDetailEntity getAlertDeliveryDetail() {
        return alertDeliveryDetail;
    }

    public void setAlertDeliveryDetail(AlertDeliveryDetailEntity alertDeliveryDetail) {
        this.alertDeliveryDetail = alertDeliveryDetail;
    }

    public AlertSubscriberEntity getAlertSubscriber() {
        return alertSubscriber;
    }

    public void setAlertSubscriber(AlertSubscriberEntity alertSubscriber) {
        this.alertSubscriber = alertSubscriber;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Instant getActiveFrom() {
        return activeFrom;
    }

    public void setActiveFrom(Instant activeFrom) {
        this.activeFrom = activeFrom;
    }

    public Instant getActiveUntil() {
        return activeUntil;
    }

    public void setActiveUntil(Instant activeUntil) {
        this.activeUntil = activeUntil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
