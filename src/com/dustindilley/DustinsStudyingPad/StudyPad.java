package com.dustindilley.DustinsStudyingPad;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StudyPad {





	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
	if(cmd.getName().equalsIgnoreCase("speak")){
		
	
	
		Player p = (Player) sender;
		p.sendMessage(ChatColor.LIGHT_PURPLE + "Hello");
		
	
		
	}
	return false;

	}

	
}	
	
	
	
	
	
	