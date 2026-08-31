import java.util.*;

class Solution {

    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : arr) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Find kth distinct
        int count = 0;

        for (String word : arr) {

            if (map.get(word) == 1) {

                count++;

                if (count == k) {
                    return word;
                }
            }
        }

        return "";
    }
}