import java.util.Scanner;

/*
 * PSEUDO CODE
 * 
 * INPUT
 * ENTER THE NAME OF THE STUDENT
 * USER ENTRRY
 * ENTER SUBJECT1 MARKS
 * USER ENTRY
 * ENTER SUBJECT2 MARKS
 * USER ENTRY
 * ENTER SUBJECT3 MARKS
 * USER ENTRY
 * 
 * NAME :
 * SUBJECT 1 MARKS:
 * SUBJECT 2 MARKS:
 * SUBJECT 3 MARKS:
 * 
 * AVERAGE OF MARKS :
 * 
 * 
 */

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);

            // String input
            System.out.println("ENTER THE NAME OF THE STUDENT:");
            String name = myObj.nextLine();

            // Numerical input
            System.out.println("Enter subject 1 marks:");
            int sub1 = myObj.nextInt();
            System.out.println("Enter subject 2 marks:");
            int sub2 = myObj.nextInt();
            System.out.println("Enter subject 3 marks:");
            int sub3 = myObj.nextInt();

            float average = (sub1 + sub2 + sub3) / 3;

            // Output input by user
            System.out.println("Name: " + name + " \nSubject 1 marks : " + sub1 + "\nSubject 2 marks : " + sub2 +
                    "\nSubject 3 marks : " + sub3);
            // To get upto 2 decimal place we can use : %1.2f
            System.out.printf("Average of marks:%1.2f \n ", average);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }

}