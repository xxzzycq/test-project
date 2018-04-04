package com.xxzzycq.node;

import org.junit.Before;
import org.junit.Test;

import static com.xxzzycq.node.LinkedTableBaseOperator.addNode;
import static com.xxzzycq.node.LinkedTableBaseOperator.addNodeAsHead;
import static com.xxzzycq.node.LinkedTableBaseOperator.deleteNode;
import static com.xxzzycq.node.Node.printNode;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public class TestLinkedTableBaseOperator {
    Node head = null;

    @Before
    public void init() {
        Node p4 = new Node(null, "p4");
        Node p3 = new Node(p4, "p3");
        Node p2 = new Node(p3, "p2");
        head = new Node(p2, "p1");
    }

    @Test
    public void testAddNodeAsHead() {
        printNode(head);
        printNode(addNodeAsHead(head, "p5"));
    }

    @Test
    public void testAddNode() {
        printNode(head);
        addNode(head, "p5");
        printNode(head);
    }

    @Test
    public void testDeleteNodeByIndex() {
        printNode(head);
        deleteNode(head, "p1");
        printNode(head);
    }

    @Test
    public void testDeleteNodeByData() {
        printNode(head);
        deleteNode(head, "p3");
        printNode(head);
    }
}
