package com.cucumber.testng.pages.home;

import com.cucumber.testng.data.ApplicationData;
import com.cucumber.testng.elements.base.Element;
import com.cucumber.testng.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final String BUTTON_BY_NAME = "//a[./*[text()='%s']]";

    //public HomePage() {
//        super();
//    }

    public void open() {
        this.open(ApplicationData.URL);
    }

    public Element title() {
        return this.findElement(By.xpath("//h1/span"));
    }

    public Element buttonByName(String name) {
        return this.findElement(By.xpath(String.format(BUTTON_BY_NAME, name)));
    }

}
