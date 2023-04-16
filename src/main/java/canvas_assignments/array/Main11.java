package canvas_assignments.array;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Main11 {
    public static void main(String[] args) {
        /* Write some Java code that asks the user how many favorite
        things they have. Based on their answer, you should create
        a String canvas_assignments.array of the correct size. Then ask the user to enter
        the things and store them in the canvas_assignments.array you created. Finally,
        print out the contents of the canvas_assignments.array. */

        Scanner sc = new Scanner(System.in);
        //Ask user for number of things to be entered
        System.out.print("How many favorite things do you have? ");
        int userFavs = sc.nextInt();
        sc.nextLine();

        //Create user defined canvas_assignments.array
        String[] customArray = new String[userFavs];

        // Loop to ask user for number of things they specified
        for (int i = 0; i < userFavs; i++) {
            System.out.print("Enter thing " + (i + 1) + ": ");
            customArray[i] = sc.nextLine();
        }
        //Print out user's favorite things
        System.out.println("Your favorite things are: ");
        for (String favorite : customArray) {
            System.out.print(favorite + " ");
        }
    }
}
