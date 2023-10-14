package ru.liapkin.springbootthirdappurfu.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Systems {

    EMPTY(""),
    ERP("Enterprise Resource Planning"),
    CRM("Customer Relationship Management"),
    WMS("Warehouse Management System"),
    SYSTEM_1("System 1");

    private final String name;

    Systems(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
