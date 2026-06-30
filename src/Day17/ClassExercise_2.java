package Day17;

import java.util.Scanner;

// You are using Java
public class ClassExercise_2{
    public static int politeness(int n){
        while(n % 2 == 0){
            n /= 2;
        }
        int divisors = 1;

        for(int i = 3; i * i <= n; i += 2){
            int count = 0;

            while(n % i == 0){
                count++;
                n /= i;

            }
            if(count > 0){
                divisors *= (count + 1);
            }
        }
        if(n > 1){
            divisors *= 2;
        }
        return divisors - 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(politeness(n));

        scanner.close();
    }
}

