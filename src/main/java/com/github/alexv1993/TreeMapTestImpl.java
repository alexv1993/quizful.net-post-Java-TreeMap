package com.github.alexv1993;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Alex on 07.10.2017.
 */
public class TreeMapTestImpl<K, V> implements TreeMapTest<K, V> {

    private Map<K, V> treeMap;

    @Override
    public void createTreeMap() {
        treeMap = new TreeMap();
    }


    @Override
    public void setTreeMap(Map<K, V> map) {
        this.treeMap = map;
    }

    @Override
    public Map getTreeMap() {
        return this.treeMap;
    }

    @Override
    public void printTree(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Override
    public void printInnerTree() {
        for (Map.Entry<K, V> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
