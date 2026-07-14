package LeetCode;

public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            int ans = 0;
            for(int num : nums){
                ans ^= num;

            }

            return ans;
        }
    }
}
