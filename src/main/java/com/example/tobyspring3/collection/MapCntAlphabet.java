package com.example.tobyspring3.collection;

import java.util.HashMap;

public class MapCntAlphabet {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "aabbccddeeffghijekslqwhqlaslksjdfh";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.putIfAbsent(ch, 1);
            map.put(ch, map.get(ch) + 1);
        }
        System.out.println(map);
    }
}
