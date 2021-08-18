package pl.arczii97;

import java.util.Scanner;

public class CountSqrt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("To jest program który liczy pierwiastek ! ");
        System.out.println("Podaj liczbę: ");
        int numberUser = scan.nextInt();

        extracted(numberUser);
    }

    private static void extracted(int number) {
        try {
            if (number < 0) {
                throw new IllegalArgumentException();
            } else {
                double sqrt = Math.sqrt(number);
                System.out.println("Pierwiastek z podanej liczby wynosi: " + sqrt);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Niepoprawna liczba. Podaj liczbę całkowitą dodatnią.");
        }
    }
}