// METHOD RETURN TYPE

// create method
public class Method2 {
    public static int square(int num) {
        // return statement
        return num * num;
    }

    public static void main(String[] args) {
        int result;

        // call the method
        // store the return value to the result
        result = square(10);
        System.out.println("Squared value of 10 is:" + result);
    }
}
