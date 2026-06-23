package problems;

public class FindSumOfArray {
    static void main(String[] args) {
        int[] nums  = {10,40,5};
        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int value = nums[i];
//            sum = value + sum;
//        }
         for(int num : nums){
             sum += num;
         }
        System.out.println(sum );
    }
}
