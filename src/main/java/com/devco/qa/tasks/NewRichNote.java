package com.devco.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.devco.qa.userinterfaces.HomePage.BTN_RICHTEXTNOTE;
import static com.devco.qa.userinterfaces.RichNote.*;

public class NewRichNote implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_RICHTEXTNOTE),
                Click.on(BTN_NEW_NOTE),
                Click.on(BTN_BOLD),
                Click.on(EDITOR));
        Enter.theValue("Prueba Devco");
    }

    public static NewRichNote create() {
        return Tasks.instrumented(NewRichNote.class);
    }

}
