package Skillbuilders;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Roster 
{

	public static void main(String[] args)
	{
		File dataFile;
		
		FileReader in;
		BufferedReader readFile;
		
		FileWriter out;
		BufferedWriter writeFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName;
		String firstName, lastName;
		
		int numStu;
		
		
		//Write data to a file
		
		System.out.println("Enter File name: ");
		fileName = input.next();
		
		System.out.println("How many students? ");
		numStu = input.nextInt();
		
		try 
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for(int i=0; i < numStu; i++) 
			{
				System.out.println("Enter first name: ");
				firstName = input.next();
				
				System.out.println("Enter last name: ");
				lastName = input.next();
				
				writeFile.write(firstName);
				writeFile.newLine();
				writeFile.write(lastName);
				writeFile.newLine();
				
			}//end for loop
			writeFile.close();
			out.close();
			System.out.println("Data written to file. ");
		}
		catch(IOException e) 
		{
			System.out.println("Problem reading the file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}

}
