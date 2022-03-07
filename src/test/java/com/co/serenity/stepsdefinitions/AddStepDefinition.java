package com.co.serenity.stepsdefinitions;

import com.co.serenity.exceptions.MessageException;
import com.co.serenity.models.Data;
import com.co.serenity.models.DataProduct;
import com.co.serenity.questions.ComparationName;
import com.co.serenity.tasks.AddProduct;
import com.co.serenity.tasks.Login;
import com.co.serenity.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://angular.realworld.io/"));

    }

    @Given("^He user logs in$")
    public void heUserLogsIn(List<Data> dataList) {
        Data data;
        data = dataList.get(0);

        OnStage.theActorInTheSpotlight().wasAbleTo(Login.On(data));
    }

    @When("^The user add a new product to list$")
    public void theUserAddANewProductToList(List<DataProduct>dataProductList) {
        DataProduct dataProduct;
        dataProduct = dataProductList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.in(dataProduct));

    }

    @Then("^He could see a product in the list$")
    public void heCouldSeeAProductInTheList() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ComparationName.is()
                , Matchers.is(Matchers.equalTo(Constants.VALIDATION_NAME)))
                .orComplainWith(MessageException.class, Constants.CAPTURE_ERROR_NAME));

    }

}
