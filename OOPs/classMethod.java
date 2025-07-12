package OOPs;
public class classMethod {
  
        
        public void publicMethod() {
            System.out.println("Hello, this is a public method in a class!");
        }
        static void staticMethode(){
            System.out.println("Hello, this is a static method in a class!");
        }
        public static void main(String[] args) {
            classMethod obj = new classMethod();
            obj.publicMethod(); // Calling the instance method
            staticMethode();// Calling the static method
        }
}
