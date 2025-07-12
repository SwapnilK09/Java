package OOPs;

// Encapsulated class
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Main class
public class Encap {
    public static void main(String[] args) {
        // Correct object of Person class
        Person sc = new Person();
        sc.setName("John Doe");
        System.out.println("Name: " + sc.getName());
    }
}
