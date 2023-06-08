package com.devco.qa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/create_note.feature",
        glue = "com.devco.qa.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class CreateNote {
}