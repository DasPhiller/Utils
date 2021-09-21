package de.philgamer.utils.listener;

import de.philgamer.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(Utils.getStringUtils().prefix + ChatColor.GREEN + event.getPlayer().getName() + ChatColor.GRAY + " Hat den Server betreten");
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        event.setQuitMessage(Utils.getStringUtils().prefix + ChatColor.RED + event.getPlayer().getName() + ChatColor.GRAY + " Hat den Server verlassen");
    }
}
