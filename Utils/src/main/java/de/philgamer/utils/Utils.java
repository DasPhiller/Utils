package de.philgamer.utils;

import de.philgamer.utils.listener.ConnectionListener;
import de.philgamer.utils.utils.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Utils extends JavaPlugin {

    public static de.philgamer.utils.utils.StringUtils stringUtils;

    @Override
    public void onEnable() {
        PluginManager manager = (PluginManager) Bukkit.getPluginManager();
        stringUtils = new de.philgamer.utils.utils.StringUtils();
        manager.registerEvents(new ConnectionListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static StringUtils getStringUtils() {
        return stringUtils;
    }
}
