package me.Kittenlover.Template;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	Server server;
	MainListener listener;
	
	/// Runs when yes. Executed when the plugin is loaded
	@Override
	public void onEnable() {
		// This class is responsible for listening to all the events around, modify it
		listener = new MainListener();
		// This is your server instance, just caches
		server = getServer();
		server.getPluginManager().registerEvents(listener, this);
	}
	
	/// What a surprise, runs when plugin is unloaded
	@Override
	public void onDisable() {
		// Cleanup stuff here
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// Usually commands are sent by player, but there is console and command blocks
		Player player = null;
		if(sender instanceof Player) 
			player = (Player)sender;
		
		if(label.equals("sample")) {
			sender.sendMessage("This is a sample command, doesn't do anything. At all. Empty. Placeholder. Boilerplate. None. Null. Nil. Void. Absence. Silence. What did you expect? Fireworks?");
		}
		
		return false;
	}
}
