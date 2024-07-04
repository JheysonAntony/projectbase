package co.com.screenplay.project.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenWebStep {

    @Before
    public void SetTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario abre el sitio web de pruebas")
    public void thatTheUserOpensTheTestWebsite() {

    }

    @When("ingresa al navegador chrome")
    public void enterChromeBrowser() {

    }

    @Then("visualizara el titulo de la pagina {string}")
    public void willDisplayThePageTitle(String textValidation) {

    }
}
