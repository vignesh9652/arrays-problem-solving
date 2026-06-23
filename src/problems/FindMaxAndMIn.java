package problems;

public class FindMaxAndMIn {
    public static void main(String[] args) {
     int[] nums = {12,3,4,2,7};
     findMaxAndMin(nums);
    }
    public static void findMaxAndMin(int[] nums){
        int max = nums[0];
        int min = nums[0];
        for(int num : nums){
            if(num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
