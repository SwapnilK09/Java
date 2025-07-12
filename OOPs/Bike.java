package OOPs;

// Parent class
class Vehicle {
    protected String brand = "Yamaha";  // protected: accessible in child
    private int speed = 100;            // private: only accessible within Vehicle

    public void honk() {
        System.out.println("Beep Beep!");
    }

    public int getSpeed() {
        return speed;  // Provide access via getter method
    }
}

// Child class
public class Bike extends Vehicle {
    private String modelName = "R15 V4";  // specific to Bike

    public static void main(String[] args) {
        Bike myBike = new Bike();

        // Access inherited method
        myBike.honk();

        // Access protected member from parent
        System.out.println("Brand: " + myBike.brand);

        // Access private field via getter
        System.out.println("Speed: " + myBike.getSpeed() + " km/h");

        // Access Bike's own field
        System.out.println("Model: " + myBike.modelName);
    }
}
