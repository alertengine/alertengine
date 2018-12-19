package com.pmobile.alertengine.dto;

import com.pmobile.alertengine.constants.AlertPriorityEnum;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlertDto {

    private String id;

    private String title;

    private String body;

    private String source;

    private AlertPriorityEnum priority = AlertPriorityEnum.MODERATE;

    private Instant producedDate = Instant.now();

    private Instant validUntil;

    private String seeAlsoUrl;

    private List<String> tags = new ArrayList<>();

    private Map<String, String> details = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }
}
