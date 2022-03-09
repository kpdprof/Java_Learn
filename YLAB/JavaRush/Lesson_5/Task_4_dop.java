package YLAB.JavaRush.Lesson_5;
import java.text.SimpleDateFormat;
import java.util.*;

public class Task_4_dop {
    //1
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
    }
    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
    public static void main1(String[] args)
    {
        Man man1 = new Man("name", 20, "address");
        Man man2 = new Man("name2", 20, "address");
        Woman woman1 = new Woman("name", 20, "address");
        Woman woman2 = new Woman("name2", 20, "address");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //2
    public static class Man
    {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {
            this.address = address;
            this.age = age;
            this.name = name;
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.address = address;
            this.age = age;
            this.name = name;
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }
    public static void main2(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Dog1 jerryDog = new Dog1("Jerry", 12 , 5);
        Cat1 jerryCat = new Cat1("Jerry", 12 , 5);

    }

    //3
    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog1
    {
        String name;
        int height;
        int tail;

        public Dog1(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat1
    {
        String name;
        int height;
        int tail;

        public Cat1(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }

    //4
    public static void main3(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(formatForDateNow.format(dateNow));
    }

    //5
}
