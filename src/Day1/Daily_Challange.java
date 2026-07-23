package Day1;

import java.util.Scanner;

public class Daily_Challange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first = scan.nextInt();
        System.out.println("Enter Second Number: ");
        int second = scan.nextInt();

        int result = first + second;
        System.out.println("Sum of your Numbers is: " + result);
    }
}
