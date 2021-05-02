package com.vam.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileLoaderDemo
{

	public static void main(String[] args)
	{
		try
		{
		writeToFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			readFromFile();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void readFromFile() throws FileNotFoundException,IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("Info.psv"));
		while(br.readLine()!=null)
		{
			List<String> infoList = new ArrayList<>();
			infoList.add(br.readLine());
			
			System.out.println(infoList);
			
		}
		
		br.close();
	}

	private static void writeToFile() throws Exception
	{
		FileWriter fw = new FileWriter(new File("Info.psv"));
		PrintWriter pw = new PrintWriter(fw);
		for(int i =0;i<=100;i++)
		{
			pw.print(i);
			if(i%4==0)
			{
				pw.println("");
				pw.flush();
			}
		}
		pw.close();		
	}

}
