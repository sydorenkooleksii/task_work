package epam.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Page extends PageObject{




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



}
