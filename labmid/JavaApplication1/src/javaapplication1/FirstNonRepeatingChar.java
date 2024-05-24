package javaapplication1;

/**
 *
 * @author fa21-bse-033
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        String str = "";
        Character result = firstNonRepeatingChar(str);
        System.out.println("First non-repeating character is: " + result);
    }
}