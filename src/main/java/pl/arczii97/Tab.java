package pl.arczii97;

import java.util.Scanner;


public class Tab {
    public static void main(String[] args) {

        int[] board = {10, 20, 30, 40, 50};

        checkIndexInTheTable(board);
    }

    private static void checkIndexInTheTable(int[] board) {
        boolean correctIndex = false;

        while (!correctIndex) {
            try {
                System.out.println("Podaj index tablicy: ");
                Scanner scan = new Scanner(System.in);
                int index = scan.nextInt();

                System.out.println(board[index]);
                correctIndex = true;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Niepoprawny index !");
            }
        }
    }
}

