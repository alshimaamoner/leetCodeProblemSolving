package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nums[]={1,1,2,2,3};
        int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        //If array Not sorted
//        int i=0;
//        Map<Integer,Integer> test=new TreeMap<>();
//        for(int j=0;j<nums.length;j++){
//            test.put(nums[j],nums[j]);
//        }
//        for (Map.Entry<Integer, Integer> entry : test.entrySet()) {
//            nums[i]=entry.getKey();
//            i++;
//        }
//        return   test.size();
        //If array sorted you can use
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==nums[j])
               continue;
            nums[++i]=nums[j];
        }
        return i+1;

    }
}
