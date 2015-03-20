
	package com.dustindilley.HealingPlugin;

	import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

	public class Main extends JavaPlugin{


	public void onEnable(){
		}


	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
	
		if(cmd.getName().equalsIgnoreCase("speak")){
		Player p = (Player) sender;
		
		p.setHealth(20);	
		}
		return false;
		
		
		}




}
