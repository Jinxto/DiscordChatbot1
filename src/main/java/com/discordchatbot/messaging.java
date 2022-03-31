package com.discordchatbot;



import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class messaging extends ListenerAdapter {
 @Override
 public void onMessageReceived(MessageReceivedEvent event){

	 if(!event.getAuthor().equals(event.getJDA().getSelfUser()) && event.getChannel().getId().equals("958967578758356993")) {
		 MessageChannel channel = event.getChannel();
		 String message = event.getMessage().getContentRaw();
		 if(!message.isEmpty() && !message.equals("")) {
			/* Runnable r = new MyRunnable(message,channel);
			 new Thread(r).start(); */
			 bot ai = new bot();
			 channel.sendMessage(ai.run(message)).queue();
					           
				 
			   
			   
		 }
		 
		 
		 
	 }
 }

}
