package com.github.QCUtilLib.Info;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.github.QCUtilLib.Main;

public class onFirstJoin implements Listener {

	public onFirstJoin(Main plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
	  
		// if (event.getPlayer().hasPlayedBefore()) { return; }
		
		String uuid = event.getPlayer().getUniqueId().toString();
		String name = event.getPlayer().getName();
		
		InfoDatabase.addUserInfo(name, uuid);
	}
}
