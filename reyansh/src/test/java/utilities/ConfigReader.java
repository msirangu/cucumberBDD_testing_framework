package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/reyanconfiguration");
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("⚠️ Failed to load config file: " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

	public static void setBrowserType(String browser) {
		// TODO Auto-generated method stub
		
	}
}
