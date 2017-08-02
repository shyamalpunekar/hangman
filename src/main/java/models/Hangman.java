package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Guest on 8/2/17.
 */
public class Hangman {


    public char testLetter(char inputChar){
        return inputChar;
    }

    public String testWord(String inputString){
        return inputString;
    }

    public String testSplitWord(String inputWord){

        inputWord.indexOf("");

        return "";

    }

    public String insertDash(String inputWord){

        List<String> dashArray = new ArrayList<String>();

        String[] inputArray = inputWord.split("");
        for(int i=0 ; i < inputArray.length ; i++){
            inputArray[i] = "-";
            dashArray.add(inputArray[i]);
        }
        String dashWord = String.join("", dashArray);
        return dashWord;
    }

    public List<String> testThreeWords(String inputWordOne , String inputWordTwo , String inputWordThree){


        List<String> wordList = new ArrayList<String>();
        wordList.add(inputWordOne);
        wordList.add(inputWordTwo);
        wordList.add(inputWordThree);

        return wordList;
    }

    public String getRandomWordAndEncrypt(String inputWordOne , String inputWordTwo , String inputWordThree){

        Random myRandomGenerator = new Random();
        List<String> wordList = new ArrayList<String>();
        wordList.add(inputWordOne);
        wordList.add(inputWordTwo);
        wordList.add(inputWordThree);

        String randomWord = wordList.get(myRandomGenerator.nextInt(3));

        List<String> dashArray = new ArrayList<String>();

        String[] inputArray = randomWord.split("");
        for(int i=0 ; i < inputArray.length ; i++){
            inputArray[i] = "-";
            dashArray.add(inputArray[i]);
        }
        String dashWord = String.join("", dashArray);


        String userGuess = "t";
        int guessIndexPosition = randomWord.indexOf(userGuess);
        if(guessIndexPosition >= 0){
            dashWord = dashWord.substring(0,guessIndexPosition) + userGuess + dashWord.substring(guessIndexPosition + 1);
        }

        return dashWord;
    }


    public String getRandomWordGuess(String inputWordOne , String inputLetter ){

        Random myRandomGenerator = new Random();

        List<String> dashArray = new ArrayList<String>();

        String[] inputArray = inputWordOne.split("");
        for(int i=0 ; i < inputArray.length ; i++){
            inputArray[i] = "-";
            dashArray.add(inputArray[i]);
        }
        String dashWord = String.join("", dashArray);

        int userGuessCount = 6;
        String userGuess = inputLetter;
        int guessIndexPosition = inputWordOne.indexOf(userGuess);
        if(guessIndexPosition >= 0) {
            dashWord = dashWord.substring(0, guessIndexPosition) + userGuess + dashWord.substring(guessIndexPosition + 1);
        } else if (guessIndexPosition < 0) {
            dashWord = dashWord;
            userGuessCount = userGuessCount - 1;
        }
        return dashWord;
    }


}
