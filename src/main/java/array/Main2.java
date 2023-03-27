package array;

public class Main2 {
    public static void main(String[] args) {
        /*Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2}
        and produce the following output: 7
         */

        int[] arraySample = {13, 5, 7, 68, 2};
        int middleValue = (arraySample.length / 2);
        System.out.println(arraySample[middleValue]);
    }
}
