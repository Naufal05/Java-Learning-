
public class Method3 {
    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    // non static
    int div(int a, int b) {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {

        int sum1 = multiply(3, 4);
        int sum2 = multiply(4, 4);
        int sum3 = multiply(5, 5);

        Method3 mj = new Method3();
        int div1 = mj.div(6, 3);
        System.out.println(div1);
    }
}