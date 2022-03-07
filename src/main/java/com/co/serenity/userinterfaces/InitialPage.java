package com.co.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InitialPage {

    public static final Target BTN_LOGIN = Target.the("Btn login")
            .locatedBy("//*[text()=' Sign in ']");

    public static final Target BTN_NEW_ARTICLE = Target.the("Btn new article")
            .locatedBy("//*[@href='/editor']");

    public static final Target BTN_GLOBAL_FEED = Target.the("select option global feed")
            .locatedBy("//*[text()= ' Global Feed '] ");

    public static final Target BTN_HOME = Target.the("select option Home")
            .locatedBy("//*[text()=' Home ']");


}
