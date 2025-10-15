import java.util.ArrayList;
import java.util.Collections;

public class q9 {
    public static void main(String[] args) {
        String input = "NIT Bhopal MCA Program";
        char[] sortedVowels = extractAndSortVowels(input);

        System.out.print("Sorted vowels: ");
        for (char c : sortedVowels) {
            System.out.print(c + " ");
        }
    }

    public static char[] extractAndSortVowels(String str) {
        String vowels = "aeiouAEIOU";
        ArrayList<Character> vowelList = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelList.add(c);
            }
        }

        Collections.sort(vowelList); // Sorts alphabetically (uppercase before lowercase)

        // Convert ArrayList to char[]
        char[] sortedArray = new char[vowelList.size()];
        for (int i = 0; i < vowelList.size(); i++) {
            sortedArray[i] = vowelList.get(i);
        }

        return sortedArray;
    }
}