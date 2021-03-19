package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int height = 8, width = 20;
        while(width-- > 0)
            System.out.print("Б");
        System.out.println();
        while(height-- > 0) {
            System.out.print("Б");
            width = 20;
            while (width-- > 2)
                System.out.print(" ");
            System.out.println("Б");
        }
        width = 20;
        while(width-- > 0)
            System.out.print("Б");
        System.out.println();
        System.out.println();

        for(int i = 0;i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if ((i >= 1 && i < 9) && (j >= 1 && j < 19))
                    System.out.print(" ");
                else
                    System.out.print("Б");
            }
            System.out.println();
        }
    }
}