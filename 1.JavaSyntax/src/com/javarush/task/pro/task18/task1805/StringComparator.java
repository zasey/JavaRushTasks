package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare(String str1, String str2){
        return str1.length()-str2.length();
    }
}
