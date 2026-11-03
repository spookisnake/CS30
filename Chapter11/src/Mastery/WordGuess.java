
package Mastery;

import java.io.*;
import java.util.*;

public class WordGuess 
{

    public static void main(String[] args) 
    {
    	final String FLAG = "!";
    	
        File dataFile;
        
        FileReader in;
        BufferedReader readFile;

        int randNum;
        int numWords = 0, wordToGuess;

        String secretWord = "";
        String wordSoFar = "", updatedWord = "";

        String letterGuess = "";
        int numGuesses = 0;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Select secret word

        try 
        {

            dataFile = new File("words.txt");
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);

            // Count words
            while (readFile.readLine() != null) 
            {
                numWords++;
            }

            readFile.close();

            // Pick random word
            if (numWords == 0) 
            {
                System.out.println("The file contains no words.");
                return;
            }
            wordToGuess = random.nextInt(numWords) +  1;

            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);

            for (int i = 1; i <= wordToGuess; i++) 
            {
                secretWord = readFile.readLine();
            }

            readFile.close();
            in.close();

        } 
        catch (IOException e) 
        {
            System.out.println("File error.");
            return;
        }

        // begin the game

        System.out.println("WordGuess game");

        for (int i = 0; i < secretWord.length(); i++) 
        {
            wordSoFar += "-";
        }

        System.out.println(wordSoFar);

        //allow user to make guesses

        do 
        {

            System.out.print("Guess a letter: ");
            letterGuess = input.nextLine();

            numGuesses++;

            for (int i = 0; i < secretWord.length(); i++) 
            {

                if (secretWord.charAt(i) == letterGuess.charAt(0)) 
                {

                    updatedWord = wordSoFar.substring(0, i)
                            + secretWord.charAt(i)
                            + wordSoFar.substring(i + 1);

                    wordSoFar = updatedWord;
                }
            }

            System.out.println(wordSoFar);

        } 
        while (!letterGuess.equals(FLAG) && !wordSoFar.equalsIgnoreCase(secretWord));

        if (wordSoFar.equalsIgnoreCase(secretWord)) 
        {
            System.out.println("You guessed the word!");
        } 
        else 
        {
            System.out.println("The word was: " + secretWord);
        }

        System.out.println("Number of guesses: " + numGuesses);

    }
}
