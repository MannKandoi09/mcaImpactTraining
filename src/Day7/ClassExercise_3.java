package Day7;
import java.util.*;
public class ClassExercise_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for(int i =0; i < r; i++){
            for(int j = 0; j < c ; j++){
                int val = sc.nextInt();

                if(j % 2  != 0){
                    matrix[i][j] = val * val;
                }else{
                    matrix[i][j] = val;
                }
            }
        }

        for(int i = 0; i < r; i++){
            System.out.print(matrix[i][c-1]);

            for(int j = 0; j < c - 1; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }


    }
}