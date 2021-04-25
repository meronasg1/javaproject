package fourthpackage;

import java.util.Scanner;

public class NumberAboveAverage {

    public static void main(String[] args) {

        //problem: Write a program in a class NumberAboveAverage that counts the number of days that temp was above average
        //Read 10 tempratures from the keyboard and place them in an array
        //Compute the average temp and then count and dispaly the number of days on which the temprature was above average

        int i;
        int[] tempratureArray = new int [9];
        for (i = 0; i<tempratureArray.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter the temprature for today");
            int temprature = scanner.nextInt();
            tempratureArray [i] = temprature;
        }

        for (int j=0; j<9; j++){
            System.out.println(tempratureArray);
        }












    }

}
