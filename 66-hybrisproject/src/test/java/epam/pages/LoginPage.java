package epam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


    public class LoginPage extends PageObject {

        @FindBy(xpath = ".//*[@id='j_username']")
        WebElementFacade loginField;

        @FindBy(xpath = ".//*[@id='j_password']")
        WebElementFacade passwordField;

        @FindBy(xpath = ".//*[@id='loginForm']/div[2]/button")
        WebElementFacade loginButton;



        public void setLogin(String email) {
            loginField.sendKeys(email);
        }

        public void setPassword(String password) {
            passwordField.sendKeys(password);
        }

        public void clickSignInButton() {
            loginButton.click();
        }
}
