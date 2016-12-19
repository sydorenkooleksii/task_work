package epam.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://ecsc00105ecb.epam.com:9002/sklepstorefront/electronics/en/?site=electronics")
public class HomePage extends PageObject {

    @FindBy(xpath = ".//*[@id='input_SearchBox']")
    WebElementFacade searchFiled;

    @FindBy(xpath = "//*[@id='header']/div[1]/ul/li[last()]/a")
    WebElementFacade cartLink;

    @FindBy(xpath = ".//*[@id='header']/div[1]/ul/li[1]/a")
    WebElementFacade signInOrRegisterLink;

    @FindBy(xpath = ".//*[@id='header']/div[1]/ul/li[5]/a")
    WebElementFacade signOutLink;


    public void openCart(){
        cartLink.click();
    }

    public void openLoginForm() {
        signInOrRegisterLink.click();
    }

    public void signOutUser() {
        signOutLink.click();
    }



    public void searchForProduct(String product) {
        searchFiled.sendKeys(product);
        searchFiled.submit();
    }
}
