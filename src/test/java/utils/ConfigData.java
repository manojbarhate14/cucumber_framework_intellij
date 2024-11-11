package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {
    Properties prop;


    public Properties redProp() throws IOException {
        prop = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/config/data.properties");
        prop.load(file);
        return prop;
    }
}
