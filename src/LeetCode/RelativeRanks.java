package LeetCode;
import java.util.*;
public class RelativeRanks {
    class Solution {
        public String[] findRelativeRanks(int[] score) {
            int n = score.length;
            int[] arr = score.clone();

            Arrays.sort(arr);

            HashMap<Integer, Integer> map = new HashMap<>();

            int rank = 1;
            for (int i = n - 1; i >= 0; i--) {
                map.put(arr[i], rank++);
            }

            String[] ans = new String[n];

            for (int i = 0; i < n; i++) {
                int r = map.get(score[i]);

                if (r == 1) {
                    ans[i] = "Gold Medal";
                } else if (r == 2) {
                    ans[i] = "Silver Medal";
                } else if (r == 3) {
                    ans[i] = "Bronze Medal";
                } else {
                    ans[i] = String.valueOf(r);
                }
            }

            return  ans;
        }
    }
}
