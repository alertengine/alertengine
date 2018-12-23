package com.pmobile.alertengine.constants;

public enum AlertDeliveryTypeEnum implements IntegerValuedEnum {

    EMAIL(0, "Email"), PHONE_SMS(1, "Phone SMS"), REST_REQUEST(2, "REST Request");

    private Integer enumId;
    private String description;

    AlertDeliveryTypeEnum(int enumId, String description) {
        this.enumId = enumId;
        this.description = description;
    }

    @Override
    public Integer getEnumId() {
        return enumId;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static AlertDeliveryTypeEnum fromEnumId(Integer dbData) {
        for (AlertDeliveryTypeEnum type : values()) {
            if (type.getEnumId().equals(dbData)) {
                return type;
            }
        }
        return null;
    }
}
