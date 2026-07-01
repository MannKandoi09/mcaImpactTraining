package Day18;

import java.util.*;
public class  Class_1{
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static void solve(int n , int start, ArrayList<Integer>list){
        if(n == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i <=n; i++){
            list.add(i);
            solve(n - i, i,list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n,1,new ArrayList<>());
        System.out.println(ans);
    }
}