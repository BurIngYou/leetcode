package com.huyou.两个栈实现一个队列;

import java.util.Stack;

/**
 * @author huyou
 * @ProjectName leetcode
 * @Description: 两个栈实现一个队列
 * @date 2019/6/26下午2:33
 */
public class Queue {

    private  static Stack<String> stack1 = new Stack<>();

    private static Stack<String> stack2 = new Stack<>();

    public static void main(String[] args) {

        pop("1");

        pop("2");

        pop("3");

        System.out.println(push());//1

        pop("4");
        pop("5");
        System.out.println(push()); //2


    }
    public static void  pop(String param){

         stack1.push(param);


    }


    public static String push(){

        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }

//        while(!stack2.empty()){
//            System.out.println(stack2.pop());
//            return push();
//        }

        return stack2.pop();









    }
}
