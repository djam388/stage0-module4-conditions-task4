package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public static void main(String[] args) {
        assignAndPrintBasedOnWhichBigger(1, 2);
    }
    public static void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = 0;

        result = first > second ? 10 : -10;

        System.out.println(result);
    }
}
