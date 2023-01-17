package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class singleNumber {

    //Method 1: Use hashset to add elements and remove when you see duplicate. O(N) space complexity
    public static int findSingle(int[]nums){

        if(nums.length == 1) return nums[0];

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i:nums){
            if(!hashSet.add(i)){
                hashSet.remove(i);
            }
        }

        Iterator<Integer> iterator = hashSet.iterator();

        return iterator.next();
    }

    //Method 2: Use bit manipulation, XOR. Default number 0 because it gives the given number itself after XOR.
    public static int findSingle2(int[]nums){
        int result = 0;

        for(int i:nums){
            result  = result^i;
        }
        return result;
    }

    public static void main(String[]args){

        int[] nums = {1,2,1};
        System.out.println("result is " + findSingle(nums));
        System.out.println("result2 is " + findSingle2(nums));
    }
}
