package epam.pages;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultPage extends PageObject {

    @FindBy(xpath = "//div[@class='productListItem']")
    List<WebElementFacade> listOfProducts;


    public void addToCartSearchedProduct(String product) {
        for (WebElementFacade elem : listOfProducts) {
            if(elem.findElement(By.xpath(".//div[@class='head']")).getText().contains(product)){

                elem.findElement(By.xpath(".//form/button")).click();

                break;
            }
        }
    }

}

