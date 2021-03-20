package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String word = "enough";
        Scanner console = new Scanner(System.in);

        while(true){
            String w = console.nextLine();
            if(w.equals(word)) break;
            System.out.println(w);
        }
    }
}