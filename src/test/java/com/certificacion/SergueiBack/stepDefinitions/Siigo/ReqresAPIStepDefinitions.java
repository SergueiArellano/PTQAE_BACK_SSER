package com.certificacion.SergueiBack.stepDefinitions.Siigo;

import com.certificacion.SergueiBack.questions.Siigo.CodigoRespuesta;
import com.certificacion.SergueiBack.questions.ValidateJsonStructure;
import com.certificacion.SergueiBack.questions.ValidateSCOk;
import com.certificacion.SergueiBack.tasks.Siigo.ConsultarUsuariosPageDos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import static com.certificacion.SergueiBack.enums.ResourcesReqresAPI.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ReqresAPIStepDefinitions {

    @Dado("que {} tiene los datos para ejecutar el servicio")
    public void queLuisaTieneLosDatosParaEjecutarElServicio(String actor) {
        OnStage.
                setTheStage(
                        new OnlineCast()
                );
        theActorCalled(actor)
                .whoCan(
                        CallAnApi.at(BASE_URL_REQRES_API.getResourceReqresAPI())
                );
    }

    @Cuando("el cliente realiza una petición GET para listar usuarios")
    public void elClienteRealizaGETParaListarUsuarios() {
        theActorInTheSpotlight()
                .attemptsTo(
                        ConsultarUsuariosPageDos.desdeApi()
                );
    }

    @Entonces("la respuesta debe tener un código de estado {}")
    public void laRespuestaDebeTenerUnCódigoDeEstado(int statusEsperado) {
        theActorInTheSpotlight().should(
                seeThat("Código de respuesta",
                        CodigoRespuesta.es(),
                        equalTo(
                                statusEsperado
                        )
                )
        );
    }
}
