package com.pmobile.alertengine.sender.impl.search.specification;

import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.domain.matching.SourceMatchingConditionEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class SourceSpecification implements Specification<AlertEntity> {

    private SourceMatchingConditionEntity sourceeMatchingConditionEntity;

    public SourceSpecification(SourceMatchingConditionEntity sourceeMatchingConditionEntity){
        this.sourceeMatchingConditionEntity = sourceeMatchingConditionEntity;
    }

    @Nullable
    @Override
    public Predicate toPredicate(Root<AlertEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        String source = sourceeMatchingConditionEntity.getSource();
        return criteriaBuilder.like(criteriaBuilder.upper(root.get("source")), source == null ? "%%" : "%" + source.toUpperCase()+ "%");
    }
}
