package Day18;

import java.util.Scanner;
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] b = new int[9][9];
        for(int i = 0 ; i < 81; i++) if(sc.hasNextInt()) b[i / 9][i % 9] = sc.nextInt();
        if(solve(b,0,0)){
            for(int i = 0; i < 9; i++){
                for(int j =0; j < 9; j++){
                    System.out.println(b[i][j] +(j == 8 ? "" : " "));
                }
                System.out.println();
            }


        }else{
            System.out.println("No Solution existes");
        }
    }
    static boolean solve(int[][] b, int r, int c){
        if(r == 9) return true;
        if(c == 9) return solve(b, r + 1, 0);
        if(b[r][c] != 0) return solve(b, r, c+1);

        for(int n = 1; n <= 9; n++){
            if(valid(b,r,c,n)){
                b[r][c] = n;
                if(solve(b,r,c+1)) return true;
                b[r][c] = 0;
            }
        }
        return false;
    }
    static boolean valid(int[][]b, int r, int c, int n){
        for(int i = 0; i < 9; i++){
            if(b[r][i] == n || b[i][c] == n || b[3 * (r / 3) + i /3][3 * (c / 3) + i % 3] == n)
        }
    }

        return true;
}

}

 */