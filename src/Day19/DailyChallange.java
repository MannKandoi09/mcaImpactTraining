package Day19;
/*
// You are using Java
import java.util.*;
public class DailyChallange{
    static int n,r,c,a[];
    static boolean f = false;

    static boolean solve(int i){
        if(i == n){
            f = true;
            for(int x = 0; x < n; x++){
                for(int y = 0; y < n; y++){
                    System.out.print(a[x] == y? "Q " : ". ");
                    System.out.println();
                }
                System.out.println();
                return;
            }
            if(i == r){
                if(ok(i,c)){
                    a[i] = c;
                    solve(i+1);
                }
                return;
            }
            for(int j = 0; j < n; j++){
                if(ok(i,j)){
                    a[i] = j;
                    solve(i+1);
                }
            }
            static boolean ok(int i, int j){
                for(int k = 0; k < i; k++){
                    if(a[k] == j || Math.abs(a[k] - j) == Math.abs(k-i))
                        return false;
                    return true;
                }

            }
        }
    }

    private static boolean ok(int i, int c) {
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        a = new int[n];
        solve(0);
        if(!if)System.out.print("No Solution");
    }
}

 */