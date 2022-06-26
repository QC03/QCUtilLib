package com.github.QCUtilLib.Message;

import org.bukkit.entity.Player;

public class ErrorMessage {

	private static String getErrorPrefix() {
		
		return "&4&l[ ! ] &f";
	}
	
	public static void sendError(Player p, String Message) {
		
		p.sendMessage(getErrorPrefix() + Message);
	}
}
