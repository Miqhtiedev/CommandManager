package me.miqhtie.commandmanager;

import me.miqhtie.commandmanager.handlers.CommandHandler;
import me.miqhtie.commandmanager.utils.SubCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class CommandManager {
    private static CommandHandler cmdHandler;
    public static ArrayList<SubCommand> registeredCommands = new ArrayList<>();
    public static JavaPlugin plugin;


    public CommandManager(JavaPlugin plugin){
        cmdHandler = new CommandHandler();
        CommandManager.plugin = plugin;
    }


    public void registerCommand(SubCommand command){
        registeredCommands.add(command);
        cmdHandler.registerCommand(command);
    }

}
