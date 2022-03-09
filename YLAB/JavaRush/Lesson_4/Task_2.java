package YLAB.JavaRush.Lesson_4;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /*
        Задача 1. Минимум двух чисел
        Ввести с клавиатуры два числа, и вывести на экран минимальное из них.

        Задача 2. Максимум четырех чисел
        Ввести с клавиатуры четыре числа, и вывести максимальное из них.

        Задача 3. Сортировка трех чисел
        Ввести с клавиатуры три числа, и вывести их в порядке убывания.

        Задача 4. Сравнить имена
        Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
        Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».

        Задача 5. 18+
        Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»

        Задача 6. И 18-ти достаточно
        Ввести с клавиатуры имя и возраст.
        Если возраст больше 20 вывести надпись «И 18-ти достаточно»
         */

        //1
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

        //2
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        if (a1 >= b1 && a1 >= c1 && a1 > d1) {
            System.out.println(a1);
        } else if (b1 >= a1 && b1 >= c1 && b1 >= d1) {
            System.out.println(b1);
        } else if (c1 >= a1 && c1 >= b1 && c1 >= d1) {
            System.out.println(c1);
        } else if (d1 >= a1 && d1 >= b1 && d1 >= c1) {
            System.out.println(d1);
        }

        //3
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x >= y && x >= z && y > z) {
            System.out.println(x + " " + y + " " + z);
        } else if (x >= y && z >= y && x >= z) {
            System.out.println(x + " " + z + " " + y);
        } else if (y >= x && y >= z && x >= z) {
            System.out.println(y + " " + x + " " + z);
        } else if (y >= x && y >= z && z >= x) {
            System.out.println(y + " " + z + " " + x);
        } else if (z >= x && z >= y && x >= y) {
            System.out.println(z + " " + x + " " + y);
        } else if (z >= x && z >= y && y >= x) {
            System.out.println(z + " " + y + " " + x);
        }

        //4

        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        if (n1 == n2) {
            System.out.println("Имена идентичны");
        }
        else if (n1.length() == n2.length()) {
            System.out.println("Длины имен равны");
        }

        //5
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Подрасти еще");
        } else {
            System.out.println("Проходи");
        }

        //6
        String name = scanner.nextLine();
        int age1 = scanner.nextInt();
        if (age1 > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
