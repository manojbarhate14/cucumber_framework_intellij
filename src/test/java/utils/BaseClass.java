package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class BaseClass {
    WebDriver driver;

    public BaseClass(WebDriver driver) throws IOException {
        this.driver = driver;
    }
}
