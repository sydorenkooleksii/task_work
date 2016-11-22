package tyt.steps.jbehave;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import tyt.steps.serenity.UserStep;

/**
 * Created by Oleksii_Sydorenko on 11/21/2016.
 */
public class DefStep {


    @Steps
    UserStep userStep;

    @Given("I want to buy window")
    public void givenTheUserOnTheMainPage() {

        userStep.goMainPage();
    }


    @When("I search for items containing <symbol>")
    public void whenTheUserLooks(@Named("symbol")String word) {
        userStep.looks_for(word);

    }

    @Then("I should only see items related to <symbol>")
    public void thenHeShould(@Named("symbol")String definition) {
        userStep.should_see_definition(definition);
    }
}