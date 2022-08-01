package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public static void main(String[] args) {
        printGreatest(1, -1);
    }
    public static void printGreatest(int first, int second) {
        int greatest = 0;

        greatest = first > second ? first : second;

        System.out.println(greatest);
    }
}
