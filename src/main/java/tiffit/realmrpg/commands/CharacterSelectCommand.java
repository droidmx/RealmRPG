package tiffit.realmrpg.commands;

import java.util.List;
import tiffit.realmrpg.data.Character;
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
		String retstr = "";
		int empty_slots = data.char_slots - data.chars.size();
		for(Character chr : data.chars){
			retstr += "```";
			retstr += "Level " + chr.getLevel() + " " + chr.clss.toString() + " - ";
			retstr += ((chr.getLevel() != 20) ?
					(chr.getExpThisLevel() + "/" + Character.expThisLevel(chr.getLevel()) + " Experience") :
					(chr.getFame() + " Fame"));
			retstr += "```";
		}
		for(int i = 0; i < empty_slots; i++){
			retstr += "```";
			retstr += "Empty Char Slot " + (data.chars.size() + i + 1);
			retstr += "```";
		}
		return retstr;
	}

}
