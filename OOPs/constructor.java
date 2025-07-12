package OOPs;

public class constructor {
    int modelYear;
    String modelName;


    public constructor(int Year , String Name){
        modelYear = Year;
        modelName = Name;
    }

    public static void main(String[] args) {
        constructor myCar = new constructor(2023, "Tesla Model S");
        System.out.println("Model Year: " + myCar.modelYear);
        System.out.println("Model Name: " + myCar.modelName);
    }
}
