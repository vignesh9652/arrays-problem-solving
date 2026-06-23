package problems;

public class FindMaximumElement {
    static void main(String[] args) {
        int[] nums = {1,4,590,3,90};
        int max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
        for(int num : nums)
            if(num > max)
                max = num;
        System.out.println("Maximum number: " +max);
    }
}
