package easyInterview;

import java.util.Arrays;

public class MoveZeroes{
    public static void main(String[] args) {
        int[] nums = {1,2,0,3,4,0,0,6,9};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int[] moveZeroes(int[] nums){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 ){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
        return nums;
    }

}
