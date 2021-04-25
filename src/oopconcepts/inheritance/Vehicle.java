package oopconcepts.inheritance;

public class Vehicle {

    String manufacturer;
    String model;
    String color;
    String typeOfVehicle;

    public Vehicle (String manufacturer, String model, String color, String typeOfVehicle){
        this.manufacturer=manufacturer;
        this.model = model;
        this.color = color;
        this.typeOfVehicle = typeOfVehicle;
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
