package oopconcepts;

// AKA Child Class
public class DerivedClass extends SuperClass {
    //i can extend this derived class using this super class

    public static void main(String[] args) {
        DerivedClass honda = new DerivedClass ();
        honda.color= "Black";
        honda.manufacturer = "Honda";
        honda.model= "Accord";
        honda.numOfDoors= 4;

        honda.startEngine();
        honda.accelerate();
        honda.brake();
        honda.turnOffEngine();

        //rules to inheritance
            //single inheritance. Honda is a car
            //multilevel inheritance. honda is a car is a vehicle
            // Hierarchical Inheritance. honda is a car and toyota is a car
            // **Multiple inheritance. can't extend by multiple classes, can only extend by one class. can't say honda class extends car class and vehicle class

    }

}
