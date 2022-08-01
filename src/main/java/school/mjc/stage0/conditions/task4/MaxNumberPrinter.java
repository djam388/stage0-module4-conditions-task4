package school.mjc.stage0.conditions.task4;

import javax.print.attribute.standard.MediaSize;

public class MaxNumberPrinter {
    public static void main(String[] args) {
        printGreatest(3, 5, 14);
    }
    public static void printGreatest(int first, int second, int third) {
        int greatest = 0;
        if (first > second) {
            greatest = first;
        }
        else {
            greatest = second;
        }

        if (third > greatest) {
            greatest = third;
        }

        System.out.println(greatest);
    }
}
