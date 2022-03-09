package YLAB.JavaRush.Lesson_5;

public class Task_2 {
    public static void main(String[] args) {
        /*
        1. Создать класс Friend
        Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
        - Имя
        - Имя, возраст
        - Имя, возраст, пол

        2. Создать класс Cat
        Создать класс Cat (кот) с пятью инициализаторами:
        - Имя
        - Имя, вес, возраст
        - Имя, возраст (вес стандартный)
        - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
        - вес, цвет, адрес (чужой домашний кот)
        Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

        3. Создать класс Dog
        Создать класс Dog (собака) с тремя инициализаторами:
        - Имя
        - Имя, рост
        - Имя, рост, цвет

        4. Создать класс Circle
        Создать класс (Circle) круг, с тремя инициализаторами:
        - centerX, centerY, radius
        - centerX, centerY, radius, width
        - centerX, centerY, radius, width, color

        5. Создать класс прямоугольник (Rectangle)
        Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
        Примеры:
        - заданы 4 параметра: left, top, width, height
        - ширина/высота не задана (оба равны 0)
        - высота не задана (равно ширине) создаём квадрат
        - создаём копию другого прямоугольника (он и передаётся в параметрах)
         */

        //1
        class Friend {
            String name = null;
            int age;
            int gender;
            public void initialize(String name) {
                this.name = name;
            }public void initialize(String name, int age) {
                this.name = name;
                this.age = age;
            }public void initialize(String name, int age, int gender) {
                this.name = name;
                this.age = age;
                this.gender = gender;
            }
        }

        //2
        class Cat
        {
            private String name = null;
            private String address = null;
            private int age = 5;
            private int weight = 10;
            private String color;

            public void initialize(String name){
                this.name = name;
            }
            public void initialize(String name, int weight, int age){
                this.name = name;
                this.weight = weight;
                this.age = age;
            }
            public void initialize(String name, int age){
                this.name = name;
                this.age = age;
            }
            public void initialize(int weight, String color){
                this.weight = weight;
                this.color = color;
            }
            public void initialize(int weight, String color, String address){
                this.weight = weight;
                this.color = color;
                this.address = address;
            }
        }

        //3
        class Dog
        {
            private String name;
            private int age;
            private String color;

            public void initialize(String name){
                this.name = name;
            }
            public void initialize(String name, int age){
                this.name = name;
                this.age = age;
            }
            public void initialize(String name, int age, String color){
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
            public void initialize(int centerX, int centerY, int radius){
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
            }
            public void initialize(int centerX, int centerY, int radius, int width){
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
            }
            public void initialize(int centerX, int centerY, int radius, int width, String color){
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
            private int top, left, width, height;
            public void initialize(int left, int top, int width, int height){
                this.left = left;
                this.top = top;
                this.width = width;
                this.height = height;
            }
            public void initialize(int left, int top){
                this.left = left;
                this.top = top;
                this.width = 0;
                this.height = 0;
            }
            public void initialize(int left, int top, int width){
                this.left = left;
                this.top = top;
                this.width = width;
                this.height = width;
            }
            public void initialize(Rectangle another){
                this.left = another.left;
                this.top = another.top;
                this.width = another.width;
                this.height = another.height;
            }
        }
    }
}
