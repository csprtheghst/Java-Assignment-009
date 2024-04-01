import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        displayFactorialTable(30);
    }

    public static void displayFactorialTable(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
