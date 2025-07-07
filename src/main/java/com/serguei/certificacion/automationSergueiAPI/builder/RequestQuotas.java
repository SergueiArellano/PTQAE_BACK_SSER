package com.serguei.certificacion.automationSergueiAPI.builder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;

public class RequestQuotas {

    private List<String> firstRecord;

    @JsonProperty("firstRecord")
    public List<List<String>> getFirstRecord() { return Collections.singletonList(firstRecord); }
    @JsonProperty("firstRecord")
    public void setFirstRecord(List<String> value) { this.firstRecord = value; }

}
