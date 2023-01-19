import java.util.*;
import java.util.stream.Collectors;

public class LengthOfLongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();
        List<Character> charArray = new ArrayList<>();

        for (char aChar : chars) {
            if (!charArray.contains(aChar)) {
                charArray.add(aChar);
            } else {
                charArray.removeAll(charArray.subList(0, charArray.indexOf(aChar) + 1));
                charArray.add(aChar);
            }
            maxLength = Math.max(charArray.size(), maxLength);
        }

        return maxLength;
    }

    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring_3 lengthOfLongestSubstring = new LengthOfLongestSubstring_3();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring2("pwwkew"));
    }
}
