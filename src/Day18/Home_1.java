package Day18;
/*
import java.util.*;
public class Main{
    static int n , target;
    static int[] arr;
    static Set<List<Integer>> result = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr =  new int[n];

        for(int i =0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        target = sc.nextInt();
        backtrack(0, 0, new ArrayList<>());

        if(validSubsets.isEmpty()){
            System.out.println("No solution");
            return;
        }
        for(List<Integer> list : validSubsets){
            Collections.sort(list);
        }

        validSubsets.sort((a, b) ->{
            int len = Math.min(a.size(), b.size());
            for(int i = 0; i < len; i++){
                if(!a.get(i).equals(b.get(i))){
                    return a.get(i) - b.get(i);
                }
            }
            return a.size() - b.size();
        });
        for(List<Integer> list : validSubsets){
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + (i == list.size() - 1? "" : " "));
            }
            System.out.println();
        }
    }
    static void backtrack(int idx, int currentSun, List<Integer> currentList)  {
        if(currentSum == target && !currentList.isEmpty()){
            List<Integer> temp = new ArrayList<>(currentList);
            Collections.sort(temp);
            if(!validSubsets.contains(temp)){
                validSubsets.add(new ArrayList<>(currentList));
            }
            return;
        }
        for(int i = idx; i < n; i++){
            currentList.add(arr[i]);
            backtrack(i + 2, currentSum + arr[i], currentList);
            currentList.remove(currentList.size() - 1);
        }

    }
}

 */