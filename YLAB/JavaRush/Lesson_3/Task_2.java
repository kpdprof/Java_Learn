package YLAB.JavaRush.Lesson_3;

public class Task_2 {
    public static void main(String[] args) {
        /*
        1.	Мама мыла раму
        Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
        Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.
        Пример:
        МылаРамуМама
        РамуМамаМыла
        ...
        2.	Таблица умножения
        Выведи на экран таблицу умножения 10 на 10 в следующем виде:
        1 2 3 …
        2 4 6 …
        3 6 9 …
        …
        3.	Семь цветов радуги
        Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
        Каждый объект при создании выводит на экран определенный цвет.
        4.	Экранирование символов
        Про экранирование символов в Java читайте в дополнительном материале к лекции. Вывести на экран следующий текст - две строки:
        It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
        5.	Изучаем японский
        Выведи на экран 日本語
         */

        // 1
        String a, b, c;
        a = "Мама";
        b = "Мыла";
        c = "Раму";
        System.out.println(a + b + c);
        System.out.println(a + c + b);
        System.out.println(b + a + c);
        System.out.println(b + c + a);
        System.out.println(c + a + b);
        System.out.println(c + b + a);

        // 2
        for (int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.print((i * j) + " ");
            }
            System.out.println("");
        }

        // 3
        Red red= new Red();

        Orange orange= new Orange();

        Yellow yellow= new Yellow();

        Green green= new Green();

        Blue blue= new Blue();

        Indigo indigo= new Indigo();

        Violet violet= new Violet();

        // 4
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"\n" +
                "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

        // 5
        System.out.println("日本語");
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
