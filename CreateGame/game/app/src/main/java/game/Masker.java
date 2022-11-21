package game;

import java.util.ArrayList;

public class Masker {
    public String getMaskedWord(String word, ArrayList<Character> letters) {
        StringBuilder hidden_word = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (i ==0) {
                hidden_word.append(currentLetter);

            }else {
                if (letters.indexOf(currentLetter) != -1) {
                    hidden_word.append(currentLetter);
                
                }
                else {
                    hidden_word.append("_");
                }
            }

        }
        return hidden_word.toString();
    }
    
}