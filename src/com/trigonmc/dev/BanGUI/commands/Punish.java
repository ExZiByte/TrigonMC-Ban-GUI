package com.trigonmc.dev.BanGUI.commands;

import com.trigonmc.dev.BanGUI.guis.invMain;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Punish implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Invalid Command User! You must be a player to use this command!");
			return false;
		}
		
		Player player = (Player) sender;
		player.openInventory(invMain.myInventory);
		return true;
	}

}
