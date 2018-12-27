package com.pmobile.alertengine.dao;

import com.pmobile.alertengine.domain.AlertEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AlertEntityRepository extends JpaRepository<AlertEntity, String>, JpaSpecificationExecutor {
}
