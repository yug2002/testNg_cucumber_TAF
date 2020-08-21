package com.cucumber.testng.elements.base;

import com.cucumber.testng.utils.Wait;
import org.openqa.selenium.*;

import java.util.List;

public class Element {
    private WebElement _element;

    public Element(WebElement element) {
        this._element = element;
    }

    public Element(WebElement element, By by) {
        this._element = element.findElement(by);
    }

    public void click() {
        Wait.For(predicate -> this._element.isDisplayed());
        this._element.click();
    }

    public void type(CharSequence... keysToSend) {
        Wait.For(predicate -> this._element.isDisplayed());
        this._element.sendKeys(keysToSend);
    }

    public void clear() {

    }

    public String getTagName() {
        return null;
    }

    public String getAttribute(String name) {
        return null;
    }

    public boolean isSelected() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public String getText() {
        Wait.For(predicate -> this._element.isDisplayed());
        return this._element.getText();
    }

//    public List<WebElement> findElements(By by) {
//        return null;
//    }
//
//    public WebElement findElement(By by) {
//        return null;
//    }

    public boolean isDisplayed() {
        Wait.For(predicate -> this._element.isDisplayed());
        return this._element.isDisplayed();
    }

    public Point getLocation() {
        return null;
    }

    public Dimension getSize() {
        return null;
    }

    public Rectangle getRect() {
        return null;
    }

    public String getCssValue(String propertyName) {
        return null;
    }

    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return null;
    }
}
