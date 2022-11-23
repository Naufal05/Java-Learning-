// FUNCTIONS 

// create a method
public class Method1 {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        // create an object of method/function
        Method1 obj = new Method1();

        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is " + result);
    }
}

// static method

// public class example1 {
// public static int multiply(int a, int b) {
// int c = a * b;
// return c;
// }

// public static void main(String[] args) {
// int sum = multiply(3, 4);
// System.out.println(sum);
// }
// }
