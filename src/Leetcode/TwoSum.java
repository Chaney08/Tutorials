package Leetcode;

import com.paul.*;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target. - Will only be exactly one solution
public class TwoSum {

    public static void main(String[] args){

        int[] A = new int[]{2, 7, 12, 15};
        int target = 9;



       Utilities.printArray(bestTwoSum(A,target));
    }

    //Brute force approach - Not recommended
    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;

                }
            }
        }
        return index;
    }

    //Optimized result - Best answer
    //Full explanation of this: https://www.youtube.com/watch?v=K3nlUSPEvfU
    public static int[] bestTwoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            //What this does is check if the target - the array number is already present in map - If not, add it to map with index number and go to next number;
            //For example, using the above numbers - It will check if 9-2(7) is present is already in the map - It is not so it will add 2 to the map
            //Next time if will check if (9-7) is in the map - It is, which means that we have found our answer as 7+2 = 9.
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            System.out.println(i+1);
            map.put(nums[i], i);
        }
        return result;
    }
}
