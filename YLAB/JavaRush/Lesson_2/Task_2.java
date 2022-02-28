package YLAB.JavaRush.Lesson_2;

public class Task_2 {
    public static void main(String[] args) {

        /*
        2. Создайте 10 переменных типа Cat и 8 объектов типа Cat.
        3. Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
        Присвойте каждому животному владельца (owner).
        */

        // 2
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9;
        Cat cat10;

        // 3
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;

    }
    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
