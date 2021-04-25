package oopconcepts;

public class SuperClass {
    //https://www.tutorialspoint.com/java/java_inheritance.htm


    //what is a class?
    // A class is a blueprint to create an object

    //Car

    //attributes of a car
    String manufacturer;
    String model;
    String color;
    private static final int NUM_OF_WHEELS= 4; //not going to allow anyone to change thi. plus this is going to be true for all cars.
    int numOfDoors;


    //behaviors of a car
    public void startEngine (){
        System.out.println("Starting engine");
    }

    public void turnOffEngine(){
        System.out.println("Turning engine off");
    }

    public void accelerate(){
        System.out.println("Accelerating....");
    }

    public void brake(){
        System.out.println("Applying brakes....");
    }

    public void turnRight(){
        System.out.println("Turning right....");
    }

    public void turnLeft(){
        System.out.println("Turning left.....");
    }








}
