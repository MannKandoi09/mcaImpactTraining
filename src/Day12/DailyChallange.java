package Day12;

// You are using Java
import java.util.*;
public class DailyChallange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.nextLine();

        int n = s.length(), m = c.length();
        int count = 0;
        int[] a = new int[256];
        int[] b = new int[256];

        for(int i =0; i < m; i++){
            a[c.charAt(i)]++;
            b[s.charAt(i)]++;
        }
        for(int i = m ; i < n; i++){
            if(Arrays.equals(a,b))
                count++;

            b[s.charAt(i)]++;
            b[s.charAt(i - m)]--;
        }

        if(Arrays.equals(a,b))
            count++;

        System.out.print(count);
    }
}
