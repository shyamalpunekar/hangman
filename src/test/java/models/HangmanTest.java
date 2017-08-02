package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/2/17.
 */
public class HangmanTest {

    @Test
    public void testHangManInstanceOfGame_true() throws Exception{

        Hangman testHangMan = new Hangman();

        assertEquals(true, testHangMan instanceof Hangman);
    }

    @Test
    public void testHangManArrayOfWordsExists_true() throws Exception{

        Hangman testHangMan = new Hangman();
        List<String> testHangmanArray = new ArrayList<String>();

        assertEquals(true, testHangmanArray instanceof ArrayList);
    }


    @Test
    public void testHangManInputLetter_1_letter() throws Exception{

        Hangman testHangMan = new Hangman();
        List<Character> testHangmanArray = new ArrayList<Character>();

        char expectedOutput = 't';

        assertEquals(expectedOutput, testHangMan.testLetter('t'));
    }



}