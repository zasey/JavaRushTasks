package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        String text = "";
        int count = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileReader file = new FileReader(reader.readLine())){
                while (file.ready())
                    text += (char)file.read();
        }catch (IOException e){
            e.printStackTrace();
        }
        String words = text.replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        for(String word : words.split(" "))
            if(word.equals("world")) count++;
        System.out.println(count);
    }
}
