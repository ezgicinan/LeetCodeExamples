package com.company;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> newSet = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            if(newSet.contains(nums[i])){
                return true;
            }
            newSet.add(nums[i]);
        }
        return false;
    }

    public static void main(String[]args){

        int[] nums = {1, 2, 3, 4, 1, 5};
        System.out.println("result is " + containsDuplicate(nums));
    }
}
