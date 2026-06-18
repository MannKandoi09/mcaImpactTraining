package Day10;

// You are using Java
import java.util.Scanner;
public class ClassExercise_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int index = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();

        for(int i = 0 ; i < n; i++){
            if(arr[i] == search){
                count++;

            }if(count == 2){
                break;
            }
            index = i + 1;
        }
        if(count == 2){
            System.out.print(index);
        }else{
            System.out.println("key not found or found only once");
        }


    }
}
