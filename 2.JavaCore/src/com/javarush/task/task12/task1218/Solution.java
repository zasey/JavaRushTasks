package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {
        }

        public void eat() {
        }
    }

    public class Car implements CanMove {
        public void move() {
        }
    }

    public class Duck implements CanFly, CanMove, CanEat {
        public void fly() {
        }

        public void move() {
        }

        public void eat() {

        }
    }

    public class Airplane implements CanFly, CanMove {
        public void fly() {
        }

        public void move() {
        }
    }
}
