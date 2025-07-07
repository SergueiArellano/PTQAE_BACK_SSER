package com.serguei.certificacion.automationSergueiAPI.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import io.restassured.response.Response;

public class ValidateJsonStructure implements Question<Boolean> {

    private final Response response;

    public ValidateJsonStructure(Response response) {
        this.response = response;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Verifica la estructura del JSON
        boolean hasId = response.jsonPath().get("id") != null;
        boolean hasCategory = response.jsonPath().get("category") != null;
        boolean hasCategoryId = response.jsonPath().get("category.id") != null;
        boolean hasCategoryName = response.jsonPath().get("category.name") != null;
        boolean hasName = response.jsonPath().get("name") != null;
        boolean hasStatus = response.jsonPath().get("status") != null;
        boolean hasTags = response.jsonPath().get("tags") != null;

        // Devuelve true si todos los campos están presentes
        return hasId && hasCategory && hasCategoryId && hasCategoryName && hasName && hasStatus && hasTags;
    }

    public static ValidateJsonStructure matches(Response response) {
        return new ValidateJsonStructure(response);
    }
}
