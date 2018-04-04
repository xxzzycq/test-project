package com.xxzzycq.node;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public class Node {
    public Node next;
    public Object data;

    public Node(Node next, Object data) {
        this.next = next;
        this.data = data;
    }

    public Node(Object data) {
        this.data = data;
    }

    public static void printNode(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }
}
