package com.javarush.task.pro.task05.task0503;

import java.util.Arrays;

/* 
Работаем с элементами массива
*/

public class Solution {

    public static int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i = 0; i < array.length; i++)
            array[i] = (array[i] % 2 == 0 ? array[i] - array[i]*2 : array[i]);
        System.out.println(Arrays.toString(array));
    }
}
