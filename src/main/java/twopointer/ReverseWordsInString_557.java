package twopointer;

public class ReverseWordsInString_557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int l = 0, h = chars.length - 1;
            while (l < h) {
                char tmp = chars[l];
                chars[l++] = chars[h];
                chars[h--] = tmp;
            }
            words[i] = new String(chars);
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        ReverseWordsInString_557 reverseWordsInString_557 = new ReverseWordsInString_557();
        System.out.println(reverseWordsInString_557.reverseWords("Let's take LeetCode contest"));
    }
}
