package tiffit.realmrpg.commands;

import java.util.List;

import net.dv8tion.jda.core.entities.User;
import tiffit.realmrpg.data.PlayerData;

public class CharacterSelectCommand extends Command{

	@Override
	public String getCommand() {
		return "selchar";
	}

	@Override
	public String performCommand(User user, List<User> mentions, String[] args) {
		PlayerData data = PlayerData.getData(user.getId());
		return "You have **" + data.char_slots + "** character slots!";
	}

}
