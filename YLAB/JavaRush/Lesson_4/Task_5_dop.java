package YLAB.JavaRush.Lesson_4;
import java.util.Scanner;

public class Task_5_dop {
    public static void main(String[] args) {
        /*
        1. Я никогда не буду работать за копейки
        Используя цикл вывести на экран сто раз надпись:
        «Я никогда не буду работать за копейки. Амиго»

        2. Среднее такое среднее
        Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.

        3. Посчитать сумму чисел
        Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.

        4. Меня зовут 'Вася'...
        Ввести с клавиатуры строку name.
        Ввести с клавиатуры дату рождения (три числа): y, m, d.
        Вывести на экран текст:
        «Меня зовут name
        Я родился d.m.y»

        Пример:
        Меня зовут Вася
        Я родился 15.2.1988
         */

        //1
        for (int i = 1; i <= 100; i++) {
            System.out.println("Я никогда не буду работать за копейки. Амиго");
        }

        //2
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(b);

        //3

        //4
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        int y = scanner1.nextInt(), m = scanner1.nextInt(), d = scanner1.nextInt();
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
