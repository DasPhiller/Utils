package de.philgamer.utils.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class StringUtils {
    public String prefix = "§7| §f§lUtils §7x ";
    public void sendNoPermstoPlayer(Player player) {
        player.sendMessage(prefix + ChatColor.RED + "Dazu hast du keine Rechte!");
    }
    public void sendPlayerMessage(String message, Player player) {
        player.sendMessage(prefix + message);
    }
}
