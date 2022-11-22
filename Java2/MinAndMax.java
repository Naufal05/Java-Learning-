// Find the maximum and minimum number from the array

// public class MinAndMax {
//     public int max(int[] array) {
//         int max = 0;

//         for (int i = 0; i < array.length; i++) {
//             if (array[i] > max) {
//                 max = array[i];
//             }
//         }
//         return max;
//     }

//     public int min(int[] array) {
//         int min = array[0];

//         for (int i = 0; i < array.length; i++) {
//             if (array[i] < min) {
//                 min = array[i];
//             }
//         }
//         return min;
//     }

//     public static void main(String[] args) {
//         int[] myArray = { 23, 92, 56, 39, 93 };
//         MinAndMax m = new MinAndMax();
//         System.out.println("Maximum Number is " + m.max(myArray));
//         System.out.println("Minimum Number is " + m.min(myArray));

//     }
// }

public class MinAndMax {
    public static void main(String args[]) {
        int[] array = { 23, 92, 56, 39, 93 };
        int max = 0, min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);
    }
}
