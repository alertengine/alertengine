package com.pmobile.alertengine.domain;

import org.hibernate.type.TimeZoneType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.TimeZone;

@Entity
@Table(name = "ALERT_SUBSCRIBER")
public class AlertSubscriberEntity extends BaseEntity {

    @Column(name = "mail")
    private String mail;

    @Column(name = "phone")
    private String phone;



    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
