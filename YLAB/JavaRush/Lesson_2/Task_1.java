package YLAB.JavaRush.Lesson_2;

public class Task_1 {
    public static void main(String[] args) {
        /*
        1. Создать объект типа Cat 2 раза.
        2. Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
        3. Напиши программу, которая выводит на экран надпись: «Мне так плохо! Хочу, чтобы все умерли!».
        */

        // 1
        class Cat {}
        new Cat();
        new Cat();

        // 2
        class Dog {
            public Dog(String name) {}
        }
        Dog dog1 = new Dog("Max");
        Dog dog2 = new Dog("Bella");
        Dog dog3 = new Dog("Jack");

        // 3
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");
    }
}
