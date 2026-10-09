package Skillbuilders;

import java.io.*;

public class StatsP1 
{

	public static void main(String[] args) 
	{
		File dataFile = new File("scores.dat");
		FileReader in;
		BufferedReader readFile;
		String score;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		
		try 
		{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			while((score = readFile.readLine()) != null ) 
			{
				numScores += 1;
				System.out.println(score);
				totalScores += Double.parseDouble(score);
			}
		
		avgScore = totalScores / numScores;
		System.out.println("Average = " + avgScore);
		readFile.close();
		in.close();
		} 
		//Display error if the file doesn't exist
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist");
			System.err.println("FileNotFoundException: "
					+ e.getMessage());
		}
		//Display if file is corrupted
		catch (IOException e) 
		{
			System.out.println("Problem Reading File");
			System.err.println("IOException " + e.getMessage());
		}
		
	}

}
