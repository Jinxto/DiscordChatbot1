package com.discordchatbot;

import java.io.IOException;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LoginException, IOException
    {
       fileReader reader = new fileReader();
       String token = reader.readToken("file.txt");
       if(token.equals("error") || token.equals(null)) {
    	   System.out.println("Please provide your token details!");
    	   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   return;
    			   
       }
       JDA jda = JDABuilder.createDefault(token).build();
       jda.addEventListener(new messaging());
    }
    
}
