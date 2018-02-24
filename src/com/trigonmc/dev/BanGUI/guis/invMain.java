package com.trigonmc.development.BanGUI.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class invMain implements Listener {
	
	 public static Inventory myInventory = Bukkit.createInventory(null, 18, "" + ChatColor.DARK_PURPLE + ChatColor.BOLD + ("Punishments GUI"));
	 
	 static {
		 
		 //Ban Control Item
		 ItemStack banItem = new ItemStack(Material.BEDROCK, 1);
	     ItemMeta banItemMeta = banItem.getItemMeta();
	     banItemMeta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Ban");
	     banItem.setItemMeta(banItemMeta);
	     myInventory.setItem(1, banItem);
	     
	     //Warn Control Item	     
	     ItemStack warnItem = new ItemStack(Material.RAW_FISH, 1);
	     ItemMeta warnItemMeta = warnItem.getItemMeta();
	     warnItemMeta.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + "Warn");
	     warnItem.setItemMeta(warnItemMeta);
	     myInventory.setItem(3, warnItem);
	     
	     //Mute Control Item
	     ItemStack muteItem = new ItemStack(Material.BARRIER, 1);
	     ItemMeta muteItemMeta = muteItem.getItemMeta();
	     muteItemMeta.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Mute");
	     muteItem.setItemMeta(muteItemMeta);
	     myInventory.setItem(5, muteItem);
	     
	     //Kick Control Item
	     ItemStack kickItem = new ItemStack(Material.DIAMOND_BOOTS, 1);
	     ItemMeta kickItemMeta = kickItem.getItemMeta();
	     kickItemMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "Kick");
	     kickItem.setItemMeta(kickItemMeta);
	     myInventory.setItem(7, kickItem);
	     
	     //Reports List Item
	     ItemStack reportsItem = new ItemStack(Material.EMPTY_MAP, 1);
	     ItemMeta reportsItemMeta = reportsItem.getItemMeta();
	     reportsItemMeta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Reports");
	     reportsItem.setItemMeta(reportsItemMeta);
	     myInventory.setItem(11, reportsItem);
	     
	     //History List Item
	     ItemStack historyItem = new ItemStack(Material.BOOK_AND_QUILL, 1);
	     ItemMeta historyItemMeta = historyItem.getItemMeta();
	     historyItemMeta.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "History");
	     historyItem.setItemMeta(historyItemMeta);
	     myInventory.setItem(13, historyItem);
	     
	     //Appeals List Item
	     ItemStack appealsItem = new ItemStack(Material.PAPER);
	     ItemMeta appealsItemMeta = appealsItem.getItemMeta();
	     appealsItemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + "Appeals");
	     appealsItem.setItemMeta(appealsItemMeta);
	     myInventory.setItem(15, appealsItem);
	     
	     //Staff Head Item
	     ItemStack staffItem = new ItemStack(Material.SKULL_ITEM, 1);
	     ItemMeta staffItemMeta = staffItem.getItemMeta();
	     staffItemMeta.setDisplayName("" + ChatColor.GRAY + Bukkit.getPlayerExact("playerName"));
	     staffItem.setItemMeta(staffItemMeta);
	     myInventory.setItem(17, staffItem);
	 }

}
