package com.co.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GlobalFeedPage {

    public static final Target TXT_VALIDATION_NAME = Target.the("validation product name")
            .locatedBy("//*[text()='IPHONE 13 PRO MAX']");
}
