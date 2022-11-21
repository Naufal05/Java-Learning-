public class IntOps {
    public static void main(String[] args) {
        int a = 10;
        int b = -3;
        int sum = a + b;
        int prod = a * b;
        int quot = a / b;
        int rem = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);
    }
}
