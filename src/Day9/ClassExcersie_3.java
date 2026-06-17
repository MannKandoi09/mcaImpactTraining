package Day9;

// You are using Java
import java.util.*;
public class ClassExcersie_3 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();

        }
        for(int i = 2; i < n; i++){
            int key = a[i] , j = i-2;
            while(j >=0 && a[j]< key){
                a[j+2] = a[j];
                j -= 2;
            }
            a[j+2] = key;
        }

        for(int i = 3; i < n; i+=2){
            int key = a[i], j = i - 2;
            while(j >= 1 && a[j] > key){
                a[j+2] = a[j];
                j -=2;
            }
            a[j+2] = key;
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

    }
}
