package array;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        /*Read a line of text such as “I love Java.  You love Java. She loves Java.”
        Split them into words. Count number of times each word (excluding dot .) occurs
        So the end result is something like following:
        "I" occurs once
        "love" occurs twice
        "Java" occurs 3 times
        "You" occurs once
        "She" occurs once
        "loves" occurs once */

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter 2-3 short sentences: ");
        String sentencesInput = sc.nextLine();

        String[] inputArray = sentencesInput.split("\\s+");

        System.out.println(Arrays.toString(inputArray));

        for (int i = 0; i < inputArray.length; i++) {
            String tempString = inputArray[i];
            for(int j = 0; j < inputArray.length - 1; j++);
            int counter = 0;
            if (tempString == inputArray[i + 1] ) {
                counter = counter++;

            }
            System.out.println("\"" + tempString + "\" occurs " + counter);


        }

    }
}
