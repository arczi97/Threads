package pl.arczii97;

public class Varargs {
    public static void main(String[] args) {
        sumOfVarargs();

        System.out.println("Suma wszystkich varargsow wynosi: " + sumOfVarargs(5, 10,20,30,40));
    }

    private static int sumOfVarargs(int... values) {

        int sum = 0;
        try {
            if (values.length > 0) {
                for (int value : values) {
                    sum += value;
                }
            } else {
                throw new NoVarArgsArgumentException("Nie przekazales zadnego argumentu!");
            }
        } catch (NoVarArgsArgumentException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }
}
