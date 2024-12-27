package je09_controle_fluxo.condicional;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome:");
            String name = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String otherName = scanner.next();

            System.out.println("Digite sua idade:");
            int age = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double height = scanner.nextDouble();

            try {
                System.out.println("Olá, me chamo " + name.toUpperCase() + " " + otherName.toUpperCase());

            } catch (NullPointerException e) {
                throw new RuntimeException(e);
            } finally {
                scanner.close();
            }

            try {
                System.out.println("Tenho " + age + " anos ");

            } catch (Exception e) {
                throw new RuntimeException(e);

            } finally {
                scanner.close();
            }

            try {
                System.out.println("Minha altura é " + height + "cm ");

            } catch (Exception e) {
                throw new RuntimeException(e);

            } finally {
                scanner.close();
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }

    }
}
