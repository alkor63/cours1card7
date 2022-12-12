import java.util.Scanner;

public class Main {
    public static double square(double x) {
        double y;
        y = x * x;
        return y;
    } // вычислдили квадрат аргумента

    public static void main(String[] args) {
        double num = 1.0;
        Scanner in = new Scanner(System.in);
        System.out.println("При вводе double в качестве разделителя используйте запятую");
        while (num != 0) {
            System.out.print("Введите число: ");
            num = in.nextDouble();
            System.out.println(num + " в квадрате = " + square(num));
            System.out.println("(для выхода из программы введите '0')");
        }
        in.close();
    }
}