package problems;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4};
        System.out.println(Arrays.toString(removeDuplicatese(nums)));
    }

    public static int[] removeDuplicatese(int[] nums){
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]){
               uniqueIndex++;
               nums[uniqueIndex] = nums[i];
            }
        }
        System.out.println(uniqueIndex);
        return nums;
    }
}
