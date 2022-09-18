package com.javainsider.javaprep.simple;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int nums1[] = {1,2,21,3,4,21};
        System.out.println("Method 1---->>"+ isDuplicateFound(nums1));

        int nums2[] = {1,2,22,3,4,22};
        System.out.println("Method 2---->>"+ isDuplicateFound2(nums1));
    }

    public static boolean isDuplicateFound(int[] nums){

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j]==nums[i]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDuplicateFound2(int[] nums){
        Arrays.sort(nums);
        for(int i=0; i<nums.length -1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
