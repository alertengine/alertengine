package com.pmobile.alertengine.sender.api.search;

import com.pmobile.alertengine.domain.AlertSubscriptionEntity;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface AlertSearchSpecificationCollector {

    List<Specification> collectSpecifications(AlertSubscriptionEntity subscription);

    void register(MatchingConditionSpecificationGenerator matchingConditionSpecificationGenerator);

}
