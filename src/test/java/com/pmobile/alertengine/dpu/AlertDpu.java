package com.pmobile.alertengine.dpu;

import com.pmobile.alertengine.dao.AlertEntityRepository;
import com.pmobile.alertengine.domain.AlertEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(value = 1)
public class AlertDpu implements ApplicationListener<ApplicationReadyEvent> {
  
    @Autowired
    private AlertEntityRepository alertEntityRepository;

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        seedData();
    }

    private void seedData() {
        if(alertEntityRepository.count() > 0) {
    		return;
    	}

		AlertEntity alertEntity = new AlertEntity();
        alertEntity.setBody("body");
        alertEntity.getTags().add("test");

        alertEntityRepository.save(alertEntity);
    	
     }

}