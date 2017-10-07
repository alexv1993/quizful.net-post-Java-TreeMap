package com.github.alexv1993;

import java.util.Map;

/**
 * Created by Alex on 07.10.2017.
 */
public interface TreeMapTest<K, V> {
    public void createTreeMap();

    public void setTreeMap(Map<K, V> map);

    public Map<K, V> getTreeMap();

    public void printTree(Map<K, V> map);

    public void printInnerTree();


}
