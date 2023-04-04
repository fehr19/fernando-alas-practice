package array;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        /* Write a program that creates a String array
        of 5 elements and swaps the first element
        with the middle element without creating a new array. */

        int[] swapIndexArray = {3, 2, 1, 4, 5};
        indexSwap(swapIndexArray, 0, 2);

        System.out.println(Arrays.toString(swapIndexArray));
    }

    public static int[] indexSwap(int[] swapArray, int x, int y) {
        int tempInt = swapArray[x];
        swapArray[x] = swapArray[y];
        swapArray[y] = tempInt;
        return swapArray;
    }
}

