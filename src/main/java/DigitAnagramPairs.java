import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DigitAnagramPairs {

    public static int countDigitAnagram(int[] a) {
        Map<String, Integer> digitFrequency = new HashMap<>();
        int count = 0;

        for (int num : a) {
            String sortedDigits = sortDigits(num);

            if (digitFrequency.containsKey(sortedDigits)) {
                count += digitFrequency.get(sortedDigits);
                digitFrequency.put(sortedDigits, digitFrequency.get(sortedDigits) + 1);
            } else {
                digitFrequency.put(sortedDigits, 1);
            }
        }

        return count;
    }

    private static String sortDigits(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }

    public static void main(String[] args) {
        int[] array = {123, 231, 312, 421, 144, 244};
        int result = countDigitAnagram(array);
        System.out.println("Number of digit anagram pairs: " + result);
    }
}