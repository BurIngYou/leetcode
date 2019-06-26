package com.huyou.二分法;

/**
 * @author huyou
 * @ProjectName leetcode
 * @Description: TODO
 * @date 2019/5/28下午4:11
 *
 * Input : [1,2,3,4,5,6,7]
   key : 3
   return the index : 2
 */
public class 二分法 {


    public static void main(String agrs[]){

        int[] nums = {1,2,3,4,5,6,7};

        binarySearch(nums,7);

    }

    public static void binarySearch(int[] nums,int key){
        int high = nums.length-1;
        int low = 0;

        while (low<=high){
            int m =low+(high-low)/2;//中间下标

            if(nums[m] == key){
                System.out.println(m);
                return;
            }else if(nums[m]>key){

                high = m-1;
            }else{
                low = m+1;
            }



        }


    }
}


