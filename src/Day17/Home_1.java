package Day17;

public class Home_1 {
    public static int productOfDivisors(int n, int temp, int i) {
        if (i > n) {
            return 1;
        }
        if (n % i == 0) {
            return i * productOfDivisors(n, temp, i + 1);
        } else {
            return productOfDivisors(n, temp, i + 1);
        }

    }
}
