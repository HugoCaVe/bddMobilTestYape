package com.mobileyape.pom.utils;

public enum Constants {

    ROOMS("rooms"),
    ADULTS("adults"),
    CHILDREN("children"),
    YEARS_OLD(" years old"),
    YEAR_OLD(" year old"),
    BLANK_SPACE(" "),
    MOBILE_PHONE("Mobile phone"),
    TOTAL("Total"),
    ONE_YEAR("1");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
