package com.javarush.task.pro.task04.task0412;

/* 
Сумма четных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 0;
        for(int i = 1; i <= 17; i++)
            if(i % 3 != 0)
                continue;
            else
                sum+= i;
        System.out.println(sum);
    }
}