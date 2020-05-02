package com.yogie.list.single;

/**
 * @program: DataStructure
 * @Description: 单向链表的数据节点
 * @Author: Chenyogie
 * @Date: 2020/4/30 0:48
 */
public class Node<T> {
    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
