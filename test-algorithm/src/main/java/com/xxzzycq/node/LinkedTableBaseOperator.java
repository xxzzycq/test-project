package com.xxzzycq.node;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public class LinkedTableBaseOperator {
    // 从头插入一个节点
    public static Node addNodeAsHead(Node head, Object data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }

    // 从尾部插入一个节点
    public static void addNode(Node head, Object data) {
        Node node = new Node(data);
        if (head == null)
            head = node;
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    // 删除第index个节点
    public static boolean deleteNode(Node head, int index) {
        if (index <1 || index > getLength(head))
            return false;
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 1;
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (i == index) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
            i++;
        }
        return false;
    }


    // 删除值为data的所有节点，返回删除的个数
    public static int deleteNode(Node head, Object data) {
        if (head == null || data == null)
            return 0;
        int count = 0;
        if (head.data == data)
            count++;
        Node prev= head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.data == data) {
                prev.next = curr.next;
                count++;
            }
            prev = curr;
            curr = curr.next;
        }
        return count;
    }

    // 获取链表的长度
    public static int getLength(Node head) {
        int length = 0;
        Node tmpNode = head;
        while (tmpNode != null) {
            length++;
            tmpNode = tmpNode.next;
        }
        return length;
    }

    // 删除整个链表所有节点
    public static void deleteAll(Node head) {

    }

    // 单链表变成双链表
    public static DbNode toDblinkedTable(Node head) {
        return null;
    }

    // 合并两个有序的链表
    public static Node mergeLinkedTable(Node head1, Node head2) {
        return null;
    }

    /**
     * 查找单链表的中间节点
     *
     * @param head
     * @return
     */
    public Node SearchMid(Node head) {
        return null;
    }

    /**
     * 查找倒数 第k个元素
     * @param head
     * @param k
     * @return
     */
    public Node findElem(Node head, int k) {
        return null;
    }

    /**
     * 对链表进行排序
     *
     * @param head
     * @return
     */
    public Node orderList(Node head) {
        return null;
    }

    /**
     * 删除链表中重复的数据的节点
     *
     * @param head
     */
    public void deleteDuplecate(Node head) {
        Node p = head;
        while (p != null) {
            Node q = p;
            while (q.next != null) {
                if (p.data == q.data) {
                    q.next = q.next.next;
                } else {
                    q =q.next;
                }
                p = p.next;
            }
        }
    }

    /**
     * 判断链表是否有环，有环情况下找出环的入口节点
     *
     * @param head
     * @return
     */
    public boolean IsLoop(Node head) {
        return true;
    }

    /**
     * 找出链表环的入口
     *
     * @param head
     * @return
     */
    public Node FindLoopPort(Node head) {
        return null;
    }
}
