package tiffit.realmrpg;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import tiffit.realmrpg.commands.Command;

public class MessageListener extends net.dv8tion.jda.core.hooks.ListenerAdapter {
	private static boolean MAINTAINANCE_MODE = false;

	public MessageListener() {
	}

	public void onMessageReceived(MessageReceivedEvent event) {
		Message message = event.getMessage();
		if (message.getContent().startsWith("rpg_")) {
			if ((MAINTAINANCE_MODE) && (!event.getGuild().getId().equals("256595164515008522"))) {
				message.getTextChannel()
						.sendMessage("```Sorry, but the bot is being updated. Please try again later!```").queue();
				return;
			}
			String[] words = message.getContent().split(" ");
			String commandStr = words[0].replace("rpg_", "");
			String[] args = new String[words.length - 1];
			System.arraycopy(words, 1, args, 0, args.length);
			for (Command command : Command.commands) {
				if (command.isAcceptable(commandStr)) {
					String reply = "";
					try {
						reply = command.performCommand(message.getAuthor(), message.getMentionedUsers(), args);
					} catch (Exception e) {
						reply = "An Error Occurred When Performing This Command!";
						e.printStackTrace();
					}
					if ((reply != null) && (!reply.equals(""))) {
						message.getTextChannel().sendMessage(reply).queue();
					}
				}
			}
		}
	}
}
