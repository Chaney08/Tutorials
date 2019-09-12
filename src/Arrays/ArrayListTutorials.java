package Arrays;

import java.util.ArrayList;

public class ArrayListTutorials {
    public static void main(String [] args){
        ArrayList<String> newArray = new ArrayList<String>();

        newArray.add("Hello");
        newArray.add("World");

        newArray.stream()
                .forEach(System.out::println);

        newArray.add(1,"Test");

        newArray.stream()
                .forEach(System.out::println);

        newArray.add(1,"SecondTest");

        System.out.println("Filtering");
        newArray.stream()
                .filter(x -> x.contains("Test"))
                .forEach(System.out::println);


    }
}
