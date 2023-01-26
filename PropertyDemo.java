import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

    public static void main(String[] args) throws IOException {
        Properties properties;
        properties = new Properties();
        properties.load(new FileInputStream("application.properties"));

        properties.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));



    }
}
