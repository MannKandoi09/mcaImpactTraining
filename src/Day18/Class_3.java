package Day18;

import java.util.*;
public class Class_3{
    static ArrayList<Integer> a = new ArrayList<>();
    static void fun(int[] arr, int i, int sum){
        if(i == arr.length){
            a.add(sum);
            return;
        }
        fun(arr, i + 1, sum);
        fun(arr, i + 1, sum + arr[i]);

    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        fun(arr,0,0);
        Collections.sort(a);
        System.out.print(a);
    }
}
