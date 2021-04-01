package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner console = new Scanner(System.in);
            var input = Files.newInputStream(Paths.get(console.nextLine()));
            var output = Files.newOutputStream(Paths.get(console.nextLine()))){
        byte[] bytesIn = input.readAllBytes();
        byte[] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            output.write(bytesOut);
        }catch(IOException e){
            System.out.println("Что-то не так! - " + e);
        }
    }
}

