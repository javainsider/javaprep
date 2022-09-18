package com.javainsider.javaprep.simple;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums,target);
        int[] result2 = twoSumWithHashMap(nums,target);
        if(null!=result){
            System.out.println(" using Method 1 : ["+result[0] +","+result[1]+"]");
            System.out.println(" Using Method 2 : ["+result2[0] +","+result2[1]+"]");
        }

        else{
            System.out.println("Using method 1: " + result);
            System.out.println("Using method 2: " + result2);
        }


    }

    // O(n2)
    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i< nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j] == target -nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return  null;
    }

    // O(n)
    public static int[] twoSumWithHashMap(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
           map.put(nums[i], i);
        }
        System.out.println(map.size());
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) !=i ){
                return new int[]{i, map.get(complement)};
            }
        }
        return  null;
    }

}
