// Java Standard Library Method

public class Method5 {
    public static void main(String[] args) {

        // using the sqrt() method
        System.out.print("Square root of 4 is: " + Math.sqrt(4));
    }
}

// Java Method for Code Reusability

public class Main {

    // method defined
    private static int getSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // method call
            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
        }
    }
}