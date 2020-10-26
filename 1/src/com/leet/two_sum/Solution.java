package com.leet.two_sum;

import java.util.Hashtable;

public class Solution {
//    public int[] twoSum(int[] nums,int target){
//        if(nums.length<2){
//            System.out.println("Length of nums must be greater than 2");
//            return  null;
//        }
//
//        if(target<=0) {
//            System.out.println("target must be greater than 1");
//        }
//
//        for(int i=0; i< nums.length;i++){
//            for(int j = i+1;j<nums.length;j++){
//                int a = nums[i];
//                int b = nums[j];
//                if(target==(a+b)){
//                    return  new int[]{i,j};
//                }
//            }
//        }
//        return  null;
//    }
    public int[] twoSum(int[] nums,int target){
        Hashtable<Integer,Integer> t =new Hashtable<Integer, Integer>();
        for(int i=0; i< nums.length;i++){

            if(t.containsKey(target-nums[i])){
                return new int[]{t.get(target-nums[i]),i};
            }else {
                t.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{2,7,11,15};
        s.twoSum(nums,9);
    }
}
