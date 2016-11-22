package tyt.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import tyt.pages.ScrefixResultPage;
import tyt.pages.ScrewfixMainPage;

/**
 * Created by Oleksii_Sydorenko on 11/21/2016.
 */
public class UserStep extends ScenarioSteps {

    ScrefixResultPage screwfixResultPage;
    ScrewfixMainPage screwfixMainPage;

    @Step
    public void goMainPage() {
        screwfixMainPage.open();
    }

    @Step
    public void looks_for(String word) {
        screwfixMainPage.enter_keywords(word);
        screwfixMainPage.search_button_click();

    }

    @Step
    public void should_see_definition(String definition) {
        screwfixResultPage.finderAssert(definition);

    }
}
