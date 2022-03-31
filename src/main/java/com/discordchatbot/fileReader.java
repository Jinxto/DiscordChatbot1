package com.discordchatbot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
	public String readToken(String filepath) throws IOException {
		File file = new File(filepath);
		System.out.println("gettingfile");
		try {
 	        FileReader reader1 = new FileReader(file);
 	        BufferedReader reader = new BufferedReader(reader1);
			String content = "";
			String temp = "";
			
			while((temp = reader.readLine())!=null) {
				content =temp;
			}
			reader.close();
			return content;
	
		    } catch (FileNotFoundException e) {
		     System.out.println("File doesn't exists or no token provided!");
 			e.printStackTrace();
 			return null;
		}
		
	}

}
