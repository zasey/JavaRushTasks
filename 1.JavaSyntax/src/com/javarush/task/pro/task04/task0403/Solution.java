package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String word;
        int resultSum = 0;
        word = console.nextLine();
        while(!word.equals("ENTER")){
            resultSum+=Integer.parseInt(word);
            word = console.nextLine();
        }
        System.out.println(resultSum);
    }
}