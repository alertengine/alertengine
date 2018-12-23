package com.pmobile.alertengine.domain;


import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ALERT_TO_BE_SENT")
public class AlertToBeSent extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_id", nullable = false)
    private AlertEntity alert;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_subscriber_id", nullable = false)
    private AlertSubscriberEntity alertSubscriber;

    @Column(name = "sent")
    private boolean sent = false;

    @Column(name = "sent_date")
    private Instant sentDate;

    public AlertEntity getAlert() {
        return alert;
    }

    public void setAlert(AlertEntity alert) {
        this.alert = alert;
    }

    public AlertSubscriberEntity getAlertSubscriber() {
        return alertSubscriber;
    }

    public void setAlertSubscriber(AlertSubscriberEntity alertSubscriber) {
        this.alertSubscriber = alertSubscriber;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public Instant getSentDate() {
        return sentDate;
    }

    public void setSentDate(Instant sentDate) {
        this.sentDate = sentDate;
    }
}
