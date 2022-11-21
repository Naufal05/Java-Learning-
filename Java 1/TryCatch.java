import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nNum1, nNum2, nSum;
        try {
            System.out.println("ENTER THE FIRST NUMBER: ");
            nNum1 = input.nextInt();
            System.out.println("ENTER THE SECOND NUMBER: ");
            nNum2 = input.nextInt();

            nSum = nNum1 + nNum2;
            System.out.println("SUM OF THE NUMBER IS: " + nSum);
        } catch (Exception e) {
            System.out.println("Please Enter the integer value only !");
        }

        input.close();
    }

}