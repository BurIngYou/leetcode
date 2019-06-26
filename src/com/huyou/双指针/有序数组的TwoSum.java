package com.huyou.双指针;

/**
 * @author huyou
 * @ProjectName leetcode
 * @Description: TODO
 * @date 2019/5/24下午5:02
 *
 *  Input: numbers={2, 7, 11, 15}, target=9
    Output: index1=1, index2=2
    题目描述：在有序数组中找出两个数，使它们的和为 target。
 */
public class 有序数组的TwoSum {

    public static void main(String[] args) {

            int[]  numbers={2, 7, 11, 15};

            find(numbers,9);

        }


    //双指针
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    public static void find(int[] numbers,int target){
        int index1;
        int index2;
        int maxInd = 0;//找出小于9 最接近9的值下表
        for(int i = 0;i<numbers.length;i++){
           int findMax = numbers[i];
           if(findMax> 9){
               maxInd =  i--;
               break;
           }

        }

        for(int j=0;j<=maxInd;j++){
            index1 = numbers[j];
         for (int k=j+1;k<=maxInd;k++){
             index2 = numbers[k];
             if((index2+index1)==9){
                 System.out.println("index1="+index1+", index2="+index2);
                return;
             }

         }

        }

    }

}
