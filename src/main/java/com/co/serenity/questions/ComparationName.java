package com.co.serenity.questions;

import com.co.serenity.userinterfaces.GlobalFeedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ComparationName implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String Validacion = Text.of(GlobalFeedPage.TXT_VALIDATION_NAME).viewedBy(actor).asString();
        System.out.println("/////////////////////"+Validacion);
        return Validacion;
    }

   public static ComparationName is(){
        return new ComparationName();
   }


}
