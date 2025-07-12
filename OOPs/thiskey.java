package OOPs;

public class thiskey {
    int id;
    String name;

    public thiskey(String name){
        this(101,name);
    }
    public thiskey(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("ID: " + id +", Name: " + name);
    }

    public static void main(String[] args) {
        thiskey std1 = new thiskey("John Doe");
        thiskey std2 = new thiskey(102,"Rolex");
        std1.display();
        std2.display();
    }
}
