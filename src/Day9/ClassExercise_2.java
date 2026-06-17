package Day9;

// You are using Java
import java.util.*;
public class ClassExercise_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        for(int i = 0; i < n -1 ; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted order: ");
        for(int i = 0 ; i < n; i ++){
            System.out.print(arr[i] + (i == n ? "" : " "));
        }
        System.out.println();
        System.out.println("The kth smallest price is: " + arr[k-1]);


    }
}
