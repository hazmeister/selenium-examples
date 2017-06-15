package com.harrykinguk;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDemo {

    private WebDriver driver = new SafariDriver();

    @Test
    public void test() {
        driver.get("http://www.harrykinguk.com");
        driver.quit();
    }
}
