package com.yogie.list.single;

/**
 * @program: DataStructure
 * @Description: 单向链表
 * @Author: Chenyogie
 * @Date: 2020/4/30 0:49
 */
public class SingleList<T> {
    private Node first;
    private int length;

    /**
     * 获取链表的第一个节点
     * @return
     */
    public Object getFirst(){
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



    public static void main(String[] args) {
        SingleList<Integer> singleList = new SingleList();
        singleList.addFirst(1);
        singleList.addFirst(3);
        singleList.addFirst(10);
        System.out.println(singleList.getFirst());
        System.out.println(singleList.length);
    }

}
