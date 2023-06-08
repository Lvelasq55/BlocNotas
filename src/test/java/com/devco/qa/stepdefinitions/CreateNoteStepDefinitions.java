package com.devco.qa.stepdefinitions;

import com.devco.qa.tasks.NewRichNote;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateNoteStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Laura");
    }

    @Given("I enter Notepad")
    public void iEnterNotepad() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"));
    }

    @When("I select to create a rich text note")
    public void iSelectToCreateARichTextNote() {
        OnStage.theActorInTheSpotlight().attemptsTo(NewRichNote.create());
    }

    @Then("I validate the created note")
    public void iValidateTheCreatedNote() {

    }


}
