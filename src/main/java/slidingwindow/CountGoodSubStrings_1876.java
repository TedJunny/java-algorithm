package slidingwindow;

public class CountGoodSubStrings_1876 {
    public int countGoodSubstrings(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 2; i++) {
            if ((chars[i] != chars[i + 1]) && (chars[i] != chars[i + 2]) && (chars[i + 1] != chars[i + 2])) {
                result++;
            }
        }

        return result;
    }
}
