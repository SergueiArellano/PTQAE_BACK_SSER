package com.serguei.certificacion.automationSergueiAPI.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/result.json"},
        features = "src/test/resources/features/",
        glue = {"com.serguei.certificacion.automationSergueiAPI.stepDefinitions","com.serguei.certificacion.automationSergueiAPI.set.hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@Pet"
)

public class TestRunner {
}
