package com.xxzzycq.node;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public class DbNode {
    DbNode prev;
    DbNode next;
    Object data;

    public DbNode(DbNode prev, DbNode next, Object data) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
