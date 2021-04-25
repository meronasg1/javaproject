package fourthpackage;

import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main (String [] args) throws IOException {

        // properties file is a key value pair.
        // meaning you'll have a key and against that key you'll have a value
        // key = value
        // to read a properties file we need a class called properties

        Properties properties = new Properties();

        //creating an object of the class OutputStream
        // something else pops up when you do new outputstream
        //this is because output stream class has an abstract
        //so if a class has abstract before class name we can't create object the traditional way
        // so we have to do new fileoutput stream
        //copy path from content root not absolute path.
       /* try {
            InputStream inputStream = new FileInputStream("src/fourthpackage/confg.properties") ;
        } catch (FileNotFoundException e) {
            System.out.println("please fix your file path");
            e.printStackTrace(); //add this in so that your program fails
        }*/
        //java throws us an exception for FileOutput stream. we use the try catch block to catch the exception
        // what does try catch mean
            // it's saying: try the line 18 and when you're trying it catch the exception and print it. the exception is filenotfound exception
        // you can also just throw the exception to java, but when you do that you lose the privilage of to write your own custom action

        InputStream inputStream = new FileInputStream("src/fourthpackage/config.properties") ;

        properties.load(inputStream);

        //here we threw back the exception thrown by FileInputStream (threw back filenotfound exception),
        // we also threw back the exception from the load method( IO exception)
        //IO exception is parent of file not found exception
        // so java automatically erases the child exception from the signiture and keeps the parent

        String dbUserFromFile = properties.getProperty("dbUserName");
        String dbPasswordFromFile = properties.getProperty("dbPassword");
        System.out.println(dbUserFromFile);
        System.out.println(dbPasswordFromFile);


    }
}
