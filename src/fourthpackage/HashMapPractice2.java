package fourthpackage;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class HashMapPractice2 {
    public static void main(String[] args) throws IOException {

        //USA --> NY, NJ, DC
        //CANADA --> CO, NH

        ArrayList <String> listOfStateUSA = new ArrayList<> ();
        listOfStateUSA.add("NY");
        listOfStateUSA.add("NJ");
        listOfStateUSA.add("DC");

        ArrayList <String> listOfStateCanada = new ArrayList<> ();
        listOfStateCanada.add("CO");
        listOfStateCanada.add("NH");

        HashMap<String, ArrayList<String>> countryMap = new HashMap<>();
        countryMap.put("USA", listOfStateUSA);
        countryMap.put("Canada", listOfStateCanada);


        System.out.println(countryMap);
        System.out.println(countryMap.get("USA"));


        System.out.println("*******");


        HashMap<String, Integer> cityAndZipCodeOfUSA= new HashMap<>();
        cityAndZipCodeOfUSA.put("Reston", 20191);
        cityAndZipCodeOfUSA.put("Haymarket", 20169);
        cityAndZipCodeOfUSA.put("Herndon", 20171);

        HashMap<String, Integer> cityAndZipCodeOfCanada = new HashMap<>();
        cityAndZipCodeOfCanada.put("Ontario", 11111);
        cityAndZipCodeOfCanada.put("NiagraFalls", 2222);
        cityAndZipCodeOfCanada.put("Drake", 33333);

        ArrayList< HashMap<String, Integer>> cityAndZipCodes= new ArrayList<>();
        cityAndZipCodes.add(cityAndZipCodeOfUSA);
        cityAndZipCodes.add(cityAndZipCodeOfCanada);

        System.out.println(cityAndZipCodes);

        //read both the config files
        //store the key value from the config to maps
        //store the data from the map to a arrayList of map

        Properties properties = new Properties();
        InputStream inputStream= new FileInputStream("src/fourthpackage/config.properties");
        properties.load(inputStream);
        String data1FromConfig = properties.getProperty("dbName");
        String data2FromConfig = properties.getProperty("dbUser");
        String data3FromConfig = properties.getProperty("dbPassword");

        Properties pr = new Properties();
        InputStream input= new FileInputStream("src/fourthpackage/configuration.properties");
        properties.load(input);
        String data1FromConfiguration = properties.getProperty("dbName");
        String data2FromConfiguration = properties.getProperty("dbUser");
        String data3FromConfiguration= properties.getProperty("dbPassword");

        HashMap <String, String> keyValuePairsFromConfig = new HashMap<>();
        keyValuePairsFromConfig.put("dbName",  data1FromConfig );
        keyValuePairsFromConfig.put("dbUser",  data2FromConfig );;
        keyValuePairsFromConfig.put("dbPassword", data3FromConfig );


        HashMap <String, String> keyValuePairsFromConfiguration = new HashMap<>();
        keyValuePairsFromConfiguration.put("dbName",  data1FromConfiguration );
        keyValuePairsFromConfiguration.put("dbUser",  data2FromConfiguration );;
        keyValuePairsFromConfiguration.put("dbPassword", data3FromConfiguration );

        ArrayList <HashMap <String, String>> keyValuePairsFromPropertiesFiles = new ArrayList<>();
        keyValuePairsFromPropertiesFiles.add(keyValuePairsFromConfig);
        keyValuePairsFromPropertiesFiles.add(keyValuePairsFromConfiguration);

        System.out.println(keyValuePairsFromPropertiesFiles);












    }
}
