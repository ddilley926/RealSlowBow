package com.dustindilley.KitPvP;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{






public void onEnable(){
	
	commands();
	
	
	
}

public void commands(){
	getCommand("Standard").setExecutor(new Standard ());
	
}

}








