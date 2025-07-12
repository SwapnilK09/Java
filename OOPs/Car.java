package OOPs;

class Vehical {
    protected String name = "Ford";  // Changed 'brand' to 'name'
    
    public void sound() {
        System.out.println("Vroom Vroom");
    }
}

public class Car extends Vehical {
    private String model = "Mustang";

    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.sound();
        System.out.println(mycar.name + " " + mycar.model); // changed brand to name
    }
}
