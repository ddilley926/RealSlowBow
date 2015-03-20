package com.dustindilley.Quiz;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Debug extends JavaPlugin{

	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("hello"))	{
			p.sendMessage(ChatColor.red + (hi));
		}
	
}
