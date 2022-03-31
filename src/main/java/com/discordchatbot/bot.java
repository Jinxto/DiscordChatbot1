package com.discordchatbot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;


public class bot {
	public String run(String text){
		
		ProcessBuilder b = new ProcessBuilder("node", "cleverbot.js",text);
		System.out.println("Input : "+text);
		String output="";
		try {
			
			Process process = b.start();
			output = IOUtils.toString(process.getInputStream(), StandardCharsets.UTF_8);
			System.out.println("Output : "+output);
			
			return output;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error"; 		           
		
	}

}
