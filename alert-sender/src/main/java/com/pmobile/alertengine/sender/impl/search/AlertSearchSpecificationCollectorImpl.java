package com.pmobile.alertengine.sender.impl.search;

import com.pmobile.alertengine.domain.AlertSubscriptionEntity;
import com.pmobile.alertengine.sender.api.search.AlertSearchSpecificationCollector;
import com.pmobile.alertengine.sender.api.search.MatchingConditionSpecificationGenerator;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlertSearchSpecificationCollectorImpl implements AlertSearchSpecificationCollector {

    private List<MatchingConditionSpecificationGenerator> matchingConditionSpecificationGenerators = new ArrayList<>();

    @Override
    public List<Specification> collectSpecifications(AlertSubscriptionEntity subscription) {
        List<Specification> totalSpecifications = new ArrayList<>();

        for (MatchingConditionSpecificationGenerator predicateGenerator: this.matchingConditionSpecificationGenerators) {
            totalSpecifications.addAll(predicateGenerator.buildSpecifications(subscription));
        }

        return totalSpecifications;
    }

    @Override
    public void register(MatchingConditionSpecificationGenerator matchingConditionPredicateGenerator) {
        this.matchingConditionSpecificationGenerators.add(matchingConditionPredicateGenerator);
    }


}
