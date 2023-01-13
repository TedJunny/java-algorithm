package binarysearch;

public class FirstBadVersion_278 extends VersionControl{
    public int firstBadVersion(int n) {
        int firstVer = 1;
        int lastVer = n;

        while (firstVer <= lastVer) {
            int midVer = firstVer + (lastVer - firstVer) / 2;
            if (isBadVersion(midVer) == false) {
                firstVer = midVer + 1;
            } else {
                lastVer = midVer - 1;
            }
        }

        return firstVer;
    }
}
