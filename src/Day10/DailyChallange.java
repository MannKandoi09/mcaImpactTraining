package Day10;

// You are using Java
import java.util.Scanner;
public class DailyChallange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        }
        for(int i = 0 ; i < n; i++){
            boolean swapped = false;

            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.print("After iteration " + (i + 1) + ": ");
            printArray(arr);

        }
        System.out.print("Sorted array: ");
        printArray(arr);
    }
    public static void printArray(double[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.printf("%.2f", arr[i]);
            if(i < arr.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}