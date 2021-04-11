package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
        try(BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(buff.readLine()))
        {
            while(input.available() > 0)
                min = Math.min(min, input.read());
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(min);
    }
}
