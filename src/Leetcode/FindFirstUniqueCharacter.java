package Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstUniqueCharacter {
    public static void main(String[] args){
        String s = "leetcode";

        System.out.println(getFirstNotRepeatedChar(s));

    }

    static int getFirsUniqueCharacterIndex(String s){

        for(Character ch: s.toCharArray()){
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return s.indexOf(ch);
            }
        }

        return -1;
    }

    //Not entirely sure what this is doing tbh
    public static char findFirstNonRepChar(String string) {
        Map<Integer,Long> characters = string.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return (char)(int)characters.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("No unrepeated character"));
    }

    public static Character getFirstNotRepeatedChar(String input) {

        int[] flags = new int[256];

        for (int i = 0; i < input.length(); i++) { // O(n)
            //
            flags[(int)input.charAt(i)]++ ;
        }
        System.out.println("Test:" + flags.length);
        printArray(flags);

        for (int i = 0; i < input.length(); i++) { // O(n)
            if(flags[(int)input.charAt(i)] > 0)
                return input.charAt(i);
        }

        return null;
    }


    public static void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(anArray[i]);
        }
    }
}
