public class Lazy{
    // a method to add two numbers
    public static int add(int a, int b){
        return a+b;
    }
    // a method to multiply two numbers
    public static int multiply(int a, int b){
        return a*b;
    }
    // a method to subtract two numbers
    public static int subtract(int a, int b){
        return a-b;
    }
    // a method to divide two numbers
    public static int divide(int a, int b){
        return a/b;
    }

    // java main method
    public static void main(String[] args){
        // creating a lazy object
        Lazy lazy = new Lazy();
        // calling the add method
        System.out.println("Addition: " + lazy.add(10, 20));
        // calling the multiply method
        System.out.println("Multiplication: " + lazy.multiply(10, 20));
        // calling the subtract method
        System.out.println("Subtraction: " + lazy.subtract(10, 20));
        // calling the divide method
        System.out.println("Division: " + lazy.divide(10, 20));
    }
}