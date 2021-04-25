package fourthpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {

    public static void main(String[] args) {


        // common interview question: what is the difference between an int and Integer. Integer is a class and int is a primitive data type.
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(101);
        numberList.add(102);

        ArrayList<Object> objectsList = new ArrayList<> ();
        objectsList.add("name");
        objectsList.add("true");
        objectsList.add("2020");

        //for loop --> size of the arraylist
        for (int i=0; i<numberList.size(); i++){
            int number =numberList.get(i);
            System.out.println(number);
        }

        //a loop running based on the iterator
        //hasNext method returns true if the iteration has more elements.
        //next returns the next element in the iteration.
        Iterator iterator = numberList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
