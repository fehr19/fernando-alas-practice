package sba_core_java.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] myStringArrayTestValue = new String[]
                {"life", "is", "worth", "living", "with", "passion"};

        MyOperation myOperationObject = new MyOperation();
        myOperationObject.convertStringArrayIntoArrayList(myStringArrayTestValue);
        System.out.println(myOperationObject.getMyArrayList());

        myOperationObject.replaceAnElementInTheStringArrayListGiven(1);

        System.out.println(myOperationObject.getMyArrayList());

        Scanner scInput = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userIndex;

        if (scInput.hasNextInt()) {
            userIndex = scInput.nextInt();
            System.out.println(userIndex);
        } else {
        try {
            throw new MyOwnException("Invalid input please exit");
        } catch (MyOwnException e) {
            System.out.println(e.getMessage());
        }
    }

    }
}

interface IMyOperations {
    void convertStringArrayIntoArrayList(String[] stringArray);

    void replaceAnElementInTheStringArrayListGiven(int index);

    ArrayList<String> createANewArrayListFromExistingArray();
}

class MyOperation implements IMyOperations {
    ArrayList<String> myArrayList;

    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {
        for (String arrayListItem : stringArray) {
            myArrayList.add(arrayListItem);
        }

    }

    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {
        myArrayList.set(index, "Nah");
    }

    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        return null;
    }

    public MyOperation() {
        myArrayList = new ArrayList<>();
    }

    public ArrayList<String> getMyArrayList() {
        return myArrayList;
    }

    public void setMyArrayList(ArrayList<String> myArrayList) {
        this.myArrayList = myArrayList;
    }
}

class MyOwnException extends Exception {
    public MyOwnException(String invalidInteger) {
        super(invalidInteger);
    }
}

