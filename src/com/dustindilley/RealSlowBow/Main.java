package com.dustindilley.RealSlowBow;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	
public void events(){
	
	PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(new Events(), this);
	
	
}
	
}
