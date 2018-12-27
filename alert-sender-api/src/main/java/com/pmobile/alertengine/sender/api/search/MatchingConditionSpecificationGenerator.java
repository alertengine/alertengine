package com.pmobile.alertengine.sender.api.search;

import com.pmobile.alertengine.domain.AlertSubscriptionEntity;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface MatchingConditionSpecificationGenerator {

    public List<Specification> buildSpecifications(AlertSubscriptionEntity alertSubscription);

    void registerOnConstruction();
}
