package com.yogie.list.single;

import java.util.Random;

/**
 * @program: DataStructure
 * @Description: 单向链表
 * @Author: Chenyogie
 * @Date: 2020/4/30 0:49
 */
public class SingleList<T> {
    /**
     * 单向链表的头结点
     */
    private Node<T> first;
    /**
     * 单向链表的最后一个结点
     */
    private Node<T> last;
    /**
     * 单向链表的实际结点数（长度）
     */
    private int length;

    /**
     * 获取链表的第一个节点
     *
     * @return
     */
    public T getFirst() {
        if (length == 0 || first == null) return null;
        return first.getData();
    }

    /**
     * 在链表的最前面添加元素
     *
     * @param t
     */
    public void addFirst(T t) {
        if (length == 0 || first == null) {
            first = new Node(t);
            last = first;
        } else {
            Node insert = new Node(t);
            insert.setNext(this.first);
            this.first = insert;
        }
        length++;
    }

    /**
     * 在链表尾部添加元素(按顺序添加)
     *
     * @param t
     */
    public void add(T t) {
        if (length == 0 || first == null) {
            first = new Node(t);
            last = first;
        } else {
            Node insert = new Node(t);
            last.setNext(insert);
            last = insert;
        }
        length++;
    }

    /**
     * 随机选择一个位置添加
     *
     * @param t
     */
    public void addRandom(T t) {
        int index = new Random().nextInt(length);
        if (index == 0) {
            addFirst(t);
        } else if (index == length) {
            add(t);
        } else {
            addPosition(t, index);
        }
    }

    /**
     * 指定位置插入
     *
     * @param t
     * @param position 指定的位置，必须大于等于0，小于等于数组的长度-1
     */
    public void addPosition(T t, int position) {
        if (position < 0 || position >= length) {
            return;
        } else if (position == 0) {
            addFirst(t);
        } else if (position == length-1) {
            add(t);
        } else {
            Node insert = new Node(t);
            Node<T> previous = getNode(position - 1);
            Node<T> current = getNode(position);
            previous.setNext(insert);
            insert.setNext(current);
            length++;
        }
    }

    /**
     * 删除第一个节点的元素
     *
     * @return 返回节点元素的值
     */
    public T removeFirst() {
        if (first == null || length == 0) {
            return null;
        } else {
            T data = first.getData();
            first = first.getNext();
            length--;
            return data;
        }
    }

    /**
     * 删除最后一个节点的元素
     *
     * @return
     */
    public T removeLast() {
        if (first == null || length == 0) {
            return null;
        } else {
            Node<T> node = getNode(length - 1);
            node.setNext(null);
            last = node;
            length--;
            return last.getData();
        }
    }

    /**
     * 删除指定位置的节点,索引从0开始计数
     *
     * @return
     */
    public T removePosition(int position) {
        if (position < 0 || position >= length) {
            return null;
        } else {
            int temp = 0;
            Node<T> item = first;
            while (item != null && temp <= position - 1) {
                item = item.getNext();
                temp++;
            }
            length--;
            return item.getData();
        }
    }

    /**
     * 获取链表的长度
     *
     * @return
     */
    public int size() {
        return length;
    }

    /**
     * 获取指定位置的链表结点,索引从0开始计数
     *
     * @param index
     * @return
     */
    private Node<T> getNode(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else {
            Node<T> item = first;
            int temp = 0;
            while (item != null && temp < index) {
                item = item.getNext();
                temp++;
            }
            return item;
        }
    }

    /**
     * 获取指定位置的元素,索引从0开始计数
     *
     * @param index
     * @return
     */
    public T get(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else {
            Node<T> item = first;
            int temp = 0;
            while (item != null && temp < index) {
                item = item.getNext();
                temp++;
            }
            return item.getData();
        }
    }

    /**
     * 遍历打印链表
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SingleList:[");
        if (length == 0 || first == null) {
            sb.append(",");
        } else {
            Node item = first;
            while (item != null) {
                sb.append(item.getData() + ",");
                item = item.getNext();
            }
        }
        int lastIndexOfMark = sb.lastIndexOf(",");
        return sb.replace(lastIndexOfMark, lastIndexOfMark + 1, "]").toString();
    }
}
