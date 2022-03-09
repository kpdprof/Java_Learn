package YLAB.JavaRush.Lesson_5;

public class Task_3 {
    public static void main(String[] args) {
        /*
        1. Создать класс Friend
        Создать класс Friend (друг) с тремя конструкторами:
        - Имя
        - Имя, возраст
        - Имя, возраст, пол

        2. Создать класс Cat
        Создать класс Cat (кот) с пятью конструкторами:
        - Имя,
        - Имя, вес, возраст
        - Имя, возраст (вес стандартный)
        - вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
        - вес, цвет, адрес ( чужой домашний кот)
        Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

        3. Создать класс Dog
        Создать класс Dog (собака) с тремя конструкторами:
        - Имя
        - Имя, рост
        - Имя, рост, цвет

        4. Создать класс Circle
        Создать класс (Circle) круг, с тремя конструкторами:
        - centerX, centerY, radius
        - centerX, centerY, radius, width
        - centerX, centerY, radius, width, color

        5. Создать класс прямоугольник (Rectangle)
        Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
        Примеры:
        - заданы 4 параметра: left, top, width, height
        - ширина/высота не задана (оба равны 0)
        - высота не задана (равно ширине) создаём квадрат
        - создаём копию другого прямоугольника (он и передаётся в параметрах)
         */
        class Friend
        {
            private String name, sex;
            private int age;
            public Friend(String name){
                this.name = name;
            }
            public Friend(String name, int age){
                this.name = name;
                this.age = age;
            }
            public Friend(String name, int age, String sex){
                this.name = name;
                this.age = age;
                this.sex = sex;
            }
        }

        //2
        class Cat
        {
            private String name, color, address;
            private int weight = 8, age = 4;
            public Cat(String name){
                this.name = name;
            }
            public Cat(String name, int weight, int age){
                this.name = name;
                this.weight = weight;
                this.age = age;
            }
            public Cat(String name, int age){
                this.name = name;
                this.age = age;
            }
            public Cat(int weight, String color){
                this.weight = weight;
                this.color = color;
            }
            public Cat(int weight, String color, String address){
                this.weight = weight;
                this.color = color;
                this.address = address;
            }
        }

        //3
        class Dog
        {
            private String name, color;
            private int age;
            public Dog(String name){
                this.name = name;
            }
            public Dog(String name, int age){
                this.name = name;
                this.age = age;
            }
            public Dog(String name, int age, String color){
                this.name = name;
                this.age = age;
                this.color = color;
            }
        }

        //4
        class Circle
        {
            private int centerX, centerY, radius, width;
            private String color;
            public Circle(int centerX, int centerY, int radius){
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
            }
            public Circle(int centerX, int centerY, int radius, int width){
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
            }
            public Circle(int centerX, int centerY, int radius, int width, String color){
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
                this.color = color;
            }
        }

        //5
        class Rectangle
        {
            private int left  = 0;
            private int top=0;
            private int width = 0;
            private int height=0;
            public Rectangle(int left, int top, int width, int height){
                this.left = left;
                this.top = top;
                this.width = width;
                this.height = height;
            }
            public Rectangle(int left, int top){
                this.left = left;
                this.top = top;
            }
            public Rectangle (int left, int top, int width){
                this.left = left;
                this.top = top;
                this.width = width;
                this.height = width;
            }
            public Rectangle(Rectangle another){
                this.left = another.left;
                this.top = another.top;
                this.width = another.width;
                this.height = another.height;
            }
        }
    }
}
