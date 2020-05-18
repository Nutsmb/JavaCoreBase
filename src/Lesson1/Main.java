package Lesson1;

public class Main {
    public static void main(String[] args) {

        byte a = 3;
        short b = 1001;
        int c = 8;
        long d = 900L;
        float e = 2.5f;
        double f = 23.84653;
        boolean g = true;
        char h = 'q';

        System.out.println(compare(10, 20));
        System.out.println(calculate(10, 20, 6, 3));
        determine(4L);
        System.out.println(determineNegative(2));
        hello("Ayrat");
        leap_year(1256);
    }

    public static double calculate(int a, int b, int c, int d) {
        int i = a * (b + (c / d));
        return i;
    }

    public static boolean compare(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20)
            return true;
        else
            return false;
    }

    public static void determine(long a) {
        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    public static boolean determineNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void hello(String name) {
        System.out.println("Привет, "+ name);
    }

    public static void leap_year(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
            System.out.println("Год високосный");
        else
            System.out.println("Год не високосный");
    }
}
