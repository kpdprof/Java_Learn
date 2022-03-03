package YLAB.JavaRush.Lesson_3;
import java.util.Scanner;

public class Task_4_dop {
    public static void main(String[] args) {
        /*
        Дополнительные задания для выполнения в Intellij Idea
        1. Жить хорошо, а хорошо жить еще лучше
        Вывести на экран надпись «Жить хорошо, а хорошо жить еще лучше»
        2. Я не хочу изучать Java, я хочу большую зарплату
        Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
        3.Я буду зарабатывать $50 в час
        Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».
        Пример:
        Я буду зарабатывать $50 в час
         */

        // 1
        System.out.println("Жить хорошо, а хорошо жить еще лучше");

        // 2
        for (int i = 0; i < 10; i++) {
            System.out.println("Я не хочу изучать Java, я хочу большую зарплату");
        }

        // 3
        Scanner scanner = new Scanner(System.in);
        int countDollar = scanner.nextInt();
        System.out.println("Я буду зарабатывать $" + countDollar + " в час");
    }
}
