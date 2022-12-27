package practice;

import java.util.*;

public class CoolNumbers {

    private static final char[] VALID_LETTERS =
            {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
    private static final int MAX_REGION = 199;

    public static List<String> generateCoolNumbers() {
        ArrayList<String> numbers = new ArrayList<>();

        char[] letters = new char[3];
        //Generating letter
        for (char validLetter : VALID_LETTERS) {
            letters[0] = validLetter;
            for (char letter : VALID_LETTERS) {
                letters[1] = letter;
                for (char c : VALID_LETTERS) {
                    letters[2] = c;
                    //Generating region number
                    for (int i = 1; i < MAX_REGION; i++) {
                        String region = String.valueOf(i).length() == 1 ?
                                ("0" + i) : String.valueOf(i);
                        //Generating beautiful number
                        for (int j = 1; j < 10; j++) {
                            String number = String.valueOf(letters[0]) +
                                    j + j + j +
                                    letters[1] + letters[2] +
                                    region;
                            numbers.add(number);
                        }
                    }
                }
            }
        }

        return numbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
