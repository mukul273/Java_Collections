package Karat;

import java.util.*;

public class AnagramSets {
    
    public List<List<String>> getAnaSets(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }
        
        List<List<String>> ret = new ArrayList<>();
        
        Map<String, ArrayList<String>> mp = new LinkedHashMap<>();
        
        String tmp;
        
        // sort each string element and
        // add them into the corresponding <key,value> pairs in mp.
        for (String s : strs) {
            char[] chars = s.toCharArray();
            // sort the char array.
            Arrays.sort(chars);
            // reform a string.
            tmp = new String(chars);
            if (mp.containsKey(tmp)) {
                mp.get(tmp).add(s);
            } else {
                mp.put(tmp, new ArrayList<>(Arrays.asList(s)));
            }
        }
        
        // for every valid anagram set, its length must larger than 1.
        for (List<String> ls : mp.values()) {
            if (ls.size() >= 2) {
                ret.add(ls);
            }
        }
        
        return ret;
    }
}
