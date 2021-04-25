package fourthpackage;

import java.util.Random;

public class ArrayPractice3 {

    public static void main(String[] args) {


        // An instance of this Random class is used to generate a stream of random numbers.
        Random random = new Random ();

        int randomNumber1 = random.nextInt(1000);
        int randomNumber2 = random.nextInt(1000);
        int randomNumber3 = random.nextInt(1000);
        int randomNumber4 = random.nextInt(1000);
        int randomNumber5 = random.nextInt(1000);


        int [] arrayNumbers = new int [5];

        arrayNumbers[0] = randomNumber1;
        arrayNumbers[1] = randomNumber2;
        arrayNumbers[2] = randomNumber3;
        arrayNumbers[3] = randomNumber4;
        arrayNumbers[4] = randomNumber5;

        for (int i=0; i<arrayNumbers.length; i++){
            int randomNumber = random.nextInt(1000);
            arrayNumbers[i]=randomNumber;
        }

        //arrayNumber[] = {2, 10, 100, 90, 80}

        for (int i=0; i<arrayNumbers.length; i++){
            System.out.println(arrayNumbers[i]);
        }





    }

}
