package de.philgamer.utils;

import de.philgamer.utils.commands.Fly;
import de.philgamer.utils.commands.Help;
import de.philgamer.utils.listener.ConnectionListener;
import de.philgamer.utils.utils.CommandUtils;
import de.philgamer.utils.utils.StringUtils;
import net.dv8tion.jda.api.JDA;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Utils extends JavaPlugin {

    public static de.philgamer.utils.utils.StringUtils stringUtils;

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(
                "#     # ####### ### #        #####  \n" +
                "#     #    #     #  #       #     # \n" +
                "#     #    #     #  #       #       \n" +
                "#     #    #     #  #        #####  \n" +
                "#     #    #     #  #             # \n" +
                "#     #    #     #  #       #     # \n" +
                " #####     #    ### #######  ##### " + "\n" + "Plugin/Bukkit version" + Bukkit.getVersion() + "Minecraft Version: " +
                        Bukkit.getMinecraftVersion());
        PluginManager manager = (PluginManager) Bukkit.getPluginManager();
        stringUtils = new de.philgamer.utils.utils.StringUtils();
        manager.registerEvents(new ConnectionListener(), this);
        this.getCommand("fly").setExecutor(new Fly());
        this.getCommand("help").setExecutor(new Help());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static StringUtils getStringUtils() {
        return stringUtils;
    }


}
