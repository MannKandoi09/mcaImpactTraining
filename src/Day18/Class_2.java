package Day18;

import java.util.*;
public class Class_2{
    static int c = 0;
    static boolean[] v;
    static HashSet<String> h = new HashSet<>();

    static void fun(String[] a, ArrayList<String>l){
        if(l.size() == a.length){
            for(String s: l)System.out.print(s + " ");
            System.out.println();
            c++;
            return;
        }
        for(int i = 0; i < a.length; i++){
            if(!v[i]){

                if(!l.isEmpty() && h.contains(l.get(l.size() - 1) + "#" + a[i]))
                    continue;

                v[i] = true;
                l.add(a[i]);
                fun(a,l);
                l.remove(l.size() - 1);
                v[i] = false;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a =  new String[n];
        for(int i = 0; i < n; i++) a[i] = sc.next();

        int m = sc.nextInt();
        for(int i = 0; i < m; i++){

            String x = sc.next(), y = sc.next();
            h.add(x + "#" + y);
            h.add(y + "#" + x);
        }
        v = new boolean[n];
        fun(a, new ArrayList<>());
        System.out.println("Total Possible rune sequences count" + c);
    }
}
