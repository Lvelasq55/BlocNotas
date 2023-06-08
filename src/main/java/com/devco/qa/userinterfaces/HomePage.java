package com.devco.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target BTN_RICHTEXTNOTE = Target.the("Button rich text note")
            .located(By.id("richtextnote-tab"));
}