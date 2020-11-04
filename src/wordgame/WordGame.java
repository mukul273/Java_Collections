package wordgame;

import java.util.HashMap;
import java.util.Map;

public class WordGame {
    
    public boolean wordGame(char[] chars, String word) {
        
        if (chars == null || chars.length == 0) {
            return false;
        }
        
        // store character into maps and count their frequencies.
        Map<Character, Integer> resourceMp = charCount(chars);
        Map<Character, Integer> queryMp = charCount(word.toCharArray());
        
        // if the word can be made up by the elements in char array,
        // then the frequencies of all elements in the word's map
        // should be all smaller or equal to the frequencies of the ones
        // in char array's map.
        for (Character key : queryMp.keySet()) {
            // if the current char does not exist in char array,
            // then return false - this word cannot be made up from char array.
            if (!resourceMp.containsKey(key)) {
                return false;
            } else {
                int vResource = resourceMp.get(key);
                int vQuery = queryMp.get(key);
                if (vResource < vQuery) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    // simple character count function.
    private Map<Character, Integer> charCount(char[] chars) {
        Map<Character, Integer> mp = new HashMap<>();
        
        for (Character c : chars) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        
        return mp;
    }
}
