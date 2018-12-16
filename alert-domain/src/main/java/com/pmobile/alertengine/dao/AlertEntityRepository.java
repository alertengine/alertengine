package com.pmobile.alertengine.dao;

import com.pmobile.alertengine.domain.AlertEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertEntityRepository extends JpaRepository<AlertEntity, String> {
}
