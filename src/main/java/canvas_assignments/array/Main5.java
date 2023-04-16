package canvas_assignments.array;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        /* Write a program where you create an integer canvas_assignments.array with
        a length of 5. Loop through the canvas_assignments.array and assign the value
        of the loop control variable (e.g., i) to the corresponding
        index in the canvas_assignments.array. */

        int[] arrayInt = new int[5];

        for (int i = 0; i < 5; i++) {
            arrayInt[i] = i;
        }

        System.out.println(Arrays.toString(arrayInt));

    }
}
