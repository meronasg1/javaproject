package oopconcepts.inheritance;

public class Car extends Vehicle{

    public Car(String manufacturer, String model, String color) {
        super(manufacturer, model, color, "Car");
    }

    public void turnOn(){
        System.out.println("Turning car on....");
    }

    public void turnOff(){
        System.out.println("Turning car on ....");
    }
}


