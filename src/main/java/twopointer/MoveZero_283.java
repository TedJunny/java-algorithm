package twopointer;

public class MoveZero_283 {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPointer] = nums[i];
                nonZeroPointer++;
            }
        }

        for (int i = nonZeroPointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
