package com.ironhack.homework2.enums;

public enum ObjectType {
    ACCOUNT("ACCOUNT", "ACCOUNTS"),
    CONTACT("CONTACT", "CONTACTS"),
    LEAD("LEAD", "LEADS"),
    OPPORTUNITY("OPPORTUNITY", "OPPORTUNITIES");

    private String singularForm;
    private String pluralForm;

    ObjectType(String singularForm, String pluralForm) {
        this.singularForm = singularForm;
        this.pluralForm = pluralForm;
    }

    public String getSingularForm() {
        return singularForm;
    }

    public String getPluralForm() {
        return pluralForm;
    }
}