package Day17;

import java.util.Scanner;

class Main{
    static void primeFactors(int n, int i){
        if(n == 1){
            return;
        }

        if(n % i == 0){
            System.out.print(i + " ");
            primeFactors(n/i, i);
        }else{
            primeFactors(n, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.print("Prime factors of " + N + " are: ");
        primeFactors(N, 2);

        scanner.close();
    }
}
