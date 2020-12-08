package me.miqhtie.commandmanager.utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

public abstract class SubCommand extends BukkitCommand {

    protected SubCommand(String name) {
        super(name);
    }
}
