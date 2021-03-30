package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }
// 101101 00100 = 101001

    public static int resetFlag(int number, int flagPos) {
       // return number & ~(1 << flagPos)  ;
        return ~(number ^ ~(1 << flagPos));
    }
    // 11011 & 00100 = 00000
    public static boolean checkFlag(int number, int flagPos) {
        return !((number & (1 << flagPos)) == 0);
    }
}
