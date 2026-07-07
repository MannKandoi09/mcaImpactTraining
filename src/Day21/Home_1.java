package Day21;

import java.util.Scanner;
import java.util.TreeSet;
public class Home_1{
    public static void main(String[] mann){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        for(int num : set){
            System.out.print(num + " ");
        }
    }
}