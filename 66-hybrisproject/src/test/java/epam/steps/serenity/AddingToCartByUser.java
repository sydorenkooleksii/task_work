package epam.steps.serenity;



import epam.pages.HomePage;
import epam.pages.LoginPage;
import epam.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class AddingToCartByUser extends ScenarioSteps {


    HomePage homePage;
    SearchResultPage searchResultPage;
    LoginPage loginPage;

    @Step
    public void isOnTheHomePage() {
        homePage.open();
    }

    @Step
    public void selectRestricted() {
        homePage.$(".//*[@id='content']/div[3]/div[1]/div[1]/a/span[1]/strong").click();
    }

    @Step
    public void clickAddToCart() {
        homePage.$(".//*[@id='addToCartButton']").click();
    }

    @Step
    public void clickSignInLink(){
        homePage.openLoginForm();
    }

    @Step
    public void inputLoginAndPassword() {
        loginPage.setLogin("keenreviewer5@hybris.com");
        loginPage.setPassword("password");
    }

    @Step
    public void pressButtonSignIn() {
        loginPage.clickSignInButton();
    }

    @Step
    public void searchProduct(String product) {
        homePage.searchForProduct(product);
    }

    @Step
    public void clickAddToCartOfSearchedProduct(String product) {
        searchResultPage.addToCartSearchedProduct(product);
    }

    @Step
    public void openCart() {
        homePage.openCart();
    }

    @Step
    public void signOut() {
        homePage.signOutUser();
    }
}
