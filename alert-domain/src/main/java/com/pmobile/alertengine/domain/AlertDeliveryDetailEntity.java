package com.pmobile.alertengine.domain;

import com.pmobile.alertengine.constants.AlertDeliveryTypeEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ALERT_DELIVERY_DETAIL")
public class AlertDeliveryDetailEntity extends BaseEntity {

    @Column(name = "delivery_type")
    private AlertDeliveryTypeEnum alertDeliveryType;

    public AlertDeliveryTypeEnum getAlertDeliveryType() {
        return alertDeliveryType;
    }

    public void setAlertDeliveryType(AlertDeliveryTypeEnum alertDeliveryType) {
        this.alertDeliveryType = alertDeliveryType;
    }
}
