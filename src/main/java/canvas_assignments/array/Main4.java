package canvas_assignments.array;

public class Main4 {
    public static void main(String[] args) {
        /*Write a program that creates an integer canvas_assignments.array with 5 elements
        (i.e., numbers). The numbers can be any integers.
        Print out the value at the first index and the last index
        using length - 1 as the index. Now try printing the value at
        index = length ( e.g., myArray[myArray.length ] ).  Notice the
        type of exception which is produced. Now try to assign a value
        to the canvas_assignments.array index 5. You should get the same type of exception.
         */

        int[] myIntArray = {3, 5, 6, 2, 7};
        System.out.println("First index value: " + myIntArray[0]);
        System.out.println("Last index value: " + myIntArray[myIntArray.length - 1]);


    }
}
