package Leetcode;

import static com.paul.Utilities.printArray;

public class RemoveDuplicates {
//    Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
    public static void main(String[] args) {
        int[] A = new int[]{1,1,1,2,3};
        int result = removeDuplicates(A);

        System.out.println(result);
    }

    public static int removeDuplicates(int[] array){
        int i = 0;
        for (int n : array)
            if (i == 0 || n > array[i-1])
                array[i++] = n;

        printArray(array);

        return i;
    }

}
