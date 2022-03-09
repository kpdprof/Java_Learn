package YLAB.JavaRush.Lesson_4;

public class Task_1 {
    public static void main(String[] args) {
        Cat4 cat1 = new Cat4();
        //написать тут ваш код
        cat1.count= cat1.count + 1;
        Cat4 cat2 = new Cat4();
        cat2.count= cat2.count + 1;
        //написать тут ваш код
        System.out.println("Cats count is " + Cat4.count);
    }

    //1
    public class Cat {
        private String name;
        public void setName(String name)
        {
            this.name = name;
            //написать тут ваш код
        }
    }

    //2
    public class Cat1
    {
        private static int catsCount = 0;
        public static void addNewCat()
        {
            Cat1.catsCount = catsCount + 1;
            //написать тут ваш код
        }
    }

    //3
    class Cat2
    {
        private static int catsCount = 0;
        public void setCatsCount(int catsCount)
        {
            this.catsCount = catsCount;
            //написать тут ваш код
        }
    }

    //4
    class Cat3
    {
        private String fullName;
        public void setName(String firstName, String lastName)
        {
            String fullName = firstName + " " + lastName;
            //написать тут ваш код
            this.fullName = fullName;
        }
    }

    //5
    public static class Cat4
    {
        private static int count = 0;

    }


}
