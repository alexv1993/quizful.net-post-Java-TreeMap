package com.github.alexv1993;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.TreeMap;


/**
 * Created by Alex on 07.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TreeMapTest treeMapTest = (TreeMapTest) context.getBean("treeMap");

        Map map = new TreeMap();
        map.put("Bruce", "Willis");
        map.put("Arnold", "Schwarzenegger");
        map.put("Jackie", "Chan");
        map.put("Sylvester", "Stallone");
        map.put("Chuck", "Norris");

        treeMapTest.setTreeMap(map);
        System.out.println("--------------------Print outer tree--------------------");
        treeMapTest.printTree(map);
        System.out.println("--------------------Print inner tree--------------------");
        treeMapTest.printInnerTree();


    }
}
