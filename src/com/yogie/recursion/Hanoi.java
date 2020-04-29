package com.yogie.recursion;

/**
 * @program: DataStructure
 * @Description: 汉诺塔问题
 * @Author: Chenyogie
 * @Date: 2020/4/29 23:40
 */
public class Hanoi {

    public static void main(String[] args) {
        hanoi(3,'A','C','B');
    }

    /**
     * 有三根杆(编号A、B、C)，在A杆自下而上、由大到小按顺序放置n个金盘。
     * 游戏的目标：把A杆上的金盘全部移到C杆上，并仍保持原有顺序叠好。
     * 操作规则：
     * (1)每次只能移动一个盘子;
     * (2)在移动过程中三根杆上都始终保持大盘在下，小盘在上;
     * (3)操作过程中盘子可以置于A、B、C任一杆上。
     *
     * @param n 盘子的个数
     */
    public static void hanoi(int n,char source,char target,char temp) {
        if(n==1){
            move(n,source,target);
        }else{
            //用B作为辅助杆，将A杆上方n-1个盘子移动到B杆
            hanoi(n-1,source,temp,target);
            //移动A杆上最大的盘子到C杆
            move(n,source,target);
            //移动剩下的n-1个盘子
            hanoi(n-1,temp,target,source);
        }
    }

    /**
     * 移动盘子的方法
     * @param n 盘子的编号
     * @param source 盘子的起始位置
     * @param target 盘子的目标位子
     */
    public static void move(int n,char source,char target) {
        System.out.println("将"+n+"号盘子从"+source+"杆移动到"+target+"杆");
    }


}
