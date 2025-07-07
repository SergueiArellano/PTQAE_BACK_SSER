package com.certificacion.SergueiBack.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/result.json"},
        features = "src/test/resources/features/",
        glue = {"com.certificacion.SergueiBack.stepDefinitions","com.certificacion.SergueiBack.set.hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@RepResAPI"
)

public class TestRunner {
}
