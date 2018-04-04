package com.xxzzycq.node;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.xxzzycq.node.Node.printNode;
import static com.xxzzycq.node.SingleLinkedTableReverse.recurReverse;
import static com.xxzzycq.node.SingleLinkedTableReverse.reverse;
import static com.xxzzycq.node.SingleLinkedTableReverse.reverseBetween;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public class TestSingleLinkedTableReverse {
    Node head = null;

    @Before
    public void init() {
        Node p5 = new Node(null, 5);
        Node p4 = new Node(p5, 4);
        Node p3 = new Node(p4, 3);
        Node p2 = new Node(p3, 2);
        head = new Node(p2, 1);
    }

    @Test
    public void testReverse() {
        printNode(head);
        Node newHead = reverse(head);
        printNode(newHead);
    }

    @Test
    public void testRecurReverse() {
        Node newHead = recurReverse(head);
        Assert.assertEquals("p4", newHead.data);
    }

    @Test
    public void testReverseBetween() {
        printNode(head);
        Node newHead = reverseBetween(head, 2, 4);
        printNode(newHead);
    }
}
