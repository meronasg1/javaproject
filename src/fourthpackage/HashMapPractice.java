package fourthpackage;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        //dbName= com.oracle
        //dbUser= testuser
        //dbPassword= abc123


        HashMap<String, String> informationMap = new HashMap <>();
        informationMap.put("dbName", "com.oracle");
        informationMap.put("dbUser", "testuser");
        informationMap.put("dbPassword", "abc123");

        System.out.println(informationMap);

        // the get method from the hashmap class returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
        System.out.println(informationMap.get("dbName"));
        System.out.println(informationMap.get("dbUser"));
        System.out.println(informationMap.get("dbPassword"));

        //Interview question: can a map hold a null key or a null value?
        //Answer: yes it can

        informationMap.put("null", "Merry");
        informationMap.put("Merry", null);

        System.out.println("null");
        System.out.println("Merry");

        //Interview question: what happens if i put the same key but different data?
        //Answer: Map doesn't really allow you to have duplicate keys. won't return both values
        //will return the most recent value

        informationMap.put("dbPin", "1234");
        informationMap.put("dbPin", "1996");

        //Problem with hashMap: not thread safe and not synchronized
        //Interview question: Is hashMap thread safe?
        //Answer: no it is not

        //containsKey method returns true if this map contains a mapping for a specified key
        System.out.println(informationMap.containsKey("dbUser"));
        //containsValue method returns true if this map maps for one or more keys to the specified value
        System.out.println(informationMap.containsValue("1234") );


    }
}
