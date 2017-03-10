package tiffit.realmrpg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game.GameType;
import net.dv8tion.jda.core.entities.impl.GameImpl;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.EventListener;

public class RealmRPG implements EventListener {
	
	public static JDA jda;

	public RealmRPG() {

	}

	public static void main(String[] args) {
		try {
			Command.RegisterCommands();
			BufferedReader reader = new BufferedReader(new FileReader(new File("./token.secret")));
			jda = new JDABuilder(AccountType.BOT).setToken(reader.readLine()).addListener(new RealmRPG()).buildBlocking();
			reader.close();
			jda.addEventListener(new MessageListener());
			jda.getPresence().setGame(new GameImpl("Realm of the Mad God", null, GameType.DEFAULT));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onEvent(Event event) {
		if ((event instanceof ReadyEvent)) {
			ReadyEvent ready = (ReadyEvent) event;
			System.out.println("API is ready!");
		}
	}
}
