package YLAB.JavaRush.Lesson_4;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        /*
        1. Четные числа
        Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
        Через пробел либо с новой строки.

        2. Рисуем прямоугольник
        Ввести с клавиатуры два числа m и n.
        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        Пример: m=2, n=4
        8888
        8888

        3. Рисуем треугольник
        Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        Пример:
        8
        88
        888
        ...

        4. Рисуем линии
        Используя цикл for вывести на экран:
        - горизонтальную линию из 10 восьмёрок
        - вертикальную линию из 10 восьмёрок.

        5. Все любят Мамбу
        Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
        Пример текста:
        Света любит меня.
        Света любит меня.
        …
         */

        //1
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

        //2
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int j = 0; j < m; j++)
        {
            for (int i1 = 0; i1 < n; i1++)
            {
                System.out.print ("8");
            }
            System.out.print (""+"\n");
        }

        //3
        String s = "8";
            for (int count = 0; count < 10; count++) {
                System.out.println(s);
                s = s + 8;
            }

        //4
        for (int i2=1; i2<=10; i2++)
            System.out.print("8");

        System.out.println();

        for (int i3=1; i3<=10; i3++)
            System.out.println("8");

        //5
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        for (int i4 = 1; i4 <= 10; i4++)
            System.out.println(name1 + " любит меня.");
    }
}
