package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    @Test
    public void testHangManInputWord_1_word() throws Exception{

        Hangman testHangMan = new Hangman();
        List<String> testHangmanArray = new ArrayList<String>();

        String expectedOutput = "turtle";

        assertEquals(expectedOutput, testHangMan.testWord("turtle"));
    }

    @Test
    public void testHangManReplaceWithDashes_dash() throws Exception{

        Hangman testHangMan = new Hangman();
        List<String> testHangmanArray = new ArrayList<String>();


        String expectedOutput = "------";

        assertEquals(expectedOutput, testHangMan.insertDash("turtle"));
    }



    @Test
    public void testHangManInputWord_3_Threewords() throws Exception{

        Hangman testHangMan = new Hangman();
        List<String> testHangmanArray = new ArrayList<String>();
        List<String> expectedOutputArray = new ArrayList<String>();

         expectedOutputArray.add("turtle");
         expectedOutputArray.add("bumblebee");
         expectedOutputArray.add("keyboard");

        assertEquals(expectedOutputArray, testHangMan.testThreeWords("turtle" , "bumblebee" , "keyboard"));
    }

    @Test
    public void testHangManGetRandomWord() throws Exception {

        Hangman testHangMan = new Hangman();
        Random myRandomGenerator = new Random();
        List<String> testHangmanArray = new ArrayList<String>();
        testHangmanArray.add("turtle");
        testHangmanArray.add("bumblebee");
        testHangmanArray.add("keyboard");
        String expectedOutput = "turtle";

        String randomWord = testHangMan.getRandomWord("turtle","bumblebee","keyboard");

        assertEquals(expectedOutput, randomWord);
    }
}