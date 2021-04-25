package fourthpackage;

public class ArrayPractice2 {
    public static void main(String[] args) {

        // String [] names = {"Julia", "Burhan", "Menad", "Pria", "Meron"}
        //String Array of names equals new string array. i'm going to specify how many datas i cna store
        //this array is going to explicitly take in 5 datas. can;t enter more than 5
        String [] names = new String [5];
        //names of 0 equals julia

        try {
            names[0] = "Julia";
            names[1] = "Burhan";
            names[2] = "Menad";
            names[3] = "Pria";
            names[4] = "Meron";
            names[5] = "Meron"; //we specified the length of the array to be 5. but we have 6th data
            //  when we run this, it gives us an ArrayIndexOutOfBoundException
            // meaning: on our array we specified, it's going to take 5 indexes but we ended up injecting 6
            // Thrown to indicate that an array has been accessed with an illegal index.
            // The index is either negative or greater than or equal to the size of the array.
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

            for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        String []  newNames = names.clone();
        System.out.println(newNames.length);






    }

}
