package com.serguei.certificacion.automationSergueiAPI.builder;

import com.fasterxml.jackson.annotation.*;

public class RequestFinance {

    private String firstValue;
    private String secondValue;

    @JsonProperty("firstValue")
    public String getFirstValue() { return firstValue; }
    @JsonProperty("firstValue")
    public void setFirstValue(String value) { this.firstValue = value; }

    @JsonProperty("secondValue")
    public String getSecondValue() { return secondValue; }
    @JsonProperty("secondValue")
    public void setSecondValue(String value) { this.secondValue = value; }
}
