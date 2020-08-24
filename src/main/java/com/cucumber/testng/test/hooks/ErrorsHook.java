package com.cucumber.testng.test.hooks;

import com.cucumber.testng.driver.DriverManager;
import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;

public class ErrorsHook implements En {
    private static final String PNG_FILE_EXTENSION = "image/png";

    public ErrorsHook() {
        After((Scenario scenario) -> {
            if(scenario.isFailed()){
                byte[] screenshot = DriverManager.takeScreenshot();
                scenario.attach(screenshot, PNG_FILE_EXTENSION, scenario.getName());
//            Log.error(scenario.getStatus());
            }
        });
    }

//    @After
//    public void errorHandler(Scenario scenario){
//        if(scenario.isFailed()){
//            byte[] screenshot = DriverManager.takeScreenshot();
//            scenario.embed(screenshot, PNG_FILE_EXTENSION, scenario.getName());
////            Log.error(scenario.getStatus());
//        }
//    }
}
