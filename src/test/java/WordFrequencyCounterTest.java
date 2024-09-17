import Task_fouth.WordFrequencyCounter;

import java.util.Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFrequencyCounterTest {

    @Test
    public void testCountWordFrequency() {
        String sentence = "Hello world! Hello everyone.";
        Map result = WordFrequencyCounter.countWordFrequency(sentence);

        assertEquals(2, result.get("hello"));
        assertEquals(1, result.get("world"));
        assertEquals(1, result.get("everyone"));
    }
}
