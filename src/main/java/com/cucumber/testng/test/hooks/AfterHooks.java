package com.cucumber.testng.test.hooks;
import com.cucumber.testng.driver.DriverManager;
import io.cucumber.java8.En;

public class AfterHooks implements En {
    public AfterHooks() {
        After(() -> DriverManager.quitDriver());
    }
}
