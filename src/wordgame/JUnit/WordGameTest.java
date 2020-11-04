package wordgame.JUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import wordgame.WordGame;

import static org.junit.Assert.assertEquals;

public class WordGameTest {
    
    private static WordGame wg;
    
    @BeforeAll
    static void initialize() {
        wg = new WordGame();
    }
    
    @Test
    void wordGame() {
        char[] chars = new char[]{'B', 'Z', 'A', 'E', 'Z', 'D'};
        assertEquals(true, wg.wordGame(chars, "BED"));
        assertEquals(false, wg.wordGame(chars, "BEDS"));
        assertEquals(false, wg.wordGame(chars, "BEB"));
    }
}
