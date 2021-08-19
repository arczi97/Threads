package pl.arczii97;

public class PrintingString {
    public static void main(String[] args) {

        /*Create the method which will receive two parameters - one the number(int) and second the random string (String).
        The method should display the coming random string number times.
        In case when number is less or equal than zero the method should throw an Exception called IndexOutOfBoundsException,
        In the second case when the random string will be null the method should throw an IllegalArgumentException. */

        printNumberAndName(3, "Artur");
        printNumberAndName(0, "Artur");
        printNumberAndName(3, null);
    }

    private static void printNumberAndName(int number, String randomString) {
        try {
            if (randomString == null) {
                throw new IllegalArgumentException("Napis jest nullem.");
            }

            if (number <= 0) {
                throw new IndexOutOfBoundsException("Liczba wystąpień mniejsza bądź równa zero.");
            } else {
                for (int i = 0; i < number; i++) {
                    System.out.println("Twój napis to: " + randomString);
                }
            }
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
