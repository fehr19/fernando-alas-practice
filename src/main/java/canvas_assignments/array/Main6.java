package canvas_assignments.array;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        /* Write a program where you create an integer canvas_assignments.array
        of 5 numbers. Loop through the canvas_assignments.array and assign the
        value of the loop control variable multiplied by 2
        to the corresponding index in the canvas_assignments.array. */

        int[] myDoubledArray = new int[5];

        for (int i = 0; i < 5; i++) {
            myDoubledArray[i] = i * 2;
        }

        System.out.println(Arrays.toString(myDoubledArray));
    }
}
