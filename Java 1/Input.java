// Entering an input from the user

// create an object of Scanner
// Scanner input = new Scanner(System.in);

// take input from the user
// int number = input.nextInt()

// closing the scanner object
// input.close();

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        input.close();
    }

}
