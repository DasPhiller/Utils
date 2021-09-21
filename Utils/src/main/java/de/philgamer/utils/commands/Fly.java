package de.philgamer.utils.commands;

import de.philgamer.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player player = (Player) sender;
        if (player.isOp()) {
            if (player.isFlying()) {
                player.setFlying(false);
                player.setAllowFlight(false);
                Utils.getStringUtils().sendPlayerMessage("Du kannst nun nicht mehr fliegen!", player);
            } else {
                player.setFlying(true);
                player.setAllowFlight(true);
                Utils.getStringUtils().sendPlayerMessage("Du kannst nun fliegen!", player);
            }
        } else {
            Utils.getStringUtils().sendNoPermstoPlayer(player);
        }
        return false;
    }
}
