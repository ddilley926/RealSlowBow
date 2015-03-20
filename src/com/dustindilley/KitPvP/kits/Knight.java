package com.dustindilley.KitPvP.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.dustindilley.KitPvP.Main;

public class Knight implements CommandExecutor{
	public Main plugin;
	public Knight(Main instance){
	plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		Player p = (Player) sender;
	
		if(cmd.getName().equalsIgnoreCase("Knight")){
			
			if(!plugin.Knight.contains(p.getName())){
			//DUSTIN, REMEMBER THE IMAGINARY NOTEPADS THAT THE SERVER CREATES? THIS IS CHECKING IF THE PLAYER'S NAME IS ON THAT NOTEPAD.	
				
				if(!plugin.kitused.contains(p.getName())){
					//ITS CHECKING ON THIS ONE TOO.
					
					plugin.Knight.add(p.getName());
					//IF THEIR NAME IS NOT ON IT, THE PLUGIN IS ADDING THEM ONTO THE IMAGINARY NOTEPAD/
					
					plugin.kitused.add(p.getName());
					//SAME FOR THIS.
					
					
					
					//TODO FINISH ADDING THE ON DEATH EVENT IN THE EVENTS CLASS
				
			p.sendMessage(ChatColor.RED + "You have recieved the Knight kit!");
			
			p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
			p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
			p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
			
			
			
			
		}
		
		
		
	
	}else{
		p.sendMessage(ChatColor.RED + "You already have a kit!");
	}
	
	}else{
		p.sendMessage(ChatColor.RED + "You already have a kit!");
	}//IF THEIR NAME IS ALREADY ON THE LIST, IT'S GOING TO DENY THEM THE KIT.
		
		
		return false;
	}
}
