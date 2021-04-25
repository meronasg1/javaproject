package fourthpackage;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MoreHomeWork {

    String firstName1;
    String lastName1;
    String userName1;
    String passWord1;
    public MoreHomeWork(String firstName, String lastName, String userName, String passWord){
        firstName1= firstName;
        lastName1= lastName;
        userName1= userName;
        passWord1= passWord;

    }
    String fullName1;
    int score1;
    int score2;
    int desiredAverage1;
    int totalNumberOfScores = 3;

    public MoreHomeWork(String fullName, int scoreOne, int scoreTwo, int desiredAverage){
        fullName1=fullName;
        score1=scoreOne;
        score2=scoreTwo;
        desiredAverage1=desiredAverage;
    }

    public MoreHomeWork() {

    }

    public int howToGetDesiredAverage1(){
        int score3=(totalNumberOfScores*desiredAverage1)-(score1+score2);

        if (score3 < 100) {
            return score3;
        }
        else return -1;

    }

    public void printWelcome(){
        System.out.println("Welcome to the webpage");
    }


    //Create 2 methods with same name but different parameters  and use them



    //method that adds the smallest and the biggest number
    int a1;
    int b1;
    int c1;
    public int addNumbers (int a, int b, int c){
        a1=a;
        b1=b;
        c1=c;
        int smallnumber;
        int bignumber;
        //finding the smallest number
        if ((a1<b1)&(a1<c1)){
             smallnumber = a1;
        }
        else if ((b1<a1)&(b1<c1)){
              smallnumber = b1;
        }
        else{
             smallnumber = c1;
        }

        if ((a1>b1)&(a1>c1)){
             bignumber = a1;
        }
        else if ((b1>a1)&(b1>c1)){
             bignumber = b1;
        }
        else{
             bignumber = c1;
        }

        return smallnumber+bignumber;
    }


    //method will add the numbers between x and y
    int x1;
    int y1;
    public int addNumbers  (int x, int y){
        x1= x;
        y1= y;
        int sum = 0;
        for (int i =x1;i<=y1; i++ ){
            sum = sum + i;

        }
        return sum;
    }

    public static void main(String[] args) {
        MoreHomeWork obj = new MoreHomeWork("Meron", "Asgedom", "meronasg", "abc123");
        obj.printWelcome();

        MoreHomeWork obj2 = new MoreHomeWork("Meron Asgeodm", 85, 75, 90);
        MoreHomeWork obj3 = new MoreHomeWork();
        int mark3= obj2.howToGetDesiredAverage1();



        if (mark3 ==-1){
            System.out.println("Sorry an average of" + obj3.desiredAverage1 + "is not possible given your first two exam scores");
        }
        else if (mark3 >1 ){
            System.out.println("you should score a " + mark3 + " on the third exam to get an average of " + obj3.desiredAverage1);//ask prof why this printing a zero
        }

        Scanner scanner = new Scanner (System.in);
        System.out.println("please enter two different whole numbers. Enter the smaller number first and the bigger number second ");

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int sum = obj3.addNumbers(x1, y1);
        System.out.println("The sum of numbers between " + x1 + " and " + y1 + " is " + sum);


        int sumOfBigAndSmall= obj3.addNumbers(1, 20, 3);
        System.out.println(sumOfBigAndSmall);
    }



}
