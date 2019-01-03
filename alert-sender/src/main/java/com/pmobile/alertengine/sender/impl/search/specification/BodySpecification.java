package com.pmobile.alertengine.sender.impl.search.specification;

import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.domain.matching.BodyMatchingConditionEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class BodySpecification implements Specification<AlertEntity> {

    private BodyMatchingConditionEntity bodyMatchingCondition;

    public BodySpecification(BodyMatchingConditionEntity bodyMatchingCondition){
        this.bodyMatchingCondition = bodyMatchingCondition;
    }

    @Nullable
    @Override
    public Predicate toPredicate(Root<AlertEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        String body = bodyMatchingCondition.getBody();
        return criteriaBuilder.like(criteriaBuilder.upper(root.get("body")), body == null ? "%%" : "%" + body.toUpperCase()+ "%");
    }
}
