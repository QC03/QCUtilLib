package com.github.QCUtilLib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.QCUtilLib.Info.DB_Connection;
import com.github.QCUtilLib.Info.onFirstJoin;

public class Main extends JavaPlugin implements Listener {
	
	ConsoleCommandSender console = Bukkit.getConsoleSender();
	
	@Override
	public void onEnable() {
		
		console.sendMessage( ChatColor.AQUA + "[QCUtilLib] Enable Plugin.");
		
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new onFirstJoin(this), this);
		
		DB_Connection.createDatabase();
		
	}
	
	@Override
	public void onDisable() {
		
		console.sendMessage( ChatColor.AQUA + "[QCUtilLib] Disable Plugin.");
		
	}
	
}