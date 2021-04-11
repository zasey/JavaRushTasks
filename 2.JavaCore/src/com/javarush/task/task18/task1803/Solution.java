package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] byteCountArray = new int[256];
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(reader.readLine())
        ){
            while(input.available() > 0)
                byteCountArray[input.read()]++;
        }catch(IOException e){
            e.printStackTrace();
        }
        int max = 0;
        for(int byteCount : byteCountArray)
            max = Math.max(max, byteCount);
        ArrayList<Integer> maxCounts = new ArrayList<>();
        for(int i = 0; i < byteCountArray.length; i++)
            if(byteCountArray[i] == max) maxCounts.add(i);

        maxCounts.forEach(b -> System.out.print(b + " "));
    }
}
