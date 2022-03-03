package YLAB.JavaRush.Lesson_2;

public class Task_3 {
    public static void main(String[] args) {
        /*
        1. Минимум двух чисел
        Написать функцию, которая возвращает минимум из двух чисел.
        2. Максимум двух чисел
        Написать функцию, которая вычисляет максимум из двух чисел.
        3. Минимум трёх чисел
        Написать функцию, которая вычисляет минимум из трёх чисел.
        4. Минимум четырёх чисел
        Написать функцию, которая вычисляет минимум из четырёх чисел.
        Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
        5. Дублирование строки
        Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
        6. Вывод текста на экран
        Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке. Слова должны быть разделены пробелом и не должны сливаться в одно.
         */

        int number1 = 5;
        int number2 = 1;
        int number3 = 4;
        int number4 = 2;

        System.out.println(min(number1, number2));
        System.out.println(min3(number1, number2, number3));
        System.out.println(min4(number1, number2, number3, number4));

        String s = "Test";
        printString3(s);
        printStringFull(s);

    }

        // 1
    public static int min(int a, int b){
        int minNumber = 0;
        return a < b ? a : b;
    }

        // 2
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

        // 3
    public static int min3(int a, int b, int c) {
        return min((min(a, b)), c);
    }

        // 4
    public static int min4(int a, int b, int c, int d) {
        int minimumTemp = min((min(a, b)), c);
        return min(minimumTemp, d);
    }

        // 5
    public static void printString3(String string) {
        System.out.println(string + "\n" + string + "\n" + string);
    }

        // 6
    public static void printStringFull(String string) {
        System.out.println(string + " " + string + " " + string);
    }
}
