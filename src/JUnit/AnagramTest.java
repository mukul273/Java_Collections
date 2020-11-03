package JUnit;

import Karat.AnagramSets;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    
    private static AnagramSets ana;
    
    @BeforeAll
    public static void initialize() {
        ana = new AnagramSets();
    }
    
    @Test
    void getAnaSets() {
        List<List<String>> l = new ArrayList<>();
        List<String> li = new ArrayList<>(Arrays.asList("LOOPED", "POODLE"));
        l.add(li);
        
        List<String> lo = new ArrayList<>(Arrays.asList("ALLERGY", "GALLERY", "LARGELY"));
        l.add(lo);
        
        String[] strs = new String[]{"LOOPED", "POODLE", "ALLERGY", "GALLERY", "LARGELY"};
        assertEquals(l, ana.getAnaSets(strs));
        strs[0] = "REPLACED";
        assertNotEquals(l, strs);
    }

}
