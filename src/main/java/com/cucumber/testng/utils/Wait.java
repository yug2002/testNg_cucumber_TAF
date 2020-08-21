package com.cucumber.testng.utils;

import java.time.Instant;
import java.util.function.Predicate;

public class Wait {
    public static final int INTERVAL = 100;
    public static final long TIMEOUT = 15000;

    public static void For(Predicate<Boolean> condition) {
        long currentTimeJava8 = Instant.now().toEpochMilli();

        while ((Instant.now().toEpochMilli() - currentTimeJava8) < TIMEOUT) {
            try {
                if (condition.test(true)) {
                    return;
                }
            } catch (Exception e) {
                //skip
            }
            try {
                Thread.sleep(INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }


    public static void For(Predicate<Boolean> condition, int timeOut) {
        long currentTimeJava8 = Instant.now().toEpochMilli();

        while ((Instant.now().toEpochMilli() - currentTimeJava8) < timeOut) {
            try {
                if (condition.test(true)) {
                    return;
                }
            } catch (Exception e) {
                //skip
            }
            try {
                Thread.sleep(INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}
