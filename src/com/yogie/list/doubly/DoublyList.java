package com.yogie.list.doubly;

/**
 * @program: DataStructure
 * @Description: 双向链表
 * @Author: Chenyogie
 * @Date: 2020/5/3 0:16
 */
public class DoublyList<T> {
    /**
     * 双向链表的头节点
     */
    private Node<T> first;
    /**
     * 双向链表的尾节点
     */
    private Node<T> last;
    /**
     * 双向链表的长度
     */
    private int length;

    /**
     * 双向链表的实际长度
     *
     * @return
     */
    public int size() {
        return length;
    }

    /**
     * 添加元素(在链表的末尾添加)
     *
     * @param t
     */
    public void add(T t) {
        addPosition(t,length);
    }

    /**
     * 在链表的头部添加元素
     *
     * @param t
     */
    public void addFirst(T t) {
        addPosition(t,0);
    }

    /**
     * 在链表的指定位置添加
     *
     * @param t        保存的元素
     * @param position 要保存到的索引位置（从0开始计数）
     */
    public void addPosition(T t, int position) {
        if (position > length || position < 0) {
            return;
        }
        if (first == null || length < 1) {//如果链表为空
            first = new Node<>(t);
        }
        if (position == 0) {//如果在链表头部插入
            Node<T> insert = new Node<>(t);
            insert.setNext(first);
            first.setPrevious(insert);
            first = insert;
        } else {//如果在链表头部或尾部（当position与length相等时，就在尾部插入）插入
            Node<T> previousNode = getNode(position - 1);
            Node<T> currentNode = getNode(position);
            Node<T> insertNode = new Node<>(t);
            previousNode.setNext(insertNode);
            insertNode.setPrevious(previousNode);
            if(currentNode!=null){//不是尾部插入才执行
                insertNode.setNext(currentNode);
                currentNode.setPrevious(insertNode);
            }
        }
        length++;
        //保存最后一个节点的位置
        Node<T> item = first;
        int temp = 0;
        while (item != null && temp < length-1) {
            item = item.getNext();
            temp++;
        }
        last = item;
    }

    /**
     * 获取指定位置的数据节点
     *
     * @param position
     * @return
     */
    private Node<T> getNode(int position) {
        if (position < 0 || position >= length) {
            return null;
        } else {
            Node<T> item = first;
            int temp = 0;
            while (item != null && temp < position) {
                item = item.getNext();
                temp++;
            }
            return item;
        }
    }

    /**
     * 删除指定索引位置的元素
     * @param position
     * @return
     */
    public T remove(int position){
        if (position < 0 || length == 0 || position > length - 1 ||  first == null  ) {
            return null;
        }
        if(position==0){//删除的是头结点
            T data = first.getData();
            Node<T> node = first.getNext();
            node.setPrevious(null);
            first = node;
            length--;
            last = getNode(length-1);
            return data;
        } else {
            Node<T> currentNode = getNode(position);
            T data = currentNode.getData();
            Node<T> previousNode = currentNode.getPrevious();
            Node<T> nextNode = currentNode.getNext();
            previousNode.setNext(nextNode);
            if(currentNode.getNext()!=null){//删除的是尾结点
                nextNode.setPrevious(previousNode);
                last = previousNode;
            }
            length--;
            return data;
        }
    }

    /**
     * 删除头节点
     * @return
     */
    public T removeFirst(){
        return remove(0);
    }

    /**
     * 删除尾节点
     * @return
     */
    public T removeLast(){
        return remove(length-1);
    }

    /**
     * 根据索引获取元素
     * @param index
     * @return
     */
    public T get(int index){
        return getNode(index).getData();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DoublyList:[");
        if (length == 0 || first == null) {
            sb.append(",");
        } else {
            Node<T> item = first;
            while (item != null) {
                sb.append(item.getData() + ",");
                item = item.getNext();
            }
        }
        int lastIndexOfMark = sb.lastIndexOf(",");
        return sb.replace(lastIndexOfMark, lastIndexOfMark + 1, "]").toString();
    }
}
