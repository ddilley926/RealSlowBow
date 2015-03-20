package com.dustindilley.Quiz;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Debug extends JavaPlugin{

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("Heal")){
			Player penis = (Player) sender;
			penis.setHealth(20);
			penis.setHunger(20);
			penis.sendMessage(ChatColor.GOLD + "You have been fully healed.");
			
		}
		
		
				return false;
}

}