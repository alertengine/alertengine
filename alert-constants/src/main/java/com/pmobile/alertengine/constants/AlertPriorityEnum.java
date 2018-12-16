package com.pmobile.alertengine.constants;

public enum AlertPriorityEnum implements IntegerValuedEnum {

    INFORMATIONAL(0, "Informational"), LOW(1, "Low"), MODERATE(2, "Moderate"), HIGH(3, "High"), CRITICAL(4, "Critical");

    private Integer enumId;
    private String description;

    AlertPriorityEnum(int enumId, String description) {
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

    public static AlertPriorityEnum fromEnumId(Integer dbData) {
        for (AlertPriorityEnum type : values()) {
            if (type.getEnumId().equals(dbData)) {
                return type;
            }
        }
        return null;
    }
}
