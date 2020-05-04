package com.yogie.list.cycle;

/**
 * @program: DataStructure
 * @Description: 循环链表的节点数据结构
 * @Author: Chenyogie
 * @Date: 2020/5/3 15:01
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T t){
        this.data = t;
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
