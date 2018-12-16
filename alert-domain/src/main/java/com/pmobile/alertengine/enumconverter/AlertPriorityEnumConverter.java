package com.pmobile.alertengine.enumconverter;

import com.pmobile.alertengine.constants.AlertPriorityEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Converter(autoApply = true)
public class AlertPriorityEnumConverter implements AttributeConverter<AlertPriorityEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(AlertPriorityEnum alertPriorityEnum) {
        if (alertPriorityEnum == null) {
            return null;
        }
        return alertPriorityEnum.getEnumId();
    }

    @Override
    public AlertPriorityEnum convertToEntityAttribute(Integer dbData) {
        return AlertPriorityEnum.fromEnumId(dbData);
    }
}