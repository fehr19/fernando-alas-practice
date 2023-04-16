package canvas_labs.arraylist_and_methods;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        //Removing the element at an index
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);

        //Remove the first occurrence of the given element
        //The remove() method returns false if the element does not exist
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove (\"Kotlin\"): " + programmingLanguages);

        //Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        //Remove all elements
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
}
