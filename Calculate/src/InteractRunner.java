import java.util.Scanner;

/**
 * Created by papa on 15.01.16.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Введите первое число : ");
                String first = reader.next();
                System.out.println("Введите второе число : ");
                String second = reader.next();

                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Результат ; " + calc.getResult());
                calc.cleanRezult();

                System.out.println("Выход yes / no ");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}
