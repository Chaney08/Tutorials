package Leetcode;

import com.paul.*;

import java.util.HashMap;
import java.util.Map;

//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class SingleNumber {

    public static void main(String[] args){

        int[] A = new int[]{5,3,2,2,1,4,3,5,1,0,4};

        int singleNumber = quickSingleNumber(A);

        System.out.println(singleNumber);
    }

    //My solution was terrible in reality - XOR works instead with a simple run through
    public static int singleNumber(int[] nums) {

        Map<Integer,Integer> checkForSingle = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){
            if(checkForSingle.containsKey(nums[i])){
                checkForSingle.remove(nums[i]);

            }else{
                checkForSingle.put(nums[i],i);
            }
        }

        return checkForSingle.entrySet().iterator().next().getKey();
    }

    public static int quickSingleNumber(int[] nums){
        int result =0;

        for(int i=0; i < nums.length; i++){
            result ^= nums[i];
        }

        return result;
    }
}

