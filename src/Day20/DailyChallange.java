package Day20;

import java.util.Scanner;
public class DailyChallange{
    public static void main(String[] mann){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int eventCount = 0;
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
            if(scores[i] % 2 == 0){
                eventCount++;
            }
        }
        quickSort(scores, 0, n -1);
        for(int i = 0; i < n; i++){
            System.out.println(scores[i] + (i == n -1? "" : " "));
        }
        System.out.println();
        System.out.println(eventCount);
    }
    private static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi - 1);
            quickSort(arr, pi +1 , high);

        }
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
