package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двухмерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if(n == 0) return;
        multiArray = new int[n][];
        for(int i = 0; i < multiArray.length; i++ ){
            int m = console.nextInt();
            multiArray[i] = new int[m];
        }

    }
}
