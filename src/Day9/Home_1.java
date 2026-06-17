package Day9;

// You are using Java
import java.util.Scanner;
public class Home_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++){
            boolean swapped = false;
            for(int j  = 0; j < n - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];;
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                    printArray(arr);
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.print("The Array after Bubble sort is: ");
        printArray(arr);
    }
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + (i == arr.length-1? "" : " "));
        }
        System.out.println();
    }
}
