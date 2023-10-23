import java.util.*;
public class majorityele {
    public static Integer findMajorityElement(int[] nums) {
        int majorityNum = 0;
        int count = 0;

        for (int i=0; i<nums.length;i++) {        //here found the majority element in the array
            if (count == 0) {
                majorityNum = nums[i];
                count = 1;
            } else if (nums[i] == majorityNum) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i=0; i<nums.length;i++) {        //no.of times majority element occuring
            if (nums[i] == majorityNum) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return majorityNum;
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 2, 4, 2, 3};
        Integer majorityElement = findMajorityElement(nums);

        if (majorityElement != null) {
            System.out.println("Majority element: " + majorityElement);
        } else {
            System.out.println("No majority element found");
        }
    }
}
