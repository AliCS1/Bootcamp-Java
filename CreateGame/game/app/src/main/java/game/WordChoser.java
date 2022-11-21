package game;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordChoser {
    public static final List<String> DICTIONARY = Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON");
    
    public String getRandomWordFromDictionary() {
        Random num = new Random();
        int RandomNum = num.nextInt(DICTIONARY.size());
        return DICTIONARY.get(RandomNum);

    }
}
