package models;

import java.util.ArrayList;
import java.util.List;

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
//        String[] dashArray = {};

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

}
