package com.cucumber.testng.test.steps;

import com.cucumber.testng.driver.DriverManager;
import com.cucumber.testng.pages.base.BasePage;
import com.cucumber.testng.pages.home.HomePage;
import io.cucumber.java8.En;

public class BaseStep implements En {
    BasePage homePage = new HomePage();
}
