package com.pmobile.alertengine;


import com.pmobile.alertengine.dao.AlertEntityRepository;
import com.pmobile.alertengine.domain.AlertEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.Collection;
import java.util.List;


public class SearchTest extends H2IntegrationTestConfig {


    @Autowired
    private AlertEntityRepository alertEntityRepository;

    @Autowired
    private  EntityManager entityManager;

    @Test
    public void save(){

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<AlertEntity> query = criteriaBuilder.createQuery(AlertEntity.class);

        Root<AlertEntity> root = query.from(AlertEntity.class);
        Expression<Collection<String>> tags = root.get("tags");
        Predicate m2 = criteriaBuilder.isMember("test", tags);
        CriteriaQuery<AlertEntity> where = query.where(m2);

        TypedQuery<AlertEntity> query1 = entityManager.createQuery(query);
        List<AlertEntity> resultList = query1.getResultList();

        System.out.println(resultList);
    }

}
