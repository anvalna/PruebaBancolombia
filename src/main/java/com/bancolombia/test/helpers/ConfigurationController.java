package com.bancolombia.test.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationController {
    private WebDriver driver;
    private String PATHDRIVER = "src/main/resources/drivers/";

    public ConfigurationController(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        Map< String, Object > prefs = new HashMap< String, Object >();

        prefs.put("profile.default_content_setting_values.geolocation", 1);
        prefs.put("profile.default_content_setting_values.notifications", 1);
        options.setExperimentalOption("prefs", prefs);

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver", PATHDRIVER + "chromedriver.exe");
        this.driver = new ChromeDriver(options);
    }

    public WebDriver getDriver(){
        return driver;
    }
}
