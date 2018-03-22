package com.xxzzycq.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yangchangqi on 2017/11/24.
 */
public class MapDemo {
    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    HashMap<String, String> hashMap = new HashMap<>();
    Hashtable<String, String> hashtable = new Hashtable<>();
    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
    TreeMap<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    });

}
