package array;

public class GarbageCollection_2391 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int result = 0;
        int lastPointIdxM = 0, lastPointIdxP = 0, lastPointIdxG = 0;

        for (int i = 0; i < garbage.length; i++) {
            result += garbage[i].length();
            lastPointIdxM = checkGarbage(garbage[i], 'M', lastPointIdxM, i);
            lastPointIdxP = checkGarbage(garbage[i], 'P', lastPointIdxP, i);
            lastPointIdxG = checkGarbage(garbage[i], 'G', lastPointIdxG, i);
        }

        result += minutesToTravel(travel, lastPointIdxM);
        result += minutesToTravel(travel, lastPointIdxP);
        result += minutesToTravel(travel, lastPointIdxG);

        return result;
    }

    public int checkGarbage(String garbage, char type, int lastIndex, int currentIdx) {
        if (garbage.indexOf(type) != -1) {
            return currentIdx;
        }
        return lastIndex;
    }

    private int minutesToTravel(int[] travel, int lastPointIdx) {
        int sum = 0;
        for (int i = 0; i < travel.length; i++) {
            if (lastPointIdx == 0) {
                return sum;
            }
            sum += travel[i];

            if (lastPointIdx == i + 1) {
                break;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        GarbageCollection_2391 garbageCollection = new GarbageCollection_2391();
        System.out.println(garbageCollection.garbageCollection(new String[]{"G", "P", "GP", "GG"}, new int[]{2, 4, 3}));
    }
}
