package com.pmobile.alertengine.persister.impl;

import com.pmobile.alertengine.dao.AlertEntityRepository;
import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.dto.AlertDto;
import com.pmobile.alertengine.persister.api.AlertPersisterService;
import com.pmobile.alertengine.persister.impl.mapper.AlertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class AlerPersisterServiceImpl implements AlertPersisterService {

    private AlertEntityRepository alertEntityRepository;

    private AlertMapper alertMapper;

    @Override
    public String save(AlertDto alertDto) {
        AlertEntity newAlert = alertMapper.dtoToNewEntity(alertDto);
        newAlert = alertEntityRepository.save(newAlert);
        return newAlert.getId();
    }

    @Autowired
    public void setAlertEntityRepository(AlertEntityRepository alertEntityRepository) {
        this.alertEntityRepository = alertEntityRepository;
    }

    @Autowired
    public void setAlertMapper(AlertMapper alertMapper) {
        this.alertMapper = alertMapper;
    }
}
