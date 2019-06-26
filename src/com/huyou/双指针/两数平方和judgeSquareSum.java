package com.huyou.双指针;

/**
 * @author huyou
 * @ProjectName leetcode
 * @Description: TODO
 * @date 2019/5/27下午3:01
 *  Input: 5
    Output: True
    Explanation: 1 * 1 + 2 * 2 = 5
 * 题目描述：判断一个数是否为两个数的平方和。
 */

public class 两数平方和judgeSquareSum {

    public static void main(String agrs[]){
        judgeSquareSum(100);

    }

    public static boolean judgeSquareSum(int res){
        boolean flag = false;
        //找到接近的平方数
        int  i = 0;
        int j =  (int)Math.sqrt(res);
        while (i<j){
            int sum = i*i + j*j;
            if(sum==res){
                flag = true;
                break;
            }else  if(sum<res){
                i++;
            }else {
                j--;
            }

        }

        System.out.println(flag+" i="+i+" j="+j);
        return flag;
    }
}
