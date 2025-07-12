package OOPs;
class Mobile {
  String type = "Smartphone";
}

class Tab extends Mobile {
  String type = "Tablet";

  public void printType() {
    System.out.println(super.type); // Access parent attribute
  }
}

public class superkey {
  public static void main(String[] args) {
    Tab myL = new Tab();
    myL.printType();
  }
}

