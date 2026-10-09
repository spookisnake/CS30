package Skillbuilders;

import java.io.*;
import java.util.Scanner;

public class MyFileP1 
{

	public static void main(String[] args) 
	{
		//Do Not use scanner to access files
		File textFile;
		String fileName;
		Scanner input = new Scanner(System.in);
		
		//Obtain file name from user
		System.out.println("Enter file name: ");
		
		//Store file name in fileName
		fileName = input.next();
		
		//Determine if file exists or not
		textFile = new File(fileName);
		
		if (textFile.exists()) 
		{
			System.out.println("File Exists.");
		}
		else 
		{
			System.out.println("File does NOT exist.");
		}
		
		
		
	}

}
