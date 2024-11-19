package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {
    static Properties prop;
    static  WebDriver driver;

    public ConfigData() throws IOException {
    }
    public static Properties redProp() throws IOException {
        prop = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/config/data.properties");
        prop.load(file);
        return prop;
    }

    public static WebDriver invokeBrowser() throws IOException
    {
        String properties_browser = ConfigData.redProp().getProperty("browserName");
        String maven_browser = System.getProperty("browserName");
        //  result = test_condition ? value1 : value2       this is ternary operator in java
        String browser = maven_browser!=null ? maven_browser : properties_browser ;

        String properties_headless = ConfigData.redProp().getProperty("headless");
        String maven_headless = System.getProperty("headless");
        String headless = maven_headless != null ? maven_headless : properties_headless ;

        if(browser.equalsIgnoreCase("chrome") && headless.equalsIgnoreCase("Y")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }else if(browser.equalsIgnoreCase("chrome") && headless.equalsIgnoreCase("N")) {
            driver = WebDriverManager.chromedriver().create();
        } else if ((browser.equalsIgnoreCase("chrome"))){
        driver = WebDriverManager.chromedriver().create();
        }
        return driver;
    }
}
