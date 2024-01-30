import org.example.entity.Hangman;
import org.example.entity.WordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HangmanTest {

    @Mock
    private WordGenerator wordGenerator;
    private Hangman hangman;

    @BeforeEach
    void setUp() {
        Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        hangman = new Hangman(wordGenerator);
        hangman.makeMask();
    }

    @Test
    void testConvertWordToMask() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        //hangman.makeMask();
        Assertions.assertEquals("______", hangman.getMask());
    }
    @Test
    void testTryCharWithCorrectChar() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        boolean result = hangman.tryChar('g');
        Assertions.assertTrue(result);
    }
    @Test
    void testTryCharWithWrongChar() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        boolean result = hangman.tryChar('t');
        Assertions.assertFalse(result);
    }
    @Test
    void testUpdateMaskWithCorrectChar() {
        hangman.tryChar('g');
        Assertions.assertEquals("g__g__", hangman.getMask());
    }
    @Test
    void testUpdateMaskWithWrongChar() {
        hangman.tryChar('t');
        Assertions.assertEquals("______", hangman.getMask());
    }
}
