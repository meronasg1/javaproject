package fourthpackage;

import java.util.Hashtable;

public class HashTablePractice {    //TO DO

    //Hashtables are threadsafe adn synchronized
    //it is slower than hashmap

    public static void main(String[] args) {
        Hashtable<Integer, String> studentTable = new Hashtable <>();

        studentTable.put(1, "Tanzina");
        studentTable.put(2, "Pria");
        studentTable.put(3, "Menad");

        System.out.println(studentTable);
    }



}
