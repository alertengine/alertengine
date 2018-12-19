package com.pmobile.alertengine.persister.api;

import com.pmobile.alertengine.dto.AlertDto;

public interface AlertPersisterService {

    public String save(AlertDto alertDto);

}
