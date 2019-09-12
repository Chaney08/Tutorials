package Leetcode;

import java.util.HashSet;
import java.util.Set;

//Given an array of integers, find if the array contains any duplicates.
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
public class ContainsDuplicate {
    public static void main(String[] args){

//        int[] A = new int[]{5,3,2,2,1,4,3,5,1,0,4};
        int[] A = new int[]{1,2,3};

        boolean nonUnique = checkDuplicates(A);

        System.out.println(nonUnique);
    }

    public static boolean checkDuplicates(int[] A){
        Set<Integer> distinctInteger = new HashSet<Integer>();

        for(int num : A){
            if(distinctInteger.contains(num)){
                return true;
            }else{
                distinctInteger.add(num);
            }
        }

        return false;
    }
}
