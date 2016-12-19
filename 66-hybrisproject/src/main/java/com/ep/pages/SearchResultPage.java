package com.ep.pages;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends Page {

    @FindBy(xpath = "//div[@class='productListItem']")
    List<WebElement> listOfProducts;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void addToCartSearchedProduct(String product) {
        for (WebElement elem : listOfProducts) {
            if(elem.findElement(By.xpath(".//div[@class='head']")).getText().contains(product)){

                elem.findElement(By.xpath(".//form/button")).click();

                break;
            }
        }
    }

}

