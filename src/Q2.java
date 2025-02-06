public class Q2 {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        final int TOTAL_NUMBERS = 100;

        System.out.println("The first 100 pentagonal numbers are:");
        for (int i = 1; i <= TOTAL_NUMBERS; i++) {
            System.out.printf("%-6d", getPentagonalNumber(i));
            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}
