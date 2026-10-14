package Skillbuilders;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class StatsP2 
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
		String stuName, score;
		
		int numStu;
		int numScores = 0;
		
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
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
				System.out.println("Enter student name: ");
				stuName = input.next();
				
				System.out.println("Enter test score: ");
				score = input.next();
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(score);
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
		
		
		//Read data from file and process
		try 
		{
			dataFile = new File(fileName);
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			while ((stuName = readFile.readLine()) != null ) 
			{
				score = readFile.readLine();
				System.out.println(stuName + " " + score);
				
				numScores += 1;
				
				scoreValue = Double.parseDouble(score);
				
				totalScores += scoreValue;
				if (scoreValue < lowScore) 
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore) 
				{
					highScore = scoreValue;
				}
				
			}//end of while
			
			avgScore = totalScores / numScores;
			System.out.println("Low score = " + percent.format(lowScore/100));
			System.out.println("High score = " + percent.format(highScore/100));
			System.out.println("Average score = " + percent.format(avgScore/100));
			
			readFile.close();
			in.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist or could not be found. ");
			System.err.println("IOException: " + e.getMessage());
		}
		catch(IOException e) 
		{
			System.out.println("Problem reading the file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}

}
