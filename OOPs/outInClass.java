package OOPs;

class outerClass{
    int x = 10;
    class innerClass{
        int y = 5;
      }
    }

public class outInClass {
    public static void main(String[] args) {
        outerClass oc = new outerClass();
        outerClass.innerClass ic = oc.new innerClass();
        System.out.println("Addition is :"+(oc.x + ic.y));
    }
}
