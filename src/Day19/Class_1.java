package Day19;

import java.util.*;
public class Class_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] a = new long[sc.nextInt()];
        for(int i =0; i < a.length; i++) a[i]  = sc.nextLong();
        sort(a, 0, a.length -1);
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + (i == a.length - 1? "": " "));
    }
    static void sort(long[] a, int l, int r){
        if(l >= r)return;
        int m = (l + r) / 2;
        sort(a,l,m);
        sort(a,m+1,r);
        long[] b = new long[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while(i <= m &&  j <= r) b[k++] = (a[i] < a[j])? a[i++] : a[j++];
        while(i <= m) b[k++] = a[i++];
        while(j <= r) b[k++] = a[j++];
        System.arraycopy(b,0,a,l,b.length);

    }
}
