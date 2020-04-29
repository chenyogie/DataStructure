package com.yogie.recursion;

/**
 * @program: DataStructure
 * @Description: 阶乘
 * @Author: Chenyogie
 * @Date: 2020/4/29 23:14
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    /**
     * 求n的阶乘
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        //这里写n<=0的原因有两个：
        //  1.在数学中，n=1的阶乘是1，n=0的阶乘也是1
        //  2.在做超卖的功能时，终止条件不建议写n==0，而建议写n<0
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }
}
