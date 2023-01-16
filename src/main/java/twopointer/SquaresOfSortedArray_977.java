package twopointer;

import binarysearch.SearchInsertPosition_35;

public class SquaresOfSortedArray_977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int leftAbs = Math.abs(nums[left]);
            int rightAbs = Math.abs(nums[right]);
            result[result.length - i - 1] = (int) Math.pow(Math.max(leftAbs, rightAbs), 2);

            if (leftAbs > rightAbs) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray_977 squaresOfSortedArray_977 = new SquaresOfSortedArray_977();

        for (int i : squaresOfSortedArray_977.sortedSquares(new int[]{-4, -1, 0, 3, 4})) {
            System.out.println("i = " + i);
        }
    }
}
