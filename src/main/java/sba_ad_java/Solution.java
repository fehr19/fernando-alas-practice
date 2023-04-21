package sba_ad_java;
//// <<<<<======== Click here to expand the locked stub code
import java.util.*;

interface MyList{
    void convert(String[] a);
    void replace(int idx);
    ArrayList<String> compact();
}
/*
This is here only for visibility. Please do not take the code below out of the comments.
import java.util.*;

interface MyList{
 void convert(String[] a);
 void replace(int idx);
 ArrayList<String> compact();
}

This is here only for visibility. Please do not take the code above out of the comments.
*/

// ================ PLEASE WRITE CODE HERE =============

//Write your implementation of the InvalidStringException and the ArrayToList classes below

class InvalidStringException extends Exception{
    InvalidStringException(String message) {
        super.getMessage();
    }

}

class ArrayToList implements MyList{
    ArrayList<String> arrayToList;

    void arrayToList() {
        arrayToList = new ArrayList<>();
    }

    @Override
    public void convert(String[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            arrayToList.set(i, a[i]);

            System.out.println("I have added the string: " +
                    a[i] + " at the index " + i);
        }
    }

    @Override
    public void replace(int idx) {
        System.out.println("I have replaced the string: " +
                arrayToList.get(idx) + "with a null string");
        arrayToList.set(idx, "");
    }

    @Override
    public ArrayList<String> compact() {
        arrayToList.remove("");
        return arrayToList;
    }
}






// <<<<<======== Click here to expand the locked stub. Please take a look at the locked stub code to better understand how your implementation of the required classes will be validated.
//PlEASE DO NOT ATTEMPT TO MODIFY THE CODE BELOW !!!!!!.
public class Solution{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);

        int n = Integer.parseInt(sc.nextLine());
        String[] a = new String[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextLine();

        MyList obj = new ArrayToList();

        obj.convert(a);
        int x = rand.nextInt(n);
        for(int i = 0; i < x; i++)
            obj.replace(rand.nextInt(n));


        ArrayList<String> s = obj.compact();



        for (int i = 0; i < s.size(); i++){
            if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
                try{
                    throw new InvalidStringException("This is an invalid string");
                }
                catch(InvalidStringException e){System.out.println(e.getMessage());}
            }
        }


    }
}