package com.certificacion.SergueiBack.set.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.certificacion.SergueiBack.enums.Resources.USUARIO;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Hook {

    @Before
    public void inicializacion(){
        setTheStage(new OnlineCast());
        OnStage.theActorCalled(USUARIO.getResources());
    }

    @After
    public void finalizar(){drawTheCurtain();}
}
