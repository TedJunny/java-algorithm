package twopointer;

public class ReverseString_344 {
    public void swap(char[] s, int i, int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }

    public void reverseString(char[] s) {
        int lt = 0, rt = s.length - 1;
        while (lt < rt) {
            swap(s, lt, rt);
            lt++;
            rt--;
        }
    }
}
