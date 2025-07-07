package com.certificacion.SergueiBack.questions;

import com.certificacion.SergueiBack.builder.RequestFinance;
import net.serenitybdd.annotations.Shared;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateFinanceDetail implements Question<Boolean> {

    @Shared
    RequestFinance requestFinance;

    @Override
    public Boolean answeredBy(Actor actor) {
        Serenity.recordReportData().withTitle("Database evidence").andContents(requestFinance.getFirstValue());
        Serenity.recordReportData().withTitle("Database evidence").andContents(requestFinance.getSecondValue());
        return requestFinance.getFirstValue() != null && requestFinance.getSecondValue() != null && requestFinance.getFirstValue().equals(requestFinance.getSecondValue());
    }

    public static ValidateFinanceDetail result() {
        return new ValidateFinanceDetail();
    }
}
