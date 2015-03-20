package com.dustindilley.Quiz;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldQuiz extends JavaPlugin{

	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	if(cmd.getName().equalsIgnoreCase("hello"))	{
		Player p = (Player) sender;
		p.sendMessage(ChatColor.RED + "Braden Smells");
		
			
	}
		
		return false;

		









	}
}
