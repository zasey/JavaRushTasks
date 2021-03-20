package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int second_min = 0;
        int first_number = console.nextInt();
        int second_number = console.nextInt();
        int min = (first_number < second_number ? first_number : second_number);
        int max = (first_number < second_number ? second_number : first_number);
        while(console.hasNextInt()){
            int x = console.nextInt();
            if(x < min) {
                second_min = min;
                min = x;
            }
            else if(x > min && x < second_min)
                second_min = x;
        }
        System.out.println(second_min);
    }
}