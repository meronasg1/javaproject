package fourthpackage;

public class ArrayPractice {
    public static void main(String[] args) {

        //data structures: allows you to store a set of data
        String [] name = {"Julia", "Burhan", "Menad"};
        int [] years = {2022, 2025, 2020};
        System.out.println(name [0]);

        // you can store any type of data in an Object array
        Object [] everything = {"USA",2022, true};
        // even though 2022 is stored as an integer it will not allow you to return as an integer
        //because it is now an Object data type
        //int yearFromEverything = everything [1]; // so you can't call it like this

        Object yearFromEverything = everything [1];
        System.out.println(yearFromEverything);

        for (int i= 0; i<3; i++){
            String dataOnLoop = name [i];
            System.out.println(dataOnLoop);
        }


        // in array there is a variable called length. (variable not method because no paranthesis)

        System.out.println(name.length);


    }
}
