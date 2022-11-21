package game;

import java.util.ArrayList;

public class Game {
    public String word;
    public Integer remaining_attempts = 10;
    public ArrayList<Character> guessed_letters = new ArrayList<Character>();
    public String player_name;

    public Game(WordChoser choser, String name) {
        word = choser.getRandomWordFromDictionary();
        player_name = name;
    }

    public String GetWordToGuess() {
        Masker mask = new Masker();
        return mask.getMaskedWord(word, guessed_letters);
    }

    
    public Integer getRemainingAttempts() {
        return remaining_attempts;

    }

    public Boolean guessLetter(char character) {
        character = Character.toUpperCase(character);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                guessed_letters.add(character);
                return true;
            }
        }
        remaining_attempts -= 1;
        return false;
    }

    public Boolean isGameLost() {
        if (getRemainingAttempts() == 0) {
            return true;
        }
        return false;
    }

    public Boolean isGameWon() {
        for (int i = 1; i < word.length(); i++) {
            Character current_word = word.charAt(i);
            if (guessed_letters.indexOf(current_word) == -1) {
                return false;
            }
        }
        return true;
    }
    
    public String getName() {
        return player_name;
    }
}
