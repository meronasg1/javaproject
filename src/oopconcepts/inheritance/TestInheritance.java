package oopconcepts.inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        Tesla tesla = new Tesla ("s", "black");
        System.out.println(tesla.typeOfVehicle);
        System.out.println(tesla.manufacturer);
        tesla.accelerate();
        tesla.brake();

        tesla.turnOn();
        tesla.turnOff();
        

    }



}
