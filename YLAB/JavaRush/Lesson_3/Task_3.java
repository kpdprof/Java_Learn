package YLAB.JavaRush.Lesson_3;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        /*
        Задачи
        1	Как захватить мир
        Ввести с клавиатуры число и имя, вывести на экран строку:
        «имя» захватит мир через «число» лет. Му-ха-ха!
        ( Последовательность вводимых данных имеет большое значение.)
        Пример:
        Вася захватит мир через 8 лет. Му-ха-ха!
        2. Зарплата через 5 лет
        Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
        Пример:
        Коля получает 3000 через 5 лет.
        3.	Скромность украшает человека
        Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
        Пример:
        Тимур зарабатывает $5,000. Ха-ха-ха!
        4.	Спонсор - это звучит гордо
        Ввести с клавиатуры два имени и вывести надпись:
        name1 проспонсировал name2, и она стала известной певицей.
        Пример:
        Коля проспонсировал Лену, и она стала известной певицей.
        5	Чистая любовь
        Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!
        Пример:
        Вася + Ева + Анжелика = Чистая любовь, да-да!
         */

        // 1
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = scanner.nextInt();
        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");

        // 2
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        int number1 = scanner1.nextInt();
        int number1_2 = scanner1.nextInt();
        System.out.println(name + " получает " + number + " через " + number1_2 + " лет.");

        // 3
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");

        // 4
        Scanner scanner3 = new Scanner(System.in);
        String name3_1 = scanner3.nextLine();
        String name3_2 = scanner3.nextLine();
        System.out.println(name3_1 + " проспонсировал " + name3_2 + " и она стала известной певицей.");

        // 5
        Scanner scanner4 = new Scanner(System.in);
        String name4_1 = scanner4.nextLine();
        String name4_2 = scanner4.nextLine();
        String name4_3 = scanner4.nextLine();
        System.out.println(name4_1 + "+" + name4_2 + "+" + name4_3 + " = Чистая любовь, да-да!");
    }
}
