package YLAB.JavaRush.Lesson_4;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        //Вывести на экран числа от 1 до 10, используя цикл while.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //Вывести на экран числа от 10 до 1, используя цикл while.
        int i1 = 10;
        while (i1 >= 1) {
            System.out.println(i1);
            i1--;
        }

        //Ввести с клавиатуры строку и число N.
        //Вывести на экран строку N раз, используя цикл while.
        //
        //Пример ввода:
        //абв
        //2
        //Пример вывода:
        //абв
        //абв

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int i2 = 0;
        while (i2 < n) {
            System.out.println(s);
            i2++;
        }

        //Вывести на экран квадрат из 10х10 букв S используя цикл while.
        //Буквы в каждой строке не разделять.
        int x = 1, y = 1;
        while (y <= 10) {
            while (x < 10) {
                System.out.print("S"); x++;
            }
            System.out.println("S"); y++; x=1;
        }

        //Вывести на экран таблицу умножения 10х10 используя цикл while.
        //Числа разделить пробелом.
        int i3 = 1, n3 = 1;
        while(i3 <= 10) {
            System.out.print(i3 + " ");
            while(n3 <= 9) {
                n3++;
                System.out.print(i3 * n3 + " ");
            }
            i3++;
            n3 = 1;
            System.out.println("");
        }
    }
}
