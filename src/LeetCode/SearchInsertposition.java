package LeetCode;

public class SearchInsertposition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
        /*
       nums = [1,3,4,5,6]
       target = 5

       left = 0, right = 3
       mid = 1
       nums[1] = 3 < 5
       left = 2
       mid = 2
       nums[2] = 5 == target
       return 2
       */
            int left = 0;
            int right = nums.length - 1;

            while(left <= right){
                int mid = left + (right - left) / 2;

                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }

            return left;

        }
    }
}
