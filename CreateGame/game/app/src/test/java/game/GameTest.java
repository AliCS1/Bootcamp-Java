package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameTest {
    @Test public void testGetsWordToGuessWithRandomWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        String name = "Ali";
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChoser,name);
        assertEquals(game.GetWordToGuess(), "D________");
    }

    @Test public void testGetsInitialAttemptsAmount() {
        WordChoser mockedChoser = mock(WordChoser.class);
        String name = "Ali";
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser,name);
        assertEquals(game.getRemainingAttempts(),Integer.valueOf(10));
    }
    @Test public void testGuessLetter() {

        WordChoser mockedChoser = mock(WordChoser.class);

        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        String name = "Ali";
        Game game = new Game(mockedChoser,name);
        assertEquals(game.guessLetter('V'),true);
        assertEquals(game.guessLetter('Q'),false);


    }
    @Test public void guessIncorrectLetterCheckAttemptsAmount() {
        WordChoser mockedChoser = mock(WordChoser.class);
        String name = "Ali";
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKER");
        Game game = new Game(mockedChoser,name);
        assertEquals(game.guessLetter('Q'),false);
        assertEquals(game.getRemainingAttempts(),Integer.valueOf(9));

    }
    @Test public void correctGuessThengetWordToGuess() {
        WordChoser mockedChoser = mock(WordChoser.class);
        String name = "Ali";

        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser,name);
        assertEquals(game.guessLetter('V'),true);
        assertEquals(game.getRemainingAttempts(),Integer.valueOf(10));

        assertEquals(game.GetWordToGuess(), "D_V______");

    }
    @Test public void isGameLostMethod() {
        WordChoser mockedChoser = mock(WordChoser.class);
        String name = "Ali";

        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        Game game = new Game(mockedChoser,name);
        assertEquals(game.isGameLost(), false);
        game.guessLetter('G');
        assertEquals(game.isGameLost(), false);
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        assertEquals(game.isGameLost(), true);

    }
    @Test public void isGameWonMethod() {
        WordChoser mockedChoser = mock(WordChoser.class);
        String name = "Ali";

        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("CANDIES");
        Game game = new Game(mockedChoser,name);
        assertEquals(game.isGameWon(), false);
        game.guessLetter('A');
        assertEquals(game.isGameWon(), false);
        game.guessLetter('N');
        game.guessLetter('D');
        game.guessLetter('I');
        game.guessLetter('E');
        game.guessLetter('S');
        assertEquals(game.isGameWon(), true);

    }
}
