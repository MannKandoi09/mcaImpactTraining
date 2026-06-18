package Day10;

// You are using Java
import  java.util.Scanner;
public class ClassExercise_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int first = findFirst(arr,0, n-1, x, -1);
        int last = findLast(arr,0,n-1,x,-1);

        if(first == -1){
            System.out.println("NO OCCURRENCES");
        }else{
            System.out.println(first + " " + last);
        }
    }
    public static int findFirst(int[] arr, int low, int high, int x , int res){
        if(low > high) return res;
        int mid  = low + (high - low) / 2;

        if(arr[mid] == x){
            return findFirst(arr, low, mid - 1, x ,mid);
        }else if(arr[mid] > x){
            return findFirst(arr, low, mid - 1, x ,res);
        }else{
            return findFirst(arr, mid + 1, high, x, res);
        }
    }
    public static int findLast(int[] arr, int low, int high, int x, int res){
        if(low > high) return res;
        int mid = low + (high - low) / 2;
        if(arr[mid] == x){
            return findLast(arr, mid + 1, high , x , mid);
        }else if(arr[mid] > x){
            return findLast(arr, low, mid - 1, x , res);
        }else{
            return findLast(arr,mid + 1, high, x, res);
        }
    }


}