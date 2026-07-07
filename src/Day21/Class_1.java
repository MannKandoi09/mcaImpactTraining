package Day21;

import java.util.Scanner;
public class Class_1{
    public static void main(String[] mann){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String events = "";
        String odds = "";

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num % 2 == 0){
                events = num + " " + events;
            }else{
                odds = num + " " + odds;
            }
        }
        System.out.print(events + odds);
    }
}