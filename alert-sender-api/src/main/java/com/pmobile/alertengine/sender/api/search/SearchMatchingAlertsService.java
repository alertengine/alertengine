package com.pmobile.alertengine.sender.api.search;

import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.domain.AlertSubscriptionEntity;

import java.util.List;

public interface SearchMatchingAlertsService {

    List<AlertEntity> findMatchingAlerts(AlertSubscriptionEntity subscription);

}
