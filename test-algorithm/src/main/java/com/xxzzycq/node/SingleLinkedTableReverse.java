package com.xxzzycq.node;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public class SingleLinkedTableReverse {
    // 非递归实现
    /**
     * TODO 反转链表
     * 反转从位置 头 到 尾 的链表。用一次遍历在原地完成反转。
     * 例如：
     * 给定 1->2->3->4->5->NULL,
     * 返回 5->4->3->2->1->NULL.
     */
    public static Node reverse(Node head) {
        // 定义上一个节点，初始化为null，理解为head节点的上一个节点为null
        Node prev = null;
        while (head != null) {
            // step1:保存head.next节点
            Node tmpNode = head.next;
            // step2:断开head和head.next的连接，即将head.next指向它的上一个节点
            head.next = prev;
            // step3:移动上一个节点的位置
            prev = head;
            // step4:移动head的位置到head.next
            head = tmpNode;
        }
        return prev;
    }

    // 递归实现
    public static Node recurReverse(Node head) {
        if (head == null || head.next == null)
            return head;
        // 先递归到尾节点，然后一层层往上面回归
        Node p = reverse(head.next);
        // head.next 节点指向head 反转指向
        head.next.next = head;
        // 断开head和head.next的连接
        head.next = null;
        return p;
    }

    /**
     * TODO 反转链表
     * 反转从位置 m 到 n 的链表。用一次遍历在原地完成反转。
     * 例如：
     * 给定 1->2->3->4->5->NULL, m = 2 和 n = 4,
     * 返回 1->4->3->2->5->NULL.
     */
    public static Node reverseBetween(Node head, int m, int n) {
        Node prev = null;
        Node end = null;
        Node curr = head;
        int count = 1;
        while (count < m) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        while (count <= n && count >= m) {
            Node tmp = curr.next;
            tmp.next = prev;
            prev = curr;
            curr = tmp;
            count++;
        }
        return head;
    }
}
