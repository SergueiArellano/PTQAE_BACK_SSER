package com.serguei.certificacion.automationSergueiAPI.tasks.API;

import com.serguei.certificacion.automationSergueiAPI.models.TemplatePetStore;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.serguei.certificacion.automationSergueiAPI.enums.ResourcesPetStore.*;

public class AddNewPet implements Task {
    public AddNewPet() {
    }

    public static Performable withId() {
        return Instrumented.instanceOf(AddNewPet.class).withProperties();
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
        Object object = TemplatePetStore.getRequestAddNewPetStore();
        actor.attemptsTo(
                Post.to(PATH_ADD_NEW_PET.getResourcePetStore())
                        .with(request -> request
                                .header("Content-Type", HEADER_VALUE_CONTEN_TYPE.getResourcePetStore())
                                .body(object))
        );
    }
}
