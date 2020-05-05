package com.yogie.list.question;

import com.yogie.list.single.Node;
import com.yogie.list.single.SingleList;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: DataStructure
 * @Description: 找到链表的倒数第n个节点
 * @Author: Chenyogie
 * @Date: 2020/5/5 2:51
 */
public class TheNthNode {

    public static void main(String[] args) {

    }

    /**
     * 通过求链表的长度来实现：
     * 1. 首先遍历链表，求出链表的总长度M;
     * 2. 然后求倒数第n个节点的索引：M-n;
     * 3. 再次遍历链表，返回M-n位置的节点。
     *
     * @param n
     * @return
     */
    public static Node getByLength(int n) {
        return null;
    }

    /**
     * 通过map来实现：
     * 1. 首先遍历链表，将节点的位置和对应的节点存储到map结构中；
     * 2. map的key存链表节点的索引，value存节点，存储后总数M即可知。
     * 3. 计算M-n的值并作为key取出对应的value即可。
     *
     * @param n
     * @return
     */
    public static Node getByMap(int n) {
        Map<Integer, Node> map = new HashMap<>();
        return null;
    }

    /**
     * 通过双指针的方式来实现：
     * 1. 使用两个指针p1、p2，两个指针都指向链表的头结点。
     * 2. 当p1沿着链表进行了n次移动之后，p2才开始移动。
     * 3. 当p1移动到了链表的尾部，p2指向的位置就是倒数第n个节点的位置。
     *
     * @param list
     * @param n
     * @return
     */
    public static Node getByBoublePointer(SingleList list, int n) {
        Object first = list.getFirst();
        return null;
    }
}
