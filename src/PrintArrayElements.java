public class PrintArrayElements {
    public static void main(String[] args) {
        int[] nums = {12,13,14,15};
        printArrayOfElements(nums);
    }
    public static void printArrayOfElements(int[] nums){
        for (int num : nums)
            System.out.println(num);
    }
}
