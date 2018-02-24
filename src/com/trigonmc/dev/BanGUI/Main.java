package com.trigonmc.development.BanGUI;

import java.util.logging.Logger;

import com.trigonmc.dev.BanGUI.commands.Punish;
import com.trigonmc.dev.BanGUI.commands.PlayerList;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		this.getCommand("punish").setExecutor((CommandExecutor)new Punish());		
		this.getCommand("playerlist").setExecutor((CommandExecutor)new PlayerList());
		
		logger.info(pdfFile.getName() + " [V. " + pdfFile.getVersion() + "] has been enabled!");
	}

}
