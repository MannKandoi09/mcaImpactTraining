package LeetCode;

public class ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
        /*
        height =  [1,8,6,2,5,4,8,3,7]
        left = 0
        right = 8;

        Area = min(1,7) * 8 = 8
        Move left (1 is smaller)

        left = 1
        right = 8
        Area = min(8,7) * 7 - 49 <-- Maximum
        Move right (7 is smaller)

        right = 7
        Area right(7 is smaller)

        Continue...
        Maximum remains 49
        */

            int left = 0;
            int right = height.length-1;
            int maxArea = 0;

            while(left < right){
                int area = Math.min(height[left], height[right]) * (right - left);
                maxArea = Math.max(maxArea, area);

                if(height[left] < height[right]){
                    left ++;
                }else{
                    right--;
                }
            }

            return maxArea;
        }
    }
}
