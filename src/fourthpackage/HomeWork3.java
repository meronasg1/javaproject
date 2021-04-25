package fourthpackage;

public class HomeWork3 {
    public static void main(String[] args) {
        HomeWork3 obj = new HomeWork3();
        obj.greetings();
        String x= obj.name();
        System.out.print(x + " Have a great day today!");
        HomeWork3 obj2 = new HomeWork3(90, 100, 80);
        int avg = obj2.getAverage();
        System.out.println("Average = " + avg);///this is not doing what it is supposed to. should print average

    }

    //Call non static void and return type methods to a different class as well as to the same class
    public void greetings(){
        System.out.print("Hello ");
    }
    public String name(){
        String firstName = "Meron";
        String lastName = " Asgedom!";
        return firstName + lastName;
    }

    //Create 2 constructors with different parameters  and use them
    public HomeWork3(){

    }
    int scoreOne ;
    int scoreTwo;
    int scoreThree;
    static int totalOfScores;
    public HomeWork3 (int score1, int score2, int score3 ){
         scoreOne=score1;
         scoreTwo=score2;
         scoreThree=score3;
         totalOfScores = 3;

        }
        public int getAverage(){
        int average = ((scoreOne + scoreTwo + scoreThree)/totalOfScores);
        return average;
    }

}
