package tiffit.realmrpg.commands;

import java.util.ArrayList;
import java.util.List;

import net.dv8tion.jda.core.entities.User;

public abstract class Command {

	public static void RegisterCommands() {
		commands.add(new CharacterSelectCommand());
		commands.add(new CharacterCreateCommand());
	}

	public abstract String getCommand();

	public static List<Command> commands = new ArrayList<Command>();

	public abstract String performCommand(User user, List<User> mentions, String[] args);

	public String getUsage() {
		return "rpg_" + getCommand();
	}
	
	public boolean isAcceptable(String command) {
		return command.equals(getCommand());
	}

	public boolean isHidden() {
		return false;
	}
}
