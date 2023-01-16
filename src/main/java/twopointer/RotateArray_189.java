package twopointer;

public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int left = 0, right = nums.length - k;
        int[] tmpArrNum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            tmpArrNum[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (k != 0) {
                k--;
                nums[i] = tmpArrNum[right];
                right++;
                continue;
            }

            nums[i] = tmpArrNum[left++];
        }
    }

    public void rotate2(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray_189 rotateArray_189 = new RotateArray_189();
        int[] nums = {1, 2, 3, 4};
        rotateArray_189.rotate2(nums, 2);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
