package Day13;

import java.util.*;
public class DailyChallange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] a = sc.nextLine().replace(" ", "").toLowerCase().toCharArray();
        char[] b = sc.nextLine().replace(" ", "").toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b) ? "Anagrams" : "Not Anagrams");
    }
}
