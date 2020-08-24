package com.cucumber.testng.pages.base;
import com.cucumber.testng.driver.DriverManager;
import com.cucumber.testng.elements.base.Element;
import com.cucumber.testng.utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BasePage {
    private WebDriver _driver;

    protected BasePage() {
        this._driver = DriverManager.getDriver();
        PageFactory.initElements(this._driver, this);
    }

    protected Element findElement(By by) {
       Wait.For(predicate -> this._driver.findElements(by).size() > 0);
       return new Element(this._driver.findElement(by));
    }

    protected List<Element> findElements(By by) {
        Wait.For(predicate -> this._driver.findElements(by).size() > 0);
        var collection = this._driver.findElements(by);
        var resultsList = collection.stream().map(
                element -> new Element(element)).collect(Collectors.toList());
        return resultsList;
    }

    protected void open(String url) {
        _driver.get(url);
    }


}
