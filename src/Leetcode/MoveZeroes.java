package Leetcode;

import com.paul.Utilities;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
    public static void main(String[] args){

        int[] A = new int[]{0,1,0,3,12};

        moveZeroes(A);
    }

    public static void moveZeroes(int[] nums){
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) {
                //What this does is the first time it finds a non zero number, it will set the first element of the array to the non zero number and increment the insertPos variable
                //This means that all zeroes should be replaced successfully with the next non zero number found
                nums[insertPos++] = num;
            }
        }

        Utilities.printArray(nums);
        System.out.println("Inset number: " + insertPos);

        //At the end we then put the relevant amount of 0s at the end of the array.
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        Utilities.printArray(nums);

    }
}
