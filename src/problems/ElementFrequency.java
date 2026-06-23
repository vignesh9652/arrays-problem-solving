package problems;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] nums = {2,2,2,3,3,2,3,4,4};
        countFrequency(nums);
    }

    public static void countFrequency(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean hasCompleted = false;
            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]) {
                    hasCompleted = true;
                    break;
                }
            }
            if (hasCompleted){
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            System.out.println(nums[i] + " --> " + count);
        }
    }
}
