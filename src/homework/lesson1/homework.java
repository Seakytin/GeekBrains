package homework.lesson1;

public class homework {
    public static void main(String[] args)
    {
        System.out.println(calc(45, 6, 2, 8));
        System.out.println(hittingTheRange10and20(4, 9));
        definitionOfPositiveOrNegativeValue (-1);
        System.out.println(definitionOfNegativeValue(-4));
        printName("Петр");
        changeYear(1996);
        byte a = 1;
        short b = 2;
        int c = 3;
        long l = 4L;
        int d = 6;
        double f = 0.02D;
        char g = '*';
        boolean h = true;

    }
    public static float calc(float a, float b, float c, float d)
    {

        return a * (b + (c / d));
    }
    public static boolean hittingTheRange10and20(int a, int b)
    {
        if (a + b > 10 && a + b < 20)
        {
           return true;
        }
         else
            {
            return false;
            }
    }
    public static void definitionOfPositiveOrNegativeValue(int number)
    {
         if (number >= 0)
         {
              System.out.println(number + "-"+ "Положительное число");
         } else
             {
            System.out.println(number + "-" + "Отрицательное число");
             }
    }
    public static boolean definitionOfNegativeValue(int a)
    {
         if (a < 0)
         {
           return true;
         } else
             {
            return false;
             }
     }
     public static void printName(String name)
     {
                System.out.println("Привет," + name + "!");
     }
    public static void changeYear(int years)
    {
        if (years % 4 ==0 && years % 100 != 0)
        {
            System.out.println(years + " - Год является високосным!");
        }
        else if (years % 400 ==0)
        {
            System.out.println(years + " - Год является високосным!");
        }
        else
            {
                System.out.println(years + " - Год не является високосным!");
            }

    }

}
