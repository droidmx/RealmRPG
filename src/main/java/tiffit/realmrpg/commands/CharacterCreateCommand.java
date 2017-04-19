package tiffit.realmrpg.commands;

import java.util.List;
import tiffit.realmrpg.data.Character;
import tiffit.realmrpg.data.Character.ClassEnum;
import net.dv8tion.jda.core.entities.User;
import tiffit.realmrpg.data.PlayerData;

public class CharacterCreateCommand extends Command {

	@Override
	public String getCommand() {
		return "makechar";
	}

	@Override
	public String performCommand(User user, List<User> mentions, String[] args) {
		PlayerData data = PlayerData.getData(user.getId());
		String retstr = "";
		int empty_slots = data.char_slots - data.chars.size();
		
        if (empty_slots == 0) {
            retstr = "You have no open character slots!";
        } else {
            if (args.length >= 1) {
                ClassEnum clss;
                try {
                    clss = ClassEnum.valueOf(args[0]);
                    data.chars.add(new Character(clss));
                    data.save();
                    retstr = "Created a new " + args[0] + "!";
                catch (IllegalArgumentException e) {
                    retstr = "Please enter a valid class!";
                }
            } else {
                retStr = "To create a character, use `rpg_create [class]`!";
            }
        }
		return retstr;
	}

}
