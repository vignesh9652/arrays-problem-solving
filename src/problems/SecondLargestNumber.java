package problems;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] nums = {12,13,14,45,67};
        System.out.println(secondLargestNumber(nums));
    }
    public static int secondLargestNumber(int[] nums) {
//        int max = nums[0];
//        int secondMax = nums[0];
//        for(int num : nums){
//            if(num > max){
//                max = num;
//            }
//        }
//        for(int num : nums){
//            if(num > secondMax && num != max){
//                secondMax = num;
//            }
//        }
//        return secondMax;
//    }
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums){
            if (num > max){
                secondMax = max;
                max = num;
            } else if (num > secondMax && num!= max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
