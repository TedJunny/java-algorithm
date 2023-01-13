package binarysearch;

public class BinarySearch_708 {
    public int search(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length - 1;

        while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            if (nums[midIdx] == target) {
                return midIdx;
            } else if (nums[midIdx] > target) {
                rightIdx = midIdx - 1;
            } else {
                leftIdx = midIdx + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch_708 binarySearch708 = new BinarySearch_708();
        System.out.println(binarySearch708.search(new int[]{-1, 0, 5}, -1));
    }
}
