package epam.steps.jbehave.definitionsteps;


import epam.pages.HomePage;
import epam.steps.serenity.AddingToCartByUser;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


import static org.assertj.core.api.Assertions.assertThat;

public class AddingToCartByUserDefinitionSteps {

    @Steps
    AddingToCartByUser user;
HomePage homePage;



    @Given("web visitor is on the home page")
    public void givenTheUserIsOnTheElectronicStoreHomePage() {
        user.isOnTheHomePage();
    }

    @When("web visitor choose restricted product")
    public void chooseRestrictedProduct(){
        user.selectRestricted();
    }

    @When("press button 'add to cart' of '$product'")
    @Given("press button 'add to cart' of '$product'")
    public void pressAddToCartButton(String product){
        user.clickAddToCartOfSearchedProduct(product);
    }

    @Then("web visitor should be redirected to login page")
    public void shouldRedirectToLoginPage(){
        assertThat(homePage.getTitle()).contains("Login | Electronics Site");
    }

    @Given("web visitor search '$product'")
    @When("web visitor search '$product'")
    public void searchProduct(String product){
        user.searchProduct(product);
    }

    @Then("'$product' should be added to cart")
    public void productShouldBeInTheCart(String product){
        user.openCart();
        assertThat(homePage.containsText(product));
    }

    @Given("web visitor signed in")
    public void signIn () {
        user.isOnTheHomePage();

        user.clickSignInLink();
        user.inputLoginAndPassword();
        user.pressButtonSignIn();
    }


    @When("web visitor signed in")
    public void login () {
        user.inputLoginAndPassword();
        user.pressButtonSignIn();
    }

    @Then("user is on the '$product' page")
    public void productShouldBeOnProductPage(String product){
        assertThat(homePage.containsText(product));
    }

    @Then("user sign out")
    public void userSignOut(){
        user.signOut();
    }
}

