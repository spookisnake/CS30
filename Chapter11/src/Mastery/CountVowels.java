package Mastery;

import java.io.*;
import java.util.Scanner;

public class CountVowels 
{

	public static void main(String[] args) 
	{
		File textFile;
	    FileReader in;
	    BufferedReader readFile;
	    
	    String fileName;
	    String lineInFile, lowercaseText, letter;
	    
	    int vowelSum = 0;
	       
	    Scanner input = new Scanner(System.in);

	    /* prompt the user for the name of the file */
	    System.out.println("Enter the file name: ");
	    fileName = input.next();
	    
	    /* count the vowels in the file */
	    try 
	    {
             textFile = new File(fileName);
	         in = new FileReader(textFile);
	         readFile = new BufferedReader(in);

	         while ((lineInFile = readFile.readLine()) != null) 
	         {

	                lowercaseText = lineInFile.toLowerCase();

	                for (int i = 0; i < lowercaseText.length(); i++) 
	                {

	                    letter = lowercaseText.substring(i, i + 1);

	                    if (letter.equals("a") || letter.equals("e") ||
	                        letter.equals("i") || letter.equals("o") ||
	                        letter.equals("u")) 
	                    {

	                        vowelSum++;
	                }
	          }
	    }
	    System.out.println("Number of vowels: " + vowelSum);

	    readFile.close();
	    in.close();

		} 
		catch(FileNotFoundException e) 
		{	
			System.out.println("File not found. ");
			System.err.println("IOException: " + e.getMessage());
		} 
	    catch(IOException e) 
		{
			System.out.println("Problem reading the file.");
			System.err.println("IOException: " + e.getMessage());
		}

	}

}
