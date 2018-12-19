package com.pmobile.alertengine.persister.impl.mapper;

import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.dto.AlertDto;
import org.springframework.stereotype.Service;

@Service
public class AlertMapper {

    public AlertEntity dtoToNewEntity(AlertDto alertDto){
        AlertEntity entity = new AlertEntity();
        entity.setBody(alertDto.getBody());
        entity.setDetails(alertDto.getDetails());
        entity.setPriority(alertDto.getPriority());
        entity.setProducedDate(alertDto.getProducedDate());
        entity.setSeeAlsoUrl(alertDto.getSeeAlsoUrl());
        entity.setSource(alertDto.getSource());
        entity.setTags(alertDto.getTags());
        entity.setTitle(alertDto.getTitle());
        entity.setValidUntil(alertDto.getValidUntil());
        entity.setId(alertDto.getId());

        return entity;
    }

}
