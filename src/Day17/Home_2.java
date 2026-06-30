package Day17;

public class Home_2 {
    public static int checkPowerful(int n) {
        return findFactors(n, 2, 1);
    }

    private static int findFactors(int n, int i, int res) {
        if (i > n) return res;

        if (n % i == 0) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) isPrime = false;
            }
            if (isPrime) {
                System.out.println("Prime factor: " + i + ", Square: " + (i * i));
                if (n % (i * i) != 0) res = 0;
            }
        }
        return findFactors(n, i + 1, res);

    }
}