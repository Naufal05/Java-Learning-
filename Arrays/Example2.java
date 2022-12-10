import java.util.Scanner;

// using Scanner

public class Example2 {

    public static void main(String[] args) {
        // creating an object of scanner class
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the array length: ");
        int arrlength = scan.nextInt();

        int[] anArray = new int[arrlength];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < arrlength; i++) {
            anArray[i] = scan.nextInt();
        }

        System.out.println("One dimnesional array elements are: ");
        for (int i = 0; i < arrlength; i++) {
            // printing array elements
            System.out.println(anArray[i] + " ");
        }

    }
}
