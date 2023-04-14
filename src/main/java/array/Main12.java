package array;

import java.util.Arrays;
import java.util.Scanner;


public class Main12 {
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


        //initialize tempArray same length as inputArray
        int a = inputArray.length;
        String[] tempArray = new String[a];
        //tempArray[0] = inputArray[0];
        int[] wordCount = new int[a];
        int tempArrayCount = 0;


        for (int i = 0; i < a; i++) {

            System.out.println(linearSearch(inputArray, inputArray[i]));
            if (linearSearch(inputArray, inputArray[i]) == 1) {
                tempArray[tempArrayCount] = inputArray[i];

            }

        }

        System.out.println(Arrays.toString(tempArray));



        /*for (int i = 0; i < a; i++) {

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
        }*/

    }

    public static int linearSearch(String[] arr, String key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                count++;
            }
        }
        return count;
    }

}