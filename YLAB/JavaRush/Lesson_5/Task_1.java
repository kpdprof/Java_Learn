package YLAB.JavaRush.Lesson_5;

public class Task_1 {
    public static void main(String[] args) {
        /*
        1. Создать класс Cat
        Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).

        2. Реализовать метод fight
        Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса, возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
        Должно выполняться условие:
        если cat1.fight(cat2) == true , то cat2.fight(cat1) == false

        3. Геттеры и сеттеры для класса Dog
        Создать class Dog. У собаки должна быть кличка String name и возраст int age.
        Создайте геттеры и сеттеры для всех переменных класса Dog.

        4. Создать три объекта типа Cat
        В методе main создать три объекта типа Cat и заполнить их данными. Использовать класс Cat из первой задачи. Класс Cat создавать не надо.

        5. Провести три боя попарно между котами
        Создать три кота используя класс Cat.
        Провести три боя попарно между котами.
        Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
        Результат каждого боя вывести на экран.
         */

        //1
        class Cat {
            public static int count = 0;
            public static int fightCount = 0;

            String name;
            int age;
            int weight;
            int strength;

            public Cat(String name, int age, int weight, int strength) {
                count++;

                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;
            }

            public boolean fight(Cat anotherCat) {
                fightCount++;

                int agePlus = this.age > anotherCat.age ? 1 : 0;
                int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
                int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

                int score = agePlus + weightPlus + strengthPlus;
                return score > 2; // return score > 2 ? true : false;
            }
        }

        //3
        class Dog {
            String name;
            int age;

            public String getName(){
                return name;
            }
            public int getAge(){
                return age;
            }
            public void setName(String name){
                this.name = name;
            }
            public void setAge(int age){
                this.age = age;
            }
        }

        //4
        Cat cat1 = new Cat("Dima", 1, 1, 2);
        Cat cat2 = new Cat("Bob", 10, 1, 3);
        Cat cat3 = new Cat("Vova", 12, 10, 11);

        //5
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }
}
