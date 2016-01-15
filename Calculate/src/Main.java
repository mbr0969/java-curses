/**
 * Created by papa on 15.01.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Calulate...");

        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int summ = first + second;

        System.out.println("Сумма " + args[0] + " и " + args[1]+ " равна " + summ);
    }
}
