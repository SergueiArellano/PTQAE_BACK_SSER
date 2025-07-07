package com.certificacion.SergueiBack.enums;

public enum Resources {
    USUARIO("usuario"),
    EQUAL_SIGN("="),
    CURLY_BRACES_SIGN("}]"),
    PERIOD_SIGN("."),


    ;

    private String resources;

    Resources(String resources) {
        this.resources = resources;
    }

    public String getResources() {
        return resources;
    }
}
