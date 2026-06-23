package problems;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] nums = {10,3,2,4,7,8,1};
        System.out.println( secondSmallestNumber(nums));
    }
    public static int secondSmallestNumber(int[] nums){
        int min = nums[0];
        int smallestMin = nums[0];
        for (int num : nums){
            if(num < min){
                min =num;
            }
        }
        for (int num : nums){
            if(num < smallestMin){
                smallestMin = num;
            }
        }
        return smallestMin;
    }
}
