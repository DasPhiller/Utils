package de.philgamer.utils.discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.EventListener;

import javax.security.auth.login.LoginException;

public class DiscordMain  {
    //implements EventListener
    private static DiscordMain BOT;
    private static JDA jda;

    public DiscordMain(String token) throws LoginException, IllegalArgumentException {
        BOT = this;

        JDABuilder builder = JDABuilder.createDefault("token");
        builder.setActivity(Activity.playing("yeah"));
      /*  builder.addEventListeners(new MessageListener());
        builder.addEventListeners(new UserListener());

        addServerCommand("id", new ChannelIDServerCommand());
        addServerCommand("status", new StatusServerCommand());
*/

        jda = builder.build();
    }

    public static JDA getJda() {
        return jda;
    }

    public static void main(String[] args) {

        try {
            new DiscordMain(args[0]);
        } catch (LoginException exception) {
            exception.printStackTrace();
        }

    }

    public static DiscordMain getBOT() {
        return BOT;
    }

}

