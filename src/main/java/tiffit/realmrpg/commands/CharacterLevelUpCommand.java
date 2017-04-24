package tiffit.realmrpg.commands;

import java.util.List;

import net.dv8tion.jda.core.entities.User;
import tiffit.realmrpg.data.Character;
import tiffit.realmrpg.data.PlayerData;
import tiffit.realmrpg.data.Character.ClassEnum;

//testing command - see if rolls work
public class CharacterLevelUpCommand extends Command {
	
	@Override
	public String getCommand() {
		return "lvlup";
	}

	@Override
	public String performCommand(User user, List<User> mentions, String[] args) {
		PlayerData data = PlayerData.getData(user.getId());
		String retstr = "";
		int charNum;
		Character c;
		
		try {
			charNum = Integer.parseInt(args[0]);
			c = data.chars.get(charNum-1);
			c.gainExp(Character.totalExpThisLevel(c.level) - c.getExpThisLevel());
			data.save();
			retstr = "Successfully raised your " + c.clss + " to Level " + c.level + "!";
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			retstr = "Please enter a valid slot number!";
		}
        
		return retstr;
	}
	
}
