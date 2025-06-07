//Two sum
//Given an array of integers, find two numbers  that add up to a specific target.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length-1; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
               return new int[] { map.get(complement),i};
            }
            map.put(nums[i], i);
        }
       // throw new IllegalAccessException("No solution found");
        return new int[]{};
    }

    public static void main(String[] args){
        int nums[]= {2,7,8,5};
        int target=9;
        int[] result = twoSum(nums,target);
        System.out.println("Result: ["+ nums[0]+"," +nums[1]+"]");
    }
}
