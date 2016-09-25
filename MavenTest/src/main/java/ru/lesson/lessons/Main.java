package ru.lesson.lessons;
public class Main {
    public static void main(String[] args) {
        System.out.println("Calulate...");

        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int summ = first + second;

        System.out.println("Сумма " + args[0] + " и " + args[1]+ " равна " + summ);

        int razn = first - second;
        System.out.println("Разность " + args[0] + " и " + args[1]+ " равна " + razn);

        int proiz = first * second;
        System.out.println("Произведение " + args[0] + " и " + args[1]+ " равно " + proiz);

        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double delen = a / b;
        System.out.println("Деление " + args[0] + " на " + args[1]+ " равно " + delen);

        int step = (int) Math.pow(first, second);
        System.out.println("Cтепень  числа " + args[0] + " показатель степени  " + args[1]+ " равно " + step);



    }
}
