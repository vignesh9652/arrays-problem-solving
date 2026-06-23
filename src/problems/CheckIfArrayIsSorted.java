package problems;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = {7,6,5,4,3};
        int[] nums2 = {1,2,3,4,5};
        int[] nums3 = {3,4,2,5};
        checkIfArrayIsSorted(nums);
        checkIfArrayIsSorted(nums2);
        checkIfArrayIsSorted(nums3);
    }
    public static void checkIfArrayIsSorted(int[] nums){
        boolean ascending = true;
        boolean descending = true;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                ascending = false;
            }
            if(nums[i] < nums[i+1]){
               descending = false;
            }
        }
        if (ascending){
            System.out.println("Ascending");
        } else if (descending) {
            System.out.println("Descending");
        }else {
            System.out.println("Not Sorted");
        }
    }
}
