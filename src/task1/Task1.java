package task1;

public class Task1 {

    public static void main(String[] args) {
        int someBitMask = 321;
        int temp1 = 2;
        int temp2 = 6;
        System.out.println( " двоичный вид " + someBitMask + ": " +Integer.toString(someBitMask, 2));
        bitShift(someBitMask, temp1, temp2);
    }

    private static void bitShift(int someInt, int temp1, int temp2) {
        int mask1 = 1 << temp1;
        int mask2 = 1 << temp2;
        someInt = someInt | mask1;
        someInt = someInt ^ mask2;

        System.out.println( " двоичный вид " + someInt + ": " +Integer.toString(someInt, 2));
    }
}
