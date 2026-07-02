package Day19;

import java.util.*;
public class Class_2{
    static void mergeSort(int[] a, int l, int r){
        if(l >= r);
        int m = (l + r)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        int[] temp = new int[r - l + 1];
        int i = l, j= m + 1, k = 0;

        while(i <= m && j <= r)
            temp[k++] = (a[i] < a[j]) ? a[i++] : a[j++];
        while(i <= m) temp[k++] = a[i++];
        while(j <= r) temp[k++] = a[j++];

        for(i = 0; i < temp.length; i++)
            a[l + i] = temp[i];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[2000];
        int i;
        for (i = 0; i < n; i++) a[i] = sc.nextInt();
        int m = sc.nextInt();
        for (i = 0; i < m; i++) a[n + i] = sc.nextInt();
        mergeSort(a, 0, n + m - 1);
        for (i = 0; i < n + m; i++)
            System.out.print(a[i] + " ");
    }
}