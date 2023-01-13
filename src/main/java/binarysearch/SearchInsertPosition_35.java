package binarysearch;

public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int leftIdx = 0, rightIdx = nums.length - 1, midIdx = 0;

        while (leftIdx <= rightIdx) {
            System.out.println("leftIdx = " + leftIdx + " rightIDx = " + rightIdx);
            midIdx = leftIdx + (rightIdx - leftIdx) / 2;
            if (nums[midIdx] == target) {
                return midIdx;
            } else if (nums[midIdx] > target) {
                rightIdx = midIdx - 1;
            } else {
                leftIdx = midIdx + 1;
            }
            System.out.println("leftIdx = " + leftIdx + " rightIDx = " + rightIdx);
            System.out.println("midIdx = " + midIdx);
        }

        return leftIdx;
    }

    public static void main(String[] args) {
        SearchInsertPosition_35 binarySearch708 = new SearchInsertPosition_35();
        System.out.println(binarySearch708.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
