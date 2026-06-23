package problems;

import java.util.Scanner;

public class SearchAnElement {
    public static void main(String[] args) {
        int[] nums = {12,5,4,2,76};
        searchAnElement(nums);
    }
    public static void searchAnElement(int[] nums){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Target Element :");
        int target  = scanner.nextInt();
        for (int num : nums){
           if(num == target){
               System.out.println("Element Found");
               return;
           }
        }
        System.out.println("Element Not Found");
    }
}
