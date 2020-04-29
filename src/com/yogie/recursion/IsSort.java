package com.yogie.recursion;

/**
 * @program: DataStructure
 * @Description: 数组是否有序
 * @Author: Chenyogie
 * @Date: 2020/4/30 0:25
 * todo 数组越界异常未解决
 */
public class IsSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(isOrder(arr, 3));
    }

    /**
     * 给定一个数组，用递归的方法判定数组中的元素是否是有序的。
     * @param arr
     * @return
     */
    public static int isOrder(int[] arr,int index) {
        if(arr.length==1){
            return 1;
        }else{
            return (arr[index-1]<=arr[index-2])?0:isOrder(arr,index-1);
        }
    }

}
