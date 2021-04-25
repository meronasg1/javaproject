package Presentation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties ();

        InputStream inputStream = new FileInputStream("src/Presentation/config.properties");

        properties.load(inputStream);

       String dbUserNameFromFile = properties.getProperty("dbUserName");
        System.out.println(dbUserNameFromFile);


        String dbNameFromFile = properties.getProperty("dbName");
        System.out.println(dbNameFromFile);

        String dbPasswordFromFile = properties.getProperty("dbPassword");
        System.out.println(dbPasswordFromFile);




    }
}
