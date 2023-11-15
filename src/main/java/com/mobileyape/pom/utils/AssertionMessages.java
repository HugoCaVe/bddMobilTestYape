package com.mobileyape.pom.utils;

public enum AssertionMessages {
    ERROR_ITEM_NOT_FOUND("Item not found "),

    ERROR_DATA_RESERVATION_NOT_FOUND("Data reservation not found "),

    ERROR_TOTAL_RESERVE_DOES_NOT_MATCH("Error, Total reserve does not match "),

    EXPECTED_MESSAGE(" expected message "),

    MESSAGE_SHOWN(" message shown: "),

    ERROR_MAIN_PAGE_NOT_FOUND("Error, result list not found ");
    private String value;

    AssertionMessages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
