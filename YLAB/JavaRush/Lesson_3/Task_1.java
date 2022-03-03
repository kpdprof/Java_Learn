package YLAB.JavaRush.Lesson_3;

public class Task_1 {
    public static void main(String[] args) {
        /*
        1.	Дата рождения
        Вывести на экран дату своего рождения в виде: MAY 1 2012
        2.	4 скобки
        Расставить правильно (по другому) скобки, чтобы на экран вывелось число 850
        3.	StarCraft
        Создать 10 зергов, 5 протосов и 12 терран.
        Дать им всем уникальные имена.
        4.	Произведение 10 чисел
        Вывести на экран произведение чисел от 1 до 10.
        Подсказка: будет три миллиона с хвостиком
        5.	Сумма 10 чисел
        Вывести на экран сумму чисел от 1 до 10 построчно:
        1
        1+2=3
        1+2+3=6
        1+2+3+4=10
        …
        Пример вывода:
        1
        3
        6
        10
        …
         */

        // 1
        System.out.println("OCT 21 1997");

        // 2 No initial condition

        // 3
        class Zerg {}
        class Protoss {}
        class Terran {}
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Protoss protoss4 = new Protoss();
        Protoss protoss5 = new Protoss();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();

        // 4
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result = result * i;
        }
        System.out.println(result);

        // 5
        int sum = 0;
        int i = 1;

        for (i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
