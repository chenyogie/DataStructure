package com.yogie.list.doubly;

/**
 * @program: DataStructure
 * @Description: 双向链表的节点类型
 * @Author: Chenyogie
 * @Date: 2020/5/3 0:10
 */
public class Node<T> {
    private T data;
    private Node<T> previous;
    private Node<T> next;

    public Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
