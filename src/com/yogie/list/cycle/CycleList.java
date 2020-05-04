package com.yogie.list.cycle;

/**
 * @program: DataStructure
 * @Description: 循环链表：循环链表没有结束标志。
 * 单向链表和双向链表的结束标志是：last.getNext()==null
 * @Author: Chenyogie
 * @Date: 2020/5/3 15:04
 */
public class CycleList<T> {
    /**
     * 循环链表没有真正意义上的头结点和尾节点
     */
    private Node<T> first;
    /**
     * 循环链表的长度
     */
    private int length;

    /**
     * 返回链表的长度:遍历循环链表直到节点回到开始的节点
     * @return
     */
    public int size(){
        int length = 0;
        Node<T> current = first;
        while (current!=null){
            length++;
            current = current.getNext();
            if(current==first){
                break;
            }
        }
        return length;
    }

    /**
     * 添加一个节点到环形链表中
     * @param t
     */
    public void add(T t){
        if(length==0 || first==null){
            first = new Node<>(t);
            first.setNext(first);
            length++;
        }else{
            Node<T> currentNode = first;
            while (currentNode.getNext()!=first){
                currentNode = currentNode.getNext();
            }
            Node<T> insert = new Node<>(t);
            currentNode.setNext(insert);
            insert.setNext(first);
            length++;
        }
    }

    /**
     * 删除末尾节点
     * @return
     */
    public T remove(){
        if(length==0 || first==null){
            return null;
        }else {
            Node<T> current = first;
            Node<T> temp = first; //记录当前节点的上一个节点
            while (current.getNext()!=first){
                temp = current;
                current = current.getNext();
            }
            temp.setNext(first);
            return current.getData();
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CycleList:[");
        if (length == 0 || first == null) {
            sb.append(",");
        } else {
            Node<T> item = first;
            while (item != null) {
                sb.append(item.getData() + ",");
                item = item.getNext();
                if(item==first) break;
            }
        }
        int lastIndexOfMark = sb.lastIndexOf(",");
        return sb.replace(lastIndexOfMark, lastIndexOfMark + 1, "]").toString();
    }
}
