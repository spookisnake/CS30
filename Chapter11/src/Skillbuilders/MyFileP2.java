package Skillbuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFileP2 
{

	public static void main(String[] args) 
	{
		//Do Not use scanner to access files
		File textFile;
		String response;
		Scanner input = new Scanner(System.in);
		
		//Create a File
		textFile = new File("C:\\Users\\1100069235\\git\\CS30\\Chapter11\\src\\Skillbuilders\\zzz.txt");
		
		//Check if file exists
		if(textFile.exists()) 
		{
			System.out.println("zzz.txt exists");
		}
		else 
		{
			try {
				textFile.createNewFile();
				System.out.println("zzz.txt file created.");
			} 
			catch(IOException e) 
			{
				System.out.println("File could NOT be created.");
				System.err.println("IOException: " + e.getMessage());
			}
		}
		
		//Delete if user chooses to delete file
		System.out.println("Would you like to (K)eep or (D)elete the file? ");
		response = input.next();
		
		if(response.equals("D")) 
		{
			//Delete the file
			if(textFile.delete()) 
			{
				System.out.println("File has been Deleted");
			}
			
		}
		else 
		{
			System.out.println("File is kept");
		}
	}

}
