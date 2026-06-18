package Day10;

// You are using Java
import java.util.Scanner;
public class ClassExercise_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int low = 0, high = n -1;
        int index = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == x){
                index = mid;
                break;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(index != -1){
            System.out.println("Book with ISBN " + x + " is available at index " + index);
        }else{
            System.out.println("Book with ISBN " + x + " is not available in the inventory");
        }
    }
}
