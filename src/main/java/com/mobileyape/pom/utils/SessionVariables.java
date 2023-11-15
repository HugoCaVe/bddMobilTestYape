package com.mobileyape.pom.utils;

public enum SessionVariables {
    TEMPORAL_TAXES_AND_CHARGES_TOTAL("total temporal impuestos y tasas"),
    USER_NAME("userName"),
    LAST_NAME("lastName"),
    EMAIL("email"),
    PHONE("phone"),
    TEMPORAL_TOTAL("temporal total");

    private final String value;

    SessionVariables(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}