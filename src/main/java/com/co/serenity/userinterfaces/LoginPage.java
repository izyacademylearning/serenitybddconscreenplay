package com.co.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_EMAIL = Target.the("Enter the email")
            .locatedBy("//input[@formcontrolname='email']");

    public static final Target TXT_PASSWORD = Target.the("Enter the password")
            .locatedBy("//input[@formcontrolname='password']");

    public static final Target BTN_SIGNIN = Target.the("Enter the button sign in")
            .locatedBy("//button[@class='btn btn-lg btn-primary pull-xs-right']");


}
