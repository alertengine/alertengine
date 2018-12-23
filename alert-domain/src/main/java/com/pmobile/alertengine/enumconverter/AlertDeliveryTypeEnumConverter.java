package com.pmobile.alertengine.enumconverter;

import com.pmobile.alertengine.constants.AlertDeliveryTypeEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Converter(autoApply = true)
public class AlertDeliveryTypeEnumConverter implements AttributeConverter<AlertDeliveryTypeEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(AlertDeliveryTypeEnum alertDeliveryTypeEnum) {
        if (alertDeliveryTypeEnum == null) {
            return null;
        }
        return alertDeliveryTypeEnum.getEnumId();
    }

    @Override
    public AlertDeliveryTypeEnum convertToEntityAttribute(Integer dbData) {
        return AlertDeliveryTypeEnum.fromEnumId(dbData);
    }
}