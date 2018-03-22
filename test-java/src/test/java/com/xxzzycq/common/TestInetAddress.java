package com.xxzzycq.common;

import org.junit.Test;

import java.net.InetAddress;

/**
 * Created by yangchangqi on 2018/3/20.
 */
public class TestInetAddress {

    @Test
    public void testHostName() throws Exception {
        System.out.println(InetAddress.getLocalHost().getHostName());
    }

    @Test
    public void testSystem() {
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv().get("JAVA_HOME"));
    }
}
