package com.certificacion.SergueiBack.stepDefinitions.API;

import com.certificacion.SergueiBack.questions.ValidateJsonStructure;
import com.certificacion.SergueiBack.questions.ValidateSCOk;
import com.certificacion.SergueiBack.tasks.API.AddNewPet;
import com.certificacion.SergueiBack.tasks.API.FindByStatus;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.certificacion.SergueiBack.enums.ResourcesPetStore.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PetStoreStepDefinitions {


    @Cuando("se ejecuta el servicio para agregar una nueva mascota")
    public void seEjecutaElServicio() {
        theActorInTheSpotlight()
                .attemptsTo(
                        AddNewPet.withId()
                );
    }

    @Entonces("el servicio responder de manera exitosa")
    public void elServicioResponderDeManeraExitosa() {
        theActorInTheSpotlight()
                .should(
                        seeThat("El status code es 200", ValidateSCOk.ofService(),
                                equalTo(true)
                        ),
                        seeThat("Estructura del Json es correcta.", ValidateJsonStructure.matches(
                                        SerenityRest.lastResponse()
                                ),
                                equalTo(true)
                        )
                );

    }

    @Cuando("se ejecuta la busqueda por status {} en servicio rest")
    public void seEjecutaLaBusquedaPorStatusEnServicioRest(String status) {
        theActorInTheSpotlight()
                .attemptsTo(
                        FindByStatus.withId(status)
                );
    }
}
