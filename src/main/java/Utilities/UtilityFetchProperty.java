package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityFetchProperty {
    public static String fetchPropertyvalue(String key)  {
        FileInputStream file = null;
        try {
            file = new FileInputStream("./src/test/resources/Config/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties property = new Properties();
        try {
            property.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return property.get(key).toString();
    }
}
