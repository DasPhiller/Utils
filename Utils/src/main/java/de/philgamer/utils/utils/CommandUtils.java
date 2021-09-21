package de.philgamer.utils.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandUtils {

    public static void senderP(CommandSender sender) {
        if (sender instanceof Player) {
            return;
        }
    }
}
