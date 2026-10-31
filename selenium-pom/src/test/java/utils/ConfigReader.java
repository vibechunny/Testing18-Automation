package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

//    static block: duoc lay 1 lan duy nhat khi class duoc goi len
    static {
//        lay file trong thu muc resources
        try (InputStream in = ConfigReader.class.getResourceAsStream("/config.properties")) {
            properties.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Ko doc duoc file config.properties", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
