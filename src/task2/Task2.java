package task2;

import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        String someStringWithSpaces = "H e l l o        Wor ld !";
        trimSpaces(someStringWithSpaces);
    }

    private static void trimSpaces(String someString) {
        IntStream stream = someString.codePoints();
        String intStreamToString = stream.filter(x-> x != ' ').collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(intStreamToString);
    }
}
