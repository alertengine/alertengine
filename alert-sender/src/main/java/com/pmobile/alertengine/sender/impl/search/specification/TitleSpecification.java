package com.pmobile.alertengine.sender.impl.search.specification;

import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.domain.matching.TitleMatchingConditionEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class TitleSpecification implements Specification<AlertEntity> {

    private TitleMatchingConditionEntity titleMatchingConditionEntity;

    public TitleSpecification(TitleMatchingConditionEntity titleMatchingConditionEntity){
        this.titleMatchingConditionEntity = titleMatchingConditionEntity;
    }

    @Nullable
    @Override
    public Predicate toPredicate(Root<AlertEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        String title = titleMatchingConditionEntity.getTitle();
        return criteriaBuilder.like(criteriaBuilder.upper(root.get("title")), title == null ? "%%" : "%" + title.toUpperCase()+ "%");
    }
}
