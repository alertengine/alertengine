package com.pmobile.alertengine.controller;


import com.pmobile.alertengine.dto.AlertDto;
import com.pmobile.alertengine.persister.api.AlertPersisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("alert")
public class TestController {

    @Autowired
    private AlertPersisterService alertPersisterService;

    @GetMapping("/add")
    private String add(){
        AlertDto alertEntity = new AlertDto();
        alertEntity.setBody("dfdsfgdfgd");
        alertEntity.getTags().add(new Date().toString());
        alertEntity.getDetails().put("türkçe karakter deneme", "değeri şğüIqçööö");


        String save = alertPersisterService.save(alertEntity);
        return save;
    }

}
