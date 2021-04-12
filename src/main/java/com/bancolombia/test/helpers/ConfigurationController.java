package com.bancolombia.test.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfigurationController {
    private WebDriver driver;
    private String PATHDRIVER = "src/main/resources/drivers/";

    public ConfigurationController(){
        System.setProperty("webdriver.chrome.driver", PATHDRIVER + "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        this.driver = new org.openqa.selenium.chrome.ChromeDriver(options);
    }

    public WebDriver getDriver(){
        return driver;
    }
}
