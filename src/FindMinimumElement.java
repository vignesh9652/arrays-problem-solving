public class FindMinimumElement {
    static void main(String[] args) {
        int[] nums = {10,5,3,8,1};
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
          if(nums[i] < min){
              min = nums[i];
          }
        }
        System.out.println(min);
    }
}
