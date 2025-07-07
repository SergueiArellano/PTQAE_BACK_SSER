package com.certificacion.SergueiBack.tasks.API;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.certificacion.SergueiBack.enums.ResourcesPetStore.*;

public class FindByStatus implements Task {
    private String status;

    public FindByStatus(String status) {
        this.status = status;
    }

    public static Performable withId(String id) {
        return Instrumented.instanceOf(FindByStatus.class).withProperties(id);
    }

    @Override
    @Step("{0} Ejecutar servicio de busqueda de mascota por status")
    public <T extends Actor> void performAs(T actor) {
        String endpoint = PATH_STATUS_PET.getResourcePetStore();
        actor.attemptsTo(
                Get.resource(
                        endpoint + status
                )
        );
    }
}
