package com.pmobile.alertengine.controller;

import com.pmobile.alertengine.domain.AlertEntity;
import com.pmobile.alertengine.dao.AlertEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("alert")
public class TestController {

    @Autowired
    private AlertEntityRepository alertEntityRepository;

    @GetMapping("/add")
    private String add(){
        AlertEntity alertEntity = new AlertEntity();
        alertEntity.setBody("dfdsfgdfgd");
        alertEntity.getTags().add(new Date().toString());
        alertEntity.getDetails().put("türkçe karakter deneme", "değeri şğüIqçööö");
        alertEntityRepository.save(alertEntity);
        return alertEntity.getId();
    }

}
