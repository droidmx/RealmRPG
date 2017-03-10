package tiffit.realmrpg;

import java.util.ArrayList;
import java.util.List;

import net.dv8tion.jda.core.entities.User;

public abstract class Command {
	protected StringBuilder builder;

	public Command() {
	}

	public abstract String getCommand();

	public static List<Command> commands = new ArrayList<Command>();

	public abstract String performCommand(User user, List<User> mentions, String[] args);

	public String getUsage() {
		return "rpg_" + getCommand();
	}

	public boolean formatted() {
		return true;
	}

	public boolean isAcceptable(String command) {
		return command.equals(getCommand());
	}

	public static void RegisterCommands() {
	}

	protected void createBuilder() {
		builder = new StringBuilder();
	}

	protected void append(String string) {
		builder.append(string + "\n");
	}

	public boolean isHidden() {
		return false;
	}
}
