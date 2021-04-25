package fourthpackage;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList <String> countryList = new ArrayList();
        countryList.add("USA");
        countryList.add("Canada");
        countryList.add("China");

        System.out.println(countryList);
        //as you can see above you can use the object to print out the ArrayList
        //you can't do this with arrays


        //Size method returns the number of elements in this list.
        // get returns the element at the specified position in this list.
        for (int i=0; i<countryList.size(); i++){
            String country = countryList.get(i);
            System.out.println(country);
        }

        //Notice, how we did not specify the length of the list.
        //ArrayList is flexible, it streachs based on the number of datas that you give
        //whereas an array is fixed
        System.out.println("********");


        //Removes the first occurrence of the specified element from this list, if it is present
        countryList.remove("USA");
        System.out.println(countryList);
        System.out.println(countryList.size());

        //Removes all of the elements from this list. The list will be empty after this call returns.
        //Returns true if this list contains no elements.
        System.out.println("********");
        System.out.println(countryList.isEmpty());
        countryList.clear();
        System.out.println(countryList);
        System.out.println(countryList.size());
        System.out.println(countryList.isEmpty());








    }








}
