package com.certificacion.SergueiBack.tasks.Siigo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.certificacion.SergueiBack.enums.ResourcesReqresAPI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarUsuariosPageDos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(PATH_LIST_USERS.getResourceReqresAPI())
        );
    }

    public static ConsultarUsuariosPageDos desdeApi() {
        return instrumented(ConsultarUsuariosPageDos.class);
    }
}
