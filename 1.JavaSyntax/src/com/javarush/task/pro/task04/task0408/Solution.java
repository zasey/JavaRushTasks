package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(console.hasNextInt()){
            int x = console.nextInt();
            if(x % 2 == 0)
                if(max < x)
                    max = x;
        }
        System.out.println(max);
    }
}