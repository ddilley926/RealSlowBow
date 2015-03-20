package com.dustindilley.KitPvP.kits;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.dustindilley.KitPvP.Main;

public class Knight implements CommandExecutor{
	public Main plugin;
	public Knight(Main instance){
	plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		if(cmd.getName().equalsIgnoreCase("Knight")){
			
			Player p = (Player) sender;
			p.sendMessage(ChatColor.RED + "You have recieved the Knight kit!");
			
			
			
			
			
		}
		
		
		
		return false;
	}
	

	
}
