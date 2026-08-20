package LeetCode;

public class MinSwapAlteranate {
    class Solution {
        public int minSwaps(int[] nums) {
            int even = 0, odd = 0;

            for (int num : nums) {
                if (num % 2 == 0)
                    even++;
                else
                    odd++;
            }

            if (Math.abs(even - odd) > 1)
                return -1;
            if (even == odd) {
                return Math.min(
                        swaps(nums, 0),
                        swaps(nums, 1)
                );
            }

            if (even > odd)
                return swaps(nums, 0);

            return swaps(nums, 1);
        }

        private int swaps(int[] nums, int startParity) {
            int expected = startParity;
            int swaps = 0;
            int target = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == expected) {
                    swaps += Math.abs(i - target);
                    target += 2;
                }
            }

            return swaps;
        }
    }
}
