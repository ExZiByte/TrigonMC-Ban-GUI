package com.trigonmc.development.BanGUI.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class playerList implements Listener {
	
	public static void updInv() { 
        //Player Skull Items
        ItemStack skull = new ItemStack(Material.SKULL_ITEM,  (short) 1, (byte) SkullType.PLAYER.ordinal());
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        int i = 0;
     
        for (Player p : Bukkit.getOnlinePlayers()){
            meta.setOwner(p.getName());
            meta.setDisplayName(ChatColor.WHITE + p.getName());
            skull.setItemMeta(meta);
            myInventory.setItem(i, skull);
            i++;
        }
    return;
    }
	
	public static Inventory myInventory = Bukkit.createInventory(null, 54, "" + ChatColor.DARK_PURPLE + ChatColor.BOLD + ("Punishable Players List"));	
	
	static {
		//Previous Page Item
		ItemStack prevItem = new ItemStack(Material.STAINED_GLASS_PANE, 1);
		ItemMeta prevItemMeta = prevItem.getItemMeta();
		prevItem.setDurability((short)14);
		prevItemMeta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Previous Page");
		prevItem.setItemMeta(prevItemMeta);
		myInventory.setItem(45, prevItem);
		
		//Next Page Item
		ItemStack nextItem = new ItemStack(Material.STAINED_GLASS_PANE, 1);
		ItemMeta nextItemMeta = nextItem.getItemMeta();
		nextItem.setDurability((short)5);
		nextItemMeta.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + "Next Page");
		nextItem.setItemMeta(nextItemMeta);
		myInventory.setItem(53, nextItem);
	}

}
