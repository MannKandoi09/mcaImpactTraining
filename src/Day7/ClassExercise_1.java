package Day7;// You are using Java
import java.util.*;
public class ClassExercise_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            int r = sc.nextInt();
            int c = sc.nextInt();

            int arr[][] = new int[r][c];
            for(int i = 0 ; i < r; i++){
                for(int j = 0; j < c; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();

            int temp[] = arr[r1];
            arr[r1] = arr[r2];
            arr[r2] = temp;

            for(int i = 0; i < r;  i++){
                for(int j = 0; j < c; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
            n--;
        }
    }
}