package com.pmobile.alertengine.sender.impl.search.specification;

import com.pmobile.alertengine.constants.AlertPriorityEnum;
import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.domain.matching.PriorityMatchingConditionEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PrioritySpecification implements Specification<AlertEntity> {

    private PriorityMatchingConditionEntity priorityMatchingConditionEntity;

    public PrioritySpecification(PriorityMatchingConditionEntity priorityMatchingConditionEntity) {
        this.priorityMatchingConditionEntity = priorityMatchingConditionEntity;
    }

    @Nullable
    @Override
    public Predicate toPredicate(Root<AlertEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        AlertPriorityEnum minimum = priorityMatchingConditionEntity.getMinimum();
        AlertPriorityEnum maximum = priorityMatchingConditionEntity.getMaximum();

        List<AlertPriorityEnum> possiblePriorities = getPossiblePriorities(minimum, maximum);
        return root.get("priority").in(possiblePriorities);
    }

    private List<AlertPriorityEnum> getPossiblePriorities(AlertPriorityEnum minimum, AlertPriorityEnum maximum) {
        List<AlertPriorityEnum> possiblePriorities = new ArrayList<>();
        AlertPriorityEnum[] values = AlertPriorityEnum.values();
        for (AlertPriorityEnum priority : values) {
            if (priority.getEnumId() >= minimum.getEnumId() && priority.getEnumId() <= maximum.getEnumId()) {
                possiblePriorities.add(priority);
            }
        }

        return possiblePriorities;
    }
}
