package slidingwindow;

import java.util.Arrays;

public class CheckInclusion_567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int x = s1.length(), y = s2.length();
        int[] array1 = new int[26], array2 = new int[26];

        for (int i = 0; i < x; i++) {
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;
        }

        for (int i = x; i < y; i++) {
            if (Arrays.equals(array1, array2)) return true;
            array2[s2.charAt(i - x) - 'a']--;
            array2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(array1, array2)) {
            return true;
        }

        return false;
    }
}
