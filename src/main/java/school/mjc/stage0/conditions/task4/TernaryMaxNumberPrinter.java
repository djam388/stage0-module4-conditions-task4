package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void main(String[] args) {
        printGreatest(2,4,1);
    }
    public static void printGreatest(int first, int second, int third) {
        int greatest = 0;

        greatest = first > second ? first : second;
        greatest = greatest < third ? third : greatest;

        System.out.println(greatest);
    }
}
