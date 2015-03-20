package com.dustindilley.KitPvP.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.dustindilley.KitPvP.Main;

public class Archer implements CommandExecutor{
	public Main plugin;
	public Archer(Main instance){
	plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("Archer")){
			if(!plugin.Archer.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.Archer.add(p.getName());
					plugin.kitused.add(p.getName());
					
					
					
					
					//TODO FINISH ADDING THE ON DEATH EVENT IN THE EVENTS CLASS
				
			p.sendMessage(ChatColor.RED + "You have recieved the Archer kit!");
			
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
	}
		return false;
	}
}
