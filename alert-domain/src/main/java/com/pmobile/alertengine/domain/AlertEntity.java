package com.pmobile.alertengine.domain;

import com.pmobile.alertengine.constants.AlertPriorityEnum;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "ALERT")
public class AlertEntity extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "body", length = EntityConstants.LONG_LENGTH)
    private String body;

    @Column(name = "source")
    private String source;

    @Column(name = "priority")
    private AlertPriorityEnum priority = AlertPriorityEnum.MODERATE;

    @Column(name = "produced_date", nullable = false)
    private Instant producedDate = Instant.now();

    @Column(name = "valid_until")
    private Instant validUntil;

    @Column(name = "see_also_url")
    private String seeAlsoUrl;

    @ElementCollection
    @CollectionTable(name="alert_tags", joinColumns = @JoinColumn(name="alert_id"))
    @Column(name = "tag")
    private List<String> tags = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name="alert_details", joinColumns = @JoinColumn(name="alert_id"))
    @MapKeyColumn(name = "detailKey")
    @Column(name = "detailValue")
    private Map<String, String> details = new HashMap<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public AlertPriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(AlertPriorityEnum priority) {
        this.priority = priority;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }

    public Instant getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(Instant producedDate) {
        this.producedDate = producedDate;
    }

    public Instant getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Instant validUntil) {
        this.validUntil = validUntil;
    }

    public String getSeeAlsoUrl() {
        return seeAlsoUrl;
    }

    public void setSeeAlsoUrl(String seeAlsoUrl) {
        this.seeAlsoUrl = seeAlsoUrl;
    }
}
