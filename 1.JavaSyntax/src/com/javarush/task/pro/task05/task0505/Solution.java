package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;
import java.util.Arrays;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        if((N & 1 )== 0)
            for(int i = N - 1; i >= 0; i--)
                System.out.println(array[i]);
        else
            for(int i = 0 ; i < N; i++)
                System.out.println(array[i]);
    }

}
