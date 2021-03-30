package com.javarush.task.pro.task08.task0813;

/* 
Степень двойки
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        if(power == 1)
            return 2;
        else
            return getPowerOfTwo(power - 1) * 2;
    }
}

// 9 =  8 + 1 =    1001 << 2  = 100100 = 36
// 1001 >> 2 = 10