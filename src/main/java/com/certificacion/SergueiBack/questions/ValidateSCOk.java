package com.certificacion.SergueiBack.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.http.HttpStatus;

public class ValidateSCOk implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        int statusCode = SerenityRest.lastResponse().statusCode();
        return statusCode == HttpStatus.SC_OK;
    }
    public static ValidateSCOk ofService() {
        return new ValidateSCOk();
    }

}
