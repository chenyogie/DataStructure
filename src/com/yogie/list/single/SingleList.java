package com.yogie.list.single;

/**
 * @program: DataStructure
 * @Description: 单向链表
 * @Author: Chenyogie
 * @Date: 2020/4/30 0:49
 */
public class SingleList<T> {
    private Node<T> first;
    private int length;
    private Node<T> current;

    /**
     * 获取链表的第一个节点
     * @return
     */
    public T getFirst(){
        if (first==null) return null;
        return first.getData();
    }

    /**
     * 在链表的最前面添加元素
     * @param t
     */
    public void addFirst(T t){
        if(length==0 || first == null){
            first = new Node(t);
        }else{
            Node insert = new Node(t);
            insert.setNext(this.first);
            this.first = insert;
        }
        length++;
    }

    /**
     * 在链表尾部添加元素
     * @param t
     */
    public void addLast(T t){

    }

    /**
     * 随机选择一个位置添加
     */
    public void addRandom(T t){

    }

    /**
     * 指定位置插入
     * @param t
     * @param position
     */
    public void addPosition(T t,int position){

    }

    /**
     * 删除第一个节点的元素
     * @return
     */
    public T removeFirst(){
        return null;
    }

    /**
     * 删除最后一个节点的元素
     * @return
     */
    public T removeLast(){
        return null;
    }

    /**
     * 删除指定位置的节点
     * @return
     */
    public T removePosition(int position){
        return null;
    }

    /**
     * 获取链表的长度
     * @return
     */
    public int size(){
        return 0;
    }

    /**
     * 遍历打印链表
     * @return
     */
    @Override
    public String toString() {
        return null;
    }

    public static void main(String[] args) {
        SingleList<Integer> singleList = new SingleList();
        singleList.addFirst(1);
        singleList.addFirst(3);
        singleList.addFirst(10);
        System.out.println(singleList.getFirst());
        System.out.println(singleList.length);
    }

}
