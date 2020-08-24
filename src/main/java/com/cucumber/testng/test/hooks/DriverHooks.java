package com.cucumber.testng.test.hooks;

import com.cucumber.testng.driver.DriverManager;
import io.cucumber.java8.En;


public class DriverHooks implements En {

    public DriverHooks() {
        Before(() -> DriverManager.setupDriver());
        //After(DriverManager::quitDriver);
    }

//    @Before
//    public void setupDriver(){
//        //Log.info("Driver start");
//        DriverManager.setupDriver();
//    }
//
//    @After
//    public void quitDriver(){
//        DriverManager.quitDriver();
//        //Log.info("Driver quit");
//    }
}
