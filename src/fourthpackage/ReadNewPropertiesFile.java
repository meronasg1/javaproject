package fourthpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadNewPropertiesFile {

    public static void main(String[] args) throws IOException {

        ReadNewPropertiesFile read = new ReadNewPropertiesFile();
        String name = read.readName("src/fourthpackage/newConfig.properties", "employees");
        String userName = read.readUserName("src/fourthpackage/newConfig.properties", "dbUserName");
        String password = read.readPassWord("src/fourthpackage/newConfig.properties", "dbPassword");


        System.out.println(name);
        System.out.println(userName);
        System.out.println(password);



        //make this code reusabel to read any file's data
        //create one method to take in 2 params
        //one the location of the file, one the key that you wnat to read

    }

        public String  readUserName (String location, String key ) throws IOException {
            Properties properties = new Properties();
            InputStream inputStream =new FileInputStream(location);
            properties.load(inputStream);
            String dbUserNameFromFIle = properties.getProperty(key);
            return dbUserNameFromFIle;
        }

        public String  readName (String location, String key ) throws IOException {
            Properties properties = new Properties();
            InputStream inputStream =new FileInputStream(location);
            properties.load(inputStream);
            String dbNameFromFile = properties.getProperty(key);
            return dbNameFromFile;
        }

        public String  readPassWord (String location, String key ) throws IOException {
            Properties properties = new Properties();
            InputStream inputStream =new FileInputStream(location);
            properties.load(inputStream);
            String dbPasswordFromFile = properties.getProperty(key);
            return dbPasswordFromFile;
        }


}