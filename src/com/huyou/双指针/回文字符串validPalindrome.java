package com.huyou.双指针;

/**
 * @author huyou
 * @ProjectName leetcode
 * @Description: TODO
 * @date 2019/5/27下午3:19
 *  回文字符串 ： 就是一个正读和反读都一样的字符串
 *  Input: "abca"
    Output: True
    Explanation: You could delete the character 'c'.
    题目描述：可以删除一个字符，判断是否能构成回文字符串。

 */
public class 回文字符串validPalindrome {


    public static void main(String agrs[]){


        validPalindrome("qtwerrewq");
    }

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            char a = s.charAt(i++);
            char b = s.charAt(j--);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

}
