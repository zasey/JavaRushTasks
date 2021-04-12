package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] count = new int[256];
        try(BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputFile = new FileInputStream(buff.readLine()))
        {
                while (inputFile.available() > 0)
                    count[inputFile.read()]++;

        }catch(IOException e){
            e.printStackTrace();
        }
        int minByte = 256;
        for(int b : count) if(b > 0) minByte = Math.min(minByte, b);
        ArrayList<Integer> minBytes = new ArrayList<>();
        for(int i = 0; i < count.length; i++)
            if(count[i] == minByte)
                minBytes.add(i);
        minBytes.forEach(element -> System.out.print(element + " "));
    }
}
