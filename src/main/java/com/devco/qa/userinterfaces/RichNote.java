package com.devco.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RichNote {

    public static final Target BTN_NEW_NOTE = Target.the("Button bold text")
            .locatedBy("//*[@src='https://www.online-notepad.net/assets/icons/new-note.svg']");
    public static final Target BTN_BOLD = Target.the("Button bold text")
            .locatedBy("//*[@class='ck ck-icon ck-button__icon']");

    public static final Target EDITOR = Target.the("Button bold text")
            .locatedBy("//*[@class='ck ck-icon ck-button__icon']");
}


//*[@id='editor']