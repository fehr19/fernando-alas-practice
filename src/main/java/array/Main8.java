package array;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        /*Read a line of text such as “I love Java. You love Java. She loves Java.”
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

        String[] inputArray = sentencesInput.replaceAll("\\p{Punct}", "").split("\\s+");


        //System.out.println(Arrays.toString(inputArray));

        //initialize tempArray same length as inputArray
        int a = inputArray.length;
        String[] tempArray = new String[a];


        for (int i = 0; i < a; i++) {

            //reset counter before next comparison iteration
            int counter = 0;

            //this loop should be int j = i; no need to run loops over and over
            //Once I figure out how to print each result once

            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i].equals(inputArray[j])) {
                    counter++;
                    tempArray[i] = inputArray[i];
                }
            }
            System.out.println("\"" + tempArray[i] + "\" occurs " + counter);
        }
        System.out.println(Arrays.toString(tempArray));
    }
}
