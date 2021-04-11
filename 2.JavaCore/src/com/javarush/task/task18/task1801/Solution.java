package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try(Scanner console = new Scanner(System.in);
            FileInputStream input = new FileInputStream(console.nextLine())){
            int max = Integer.MIN_VALUE;
            while(input.available() > 0)
                max = Math.max(max, input.read());
            System.out.println(max);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
