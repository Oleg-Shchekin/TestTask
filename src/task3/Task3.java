package task3;

import java.math.BigDecimal;

public class Task3 {

    public static void main(String[] args) {
        double fractional = 1.234;
        int power = 50;
        exponFractionalNumber(fractional, power);
    }
    private static void exponFractionalNumber(double fractional, int power) {
        BigDecimal exponRezult = new BigDecimal(Math.pow(fractional, power));
        System.out.println(exponRezult);
    }
}

