package com.dustindilley.KitPvP;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Standard implements CommandExecutor{

	public Main instance;
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("Standard")){
			
		Player p = (Player) sender;
		p.getInventory().clear();
		p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
		p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		
		
		
		}
		
		
		return false;
		








	}










}
