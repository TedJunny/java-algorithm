package slidingwindow;

public class NumOfSubarrays_1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int result = 0;
        int sum = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k - 1) {
                avg = (double) sum / k;
                if (avg >= threshold) {
                    result++;
                }
                sum -= arr[i - (k - 1)];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        NumOfSubarrays_1343 numOfSubarrays_1343 = new NumOfSubarrays_1343();
        System.out.println((numOfSubarrays_1343.numOfSubarrays(new int[]{2, 1, 2, 2, 5, 5, 5, 8}, 3, 4)));
    }
}
