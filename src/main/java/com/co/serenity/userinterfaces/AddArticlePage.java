package com.co.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddArticlePage {

    public static final Target TXT_TITLE = Target.the("enter the title")
            .locatedBy("//input[@formcontrolname='title']");

    public static final Target TXT_DESCRIPTION = Target.the("enter the description")
            .locatedBy("//input[@formcontrolname='description']");

    public static final Target TXT_BODY = Target.the("enter the body")
            .locatedBy("//*[@formcontrolname='body']");

    public static final Target TXT_TAGS = Target.the("enter the tags")
            .locatedBy("//*[@placeholder='Enter tags']");

    public static final Target BTN_PUBLISH_ARTICLE = Target.the("btn publish article")
            .locatedBy("//*[text()=' Publish Article ']");


}
