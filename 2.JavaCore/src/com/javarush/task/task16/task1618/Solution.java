package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(2000);
        testThread.interrupt();
    }


    public static class TestThread extends Thread{
        public void run(){
            System.out.println("Нить запущена!");
            try {
                Thread.sleep(4000);
            }catch (InterruptedException e){
                System.out.println("Нить остановлена!");
            }
        }
    }
}