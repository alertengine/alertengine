package com.pmobile.alertengine.sender.impl.search;

import com.pmobile.alertengine.dao.AlertEntityRepository;
import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.domain.AlertSubscriptionEntity;
import com.pmobile.alertengine.sender.api.search.AlertSearchSpecificationCollector;
import com.pmobile.alertengine.sender.api.search.SearchMatchingAlertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SearchMatchingAlertsServiceImpl implements SearchMatchingAlertsService {

    private AlertSearchSpecificationCollector alertSearchSpecificationCollector;

    private AlertEntityRepository alertEntityRepository;

    @Override
    public List<AlertEntity> findMatchingAlerts(AlertSubscriptionEntity subscription) {

        List<Specification> specifications = alertSearchSpecificationCollector.collectSpecifications(subscription);

        Specification unionSpecification = unionSpecifications(specifications);
        if(unionSpecification == null){
            return Collections.emptyList();
        }
        List<AlertEntity> all = alertEntityRepository.findAll(unionSpecification);

        return all;
    }

    private Specification unionSpecifications(List<Specification> specifications) {
         if(specifications.isEmpty()){
             return null;
         }

        Specification union = specifications.get(0);
        for (int i = 1; i < specifications.size(); i++) {
            union = union.and(specifications.get(i));
        }

        return union;
    }

    @Autowired
    public void setAlertSearchSpecificationCollector(AlertSearchSpecificationCollector alertSearchSpecificationCollector) {
        this.alertSearchSpecificationCollector = alertSearchSpecificationCollector;
    }

    @Autowired
    public void setAlertEntityRepository(AlertEntityRepository alertEntityRepository) {
        this.alertEntityRepository = alertEntityRepository;
    }
}
