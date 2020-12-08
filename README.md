# CommandManager
A tool to help register commands using the bukkit api.

## What it does
CommandManager gives you the ability to register commands without even touching plugin.yml

## How it does it 
CommandManager makes use of reflection and adds the SubCommand to the server's command map


## How To Use

In the onEnable function create an instance of the CommandManager like so
```java

private static CommandManager commandManager;

@Override
public void onEnable(){
  commandManager = new CommandManager(this);
}
```

Create a command! Make a new class that extends SubCommand and then add some code!
```java
public class CoolCommand extends SubCommand {
    protected CoolCommand(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        sender.sendMessage("This is cool!");
        return false;
    }
}
```

Finally, register the command.
```java

private static CommandManager commandManager;

@Override
public void onEnable(){
  commandManager = new CommandManager(this);
  commandManager.registerCommand(new CoolCommand("cool"));
}
```
