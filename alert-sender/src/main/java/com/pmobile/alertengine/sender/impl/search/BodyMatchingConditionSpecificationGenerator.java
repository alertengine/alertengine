package com.pmobile.alertengine.sender.impl.search;

import com.pmobile.alertengine.domain.AlertSubscriptionEntity;
import com.pmobile.alertengine.domain.matching.BodyMatchingConditionEntity;
import com.pmobile.alertengine.sender.api.search.AlertSearchSpecificationCollector;
import com.pmobile.alertengine.sender.api.search.MatchingConditionSpecificationGenerator;
import com.pmobile.alertengine.sender.impl.search.specification.BodySpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BodyMatchingConditionSpecificationGenerator implements MatchingConditionSpecificationGenerator {

    private AlertSearchSpecificationCollector alertSearchSpecificationCollector;

    @Override
    public List<Specification> buildSpecifications(AlertSubscriptionEntity alertSubscription) {
        List<Specification> specifications = new ArrayList<>();

        List<BodyMatchingConditionEntity> bodyConditions = alertSubscription.getAlertMatchingCondition().getBodyConditions();

        for (BodyMatchingConditionEntity bodyCondition: bodyConditions) {
            specifications.add(new BodySpecification(bodyCondition));
        }

        return specifications;
    }

    @PostConstruct
    @Override
    public void registerOnConstruction() {
        alertSearchSpecificationCollector.register(this);
    }

    @Autowired
    public void setAlertSearchSpecificationCollector(AlertSearchSpecificationCollector alertSearchSpecificationCollector) {
        this.alertSearchSpecificationCollector = alertSearchSpecificationCollector;
    }
}
