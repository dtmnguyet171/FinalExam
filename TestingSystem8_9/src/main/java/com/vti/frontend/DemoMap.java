package com.vti.frontend;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    int count;
    public void Test(){
        count=7;
    }
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "value 1");
        map.put("2", "value 2");
        map.put("3", "value 3");
        map.put("4", "value 4");
        System.out.println(map);
        System.out.println(map.get("3"));
        System.out.println();
    }
}
