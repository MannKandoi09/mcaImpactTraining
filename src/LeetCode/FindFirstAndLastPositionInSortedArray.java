package LeetCode;

public class FindFirstAndLastPositionInSortedArray {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1, 1};

            ans[0] = firstPosition(nums, target);
            ans[1] = lastPosition(nums, target);

            return ans;

        }
        public int firstPosition(int[] nums, int target){
            int left = 0, right = nums.length - 1;
            int ans = -1;

            while(left <= right){
                int mid = left + (right - left) / 2;

                if(nums[mid] == target){
                    ans = mid;
                    right = mid - 1;
                }else if (nums[mid] < target){
                    left = mid + 1;
                }else{
                    right =  mid - 1;
                }
            }
            return ans;
        }

        public int lastPosition(int[] nums, int target){
            int left = 0, right = nums.length - 1;
            int ans = -1;

            while(left <= right){
                int mid = left + (right - left) / 2;

                if(nums[mid] == target){
                    ans = mid;
                    left = mid + 1;
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return ans;
        }
    }
}
